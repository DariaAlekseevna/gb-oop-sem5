package org.example;
public class Main {
    public static void main(String[] args) {

        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("fly - flyy");
            }
        };
        Flyable flyable1 = new Flyable() {
            @Override
            public void fly() {
                System.out.println("bzz-bzzzz");
            }
        };
        System.out.println(flyable.getClass().getName());
        flyable.fly();
        System.out.println(flyable1.getClass().getName());
        flyable1.fly();

        // org.example.Main$1 implements Flyable
        // @override
        // по сути создается не объект flyable, а Main flyable = new Main(); - а объект экземпляра мейн
        // почему это неплохо? потому что для каждого действия кнопки(их много) делать свою реализацию?
        // чтобы не плодить много схожих небольших классов
    }
}