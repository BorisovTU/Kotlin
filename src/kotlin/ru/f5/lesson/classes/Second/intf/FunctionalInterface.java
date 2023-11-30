package ru.f5.lesson.classes.Second.intf;


@java.lang.FunctionalInterface
public interface FunctionalInterface {
    void apply();

    default void test() {
        System.out.println("hello from interface");
        apply();
        System.out.println("goodbuy from interface");
    }
}
