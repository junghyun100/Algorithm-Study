package Static;

/**
 * static 에 대해서 알아보자
 */
public class Main {


    /**
     * static이란?
     *
     * Statictest에는 static 메서드가 포함되어 있다.
     * static으로 선언된 메서드는 인스턴스를 생성하지 않고 클래스로 직접 접근한다.
     * java8 이전에는  permanent에 할당되서 GC에 의해 수거되지 않않
     * java8 이후에는 힙영역의 Metaspace로 이동하면서 최대한 GC가 되도록 함법
     *
     * 스태틱 키워드는 클래스 이름으로만 접근이 가능한줄 알았다.
     * 하지만, 인스턴스 변수를 통해서도 static에 접근이 가능했다.
     *
     * 1.클래스 이름으로 바로 접근하는 방법
     * 2.인스턴스를 변수를 만들고 인스턴스 변수로 접근하는 방
     */
    public static void main(String [] args) {

        StaticTest staticTest = new StaticTest();
        staticTest.print();
        StaticTest.print();
    }
}
