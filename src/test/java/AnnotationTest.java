import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnnotationTest {
    @Test
    public void アノテーションで指定した値を取得できること() throws NoSuchMethodException {
        MyAnnotationClient myAnnotationClient = new MyAnnotationClient();
        assertThat(myAnnotationClient.get123Annotation()).isEqualTo(123);
    }

    @Test
    public void アノテーションのデフォルト値を取得できること() throws Exception {
        MyAnnotationClient myAnnotationClient = new MyAnnotationClient();
        assertThat(myAnnotationClient.getAnnotation()).isEqualTo(1);
    }
}
