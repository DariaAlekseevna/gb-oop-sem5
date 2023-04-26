package org.example;

/**
 * Занятие 5: От простого к практике.
 *
 * Задания на сегодня :
 *
 * 1) Рассмотреть вложенные(внутренние,анонимные) классы.
 *
 * 2) Спроектировать и разработать задачи со слайдов
 */

public class Outer {

    public Outer() {

    }

    static class Inner{
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public Inner() {
        }

        public void innerMethod(){
            System.out.println(innerValue);
//            System.out.println(outerValue);
//            outerMethod();
        }
    }

    public class InnerSec{
        int innerValueSec;

        public InnerSec(int innerValueSec) {
            this.innerValueSec = innerValueSec;
        }

        public InnerSec() {
        }

        public void innerSecMethod(){
            System.out.println(innerValueSec);
//            System.out.println(outerValue);
//            outerMethod();
        }
    }

    private Integer outerValue;

    public void outerMethod(){
        System.out.println(outerValue);
//        System.out.println(innerValue); не видит переменную внутреннего класса

    }

    public Outer(Integer outerValue) {
        this.outerValue = outerValue;
    }

    public static void main(String[] args) {
        // Inner inner = new Inner(10); // гапрямую может использоваться только во внешнем классе
        // нужно создать экземпляр внешнего класса и у него вызвать внутренний класс
        InnerSec inner1 = new Outer().new InnerSec(10); // так делаем для внутреннего класса
        Inner inner = new Inner(5); // так можно если класс inner static -
        // статич.методы можно вызывать откуда удобно
        inner1.innerSecMethod();
        Cat c1 = new Cat("meow");
        org.example.cat.Cat c2 = new org.example.cat.Cat("meow2"); // так делаем для пакетов

        class Vector{
            int x;
            int y;
            int z;

            public Vector(int x, int y, int z) {
                this.x = x;
                this.y = y;
                this.z = z;
            }
            Vector vector = new Vector(1, 2, 3);
        }
    }
}
