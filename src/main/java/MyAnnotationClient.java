import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyAnnotationClient {

    public int get123Annotation() throws NoSuchMethodException {
        Class<MyAnnotationClient> clazz = MyAnnotationClient.class;

        Method method = clazz.getMethod("test123");

        MyAnnotation annotation = method.getDeclaredAnnotation(MyAnnotation.class);
        return annotation.value();
    }

    @MyAnnotation(123)
    public void test123() {
        System.out.println("test123");
    }

    @MyAnnotation
    public void test() {
        System.out.println("test");
    }

    public int getAnnotation() throws NoSuchMethodException {
        Class<MyAnnotationClient> clazz = MyAnnotationClient.class;

        Method method = clazz.getMethod("test");

        MyAnnotation annotation = method.getDeclaredAnnotation(MyAnnotation.class);
        return annotation.value();
    }
}
