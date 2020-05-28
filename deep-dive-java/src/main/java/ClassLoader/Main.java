package ClassLoader;

import com.sun.javafx.util.Logging;

import java.util.ArrayList;

/**
 * - 자바 프로그램은 한 개 혹은 그 이상의 클래스들의 조합으로 실행
 * - 모든 클래스 파일들이 한 번에 JVM에 로딩되지 않고 요청되는 순간 로딩된다.
 * - 클래스로더 : .class 바이트 코드를 읽어 들여 class 객체를 생성하는 역할(요청될 때 파일로부터 읽어 메모리로 로딩하는 역할)
 * - classpath라는 환경변수에 등록된 디렉토리에 있는 모든 클래스들을 먼저 JVM에 로딩
 * - JVM에 로딩된 클래스만이 JVM에서 객체로 사용할 수 있다.
 * - 클래스 로딩은 로딩,링크,초기화 과정 거친다.
 *   - 로딩 : 클래스 파일을 바이트 코드로 읽어 메모리로 가져옴
 *   - 링크 : 읽어본 바이트 코드가 자바 규칙을 준수하는지 검증, 클래스에 정의된 필드,메소드,인터페이스들을 나타내는 데이터 구조를 준비하고 그 클래스가 참조하는 다른 클래스를 로딩
 *   - 초기화 : 슈퍼 클래스 및 정적 필드 초기기화
 */
public class Main {


    public static void main(String [] args) {

        Main m = new Main();
        try {
            m.printClassLoaders();
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 클래스로더들은 JRE(Javav Runtime Environment)에 포함된다.
     *
     *
     *
     * ApplicationClassLoader(SystemClassLoader)
     * - classpath에 포함된 클래스를 로드한다.
     * - 사용자는 시스템 클래스 로더가 로드하는 클래스 패스 영역에만 접근가능
     * - 이러한 이유때문에 로컬환경에서 외부라이브러리 실행시 클래스 패스를 지정해야 실행될 때가 있다.
     * - extensionClassLoader의 자식이다.
     * - classpath 환경변수에 있는 파일들을 로드한다.
     *
     * ExtensionClassLoader
     * - Object를 포함한 자바 API를 로드
     * - boot strap 로더의 자식이다.
     * - $JAVA_HOME/lib/ext 디렉토리를 로드한다.
     *
     * BootstrapClassLoader
     * - JVM 런타임 실행을 위해 기반이 되는 파일들을 로드한다.
     * - 부트스트랩 클래스로더는 네이티브 코드로 작성되어 있기때문에 콘솔에서 읽어지지 않는다.
     * - 자바의 클래스들은 java.lang.ClassLoader에 의해서 읽어진다. 클래스 로더는 누가 읽어들이는건가?
     * - 부트스트랩 클래스로더가 그 역할을 한다.
     * - 부스트트랩 클래스로더는 다른 클래스로더의 부모 역할을 한다.
     *
     *
     * 클래스 로더 동작과정
     *
     * JVM이 class를 요청하면 클래스로더는 클래스들을 런타임환경으로 읽어들인다.
     * java.lang.ClassLoader.loadClass() 메서드가 정의된 클래스를 런타임으로 읽어들인다.
     * 찾으려는 클래스가 런타임으로 읽어져 있지 않으면, 부모 클래스로더가 읽은 목록을 뒤진다. [부모 클래스에게 로딩 위]
     * 부모 클래스스로더가 읽어들인  클래스에서 찾지못했으면 자식클래스는 java.net.URLClassLoader.findClass()를 호출해서 파일시스템에 있는 클래스들을 스스로 찾는다.
     * 자식클래스로더도 찾지못했으면 java.lang.NoClassDefFoundError 나 java.lang.classNotFoundException에러를 뱉어낸다.
     */
    public void printClassLoaders() throws ClassNotFoundException {
        //ApplicationClassLoader
        System.out.println("Classloader of this class :" + Main.class.getClassLoader());
        //ExtensionClassLoader
        System.out.println("Classloader of Logging:" + Logging.class.getClassLoader());
        //BootstrapClassLoader(null)
        System.out.println("Classloader of ArrayList:" + ArrayList.class.getClassLoader());
    }
}
