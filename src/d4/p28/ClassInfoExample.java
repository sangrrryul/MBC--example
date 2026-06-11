package d4.p28;

import d3.p25.Car;

public class ClassInfoExample {
    public static void main(String[] args) {
        Car car = new Car(100);
        Class clazz = car.getClass();
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getPackage().getName());
    }
}
