package abcd;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
       //exemple2();
       exemple5();
    }

    private static void exemple3() {
        Car car3 = new Car("Lada", 190);
        Person pers = new Person("Vasya");
        car3.setDriver(pers);

        System.out.println(car3);
    }

    private static void exemple4() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myContext2.xml");

        Car car4 = context.getBean("car4", Car.class);
        System.out.println(car4);

        context.close();
    }

    private static void exemple5() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myContext3.xml");
        Car car5 = context.getBean("car5", Car.class);
        Car car6 = context.getBean("car6", Car.class);

        System.out.println(car5 + "  "+car6);
        System.out.println(car6.getDriver());

        context.close();
    }

    private static void exemple2() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myContext.xml");
        Car car2 = context.getBean("car2", Car.class);
        System.out.println(car2);
        context.close();
    }

    private static void exemple1() {
        Car car = new Car("Ford", 221);
        System.out.println(car);
    }


}
