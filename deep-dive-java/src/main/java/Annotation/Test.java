package Annotation;

public class Test {

    @StringInjector("Annotation Test")
    private String name;

    @StringInjector
    private String defaultValue;

    public String getName() {
        return this.name;
    }
    public String getDefaultValue() {
        return this.defaultValue;
    }
}
