interface One {
    default void method() {
        System.out.println("One");
    }
}

interface Two {
    default void method() {
        System.out.println("One");
    }
}
public class Quiz implements One, Two{
        public void method() {
            Two.super.method();
    }
}
