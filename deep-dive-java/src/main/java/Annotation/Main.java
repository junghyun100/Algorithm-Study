package Annotation;

public class Main {


    public static void main(String [] args) throws IllegalAccessException, InstantiationException {
        ContextContainer c = new ContextContainer();
        Test test = c.get(Test.class);
        Test test2 = new Test();

        System.out.println(test.getName());
        System.out.println(test.getDefaultValue());

    }

}
