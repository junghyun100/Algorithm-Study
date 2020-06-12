import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class RoadLight {
    static int N, L;
    static ArrayList<Point> arrList = new ArrayList<>();
    static ArrayList<Point> tempList = new ArrayList<>();

    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int g = Integer.parseInt(st.nextToken());
            arrList.add(new Point(w, r, g));
            tempList.add(new Point(w, r, g));
        }

        int time = 0;
        int length = 0;
        int index = 0;
        while (length < L && index < N) {
            int next = arrList.get(index).where;
            int temp = length;
            for (int current = temp + 1; current <= next; current++) {
                for (int l = 0; l < arrList.size(); l++) {
                    if (arrList.get(l).isRed) {
                        if (arrList.get(l).red == 1) {
                            arrList.get(l).red = tempList.get(l).red;
                            arrList.get(l).isRed = false;
                        } else {
                            arrList.get(l).red--;
                        }
                    } else {
                        if (arrList.get(l).green == 1) {
                            arrList.get(l).green = tempList.get(l).green;
                            arrList.get(l).isRed = true;
                        } else {
                            arrList.get(l).green--;
                        }
                    }
                }
            }
            if (arrList.get(index).isRed) {
                int value = next - length;
                length += value;
                time += value;
                time += arrList.get(index).red;
                int iter = arrList.get(index).red;

                for (int i = 0; i < iter; i++) {
                    for (int j = 0; j < arrList.size(); j++) {
                        if (arrList.get(j).isRed) {
                            if (arrList.get(j).red == 1) {
                                arrList.get(j).red = tempList.get(j).red;
                                arrList.get(j).isRed = false;
                            } else {
                                arrList.get(j).red--;
                            }
                        } else {
                            if (arrList.get(j).green == 1) {
                                arrList.get(j).green = tempList.get(j).green;
                                arrList.get(j).isRed = true;
                            } else {
                                arrList.get(j).green--;
                            }
                        }
                    }
                }
            } else {
                int value = next - length;
                length += value;
                time += value;
            }
            index++;
        }
        time += (L - length);
        System.out.println(time);
    }

    public static class Point {
        int where;
        int red;
        int green;
        boolean isRed = true;

        public Point(int where, int red, int green) {
            this.where = where;
            this.red = red;
            this.green = green;
        }
    }
}