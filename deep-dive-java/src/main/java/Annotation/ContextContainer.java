package Annotation;

import java.lang.reflect.Field;

public class ContextContainer {

    public ContextContainer(){}


    private <T> T invokeAnnotations(T instance) throws IllegalAccessException {
        Field [] fields = instance.getClass().getDeclaredFields();
        for(Field field : fields) {
            StringInjector annotation = field.getAnnotation(StringInjector.class);
            if(annotation != null && field.getType() == String.class) {
                field.setAccessible(true);
                field.set(instance,annotation.value());
            }
        }

        return instance;
    }

    public <T> T get(Class clazz) throws IllegalAccessException,InstantiationException {
        T instance = (T) clazz.newInstance();
        instance = invokeAnnotations(instance);
        return instance;
    }
}
