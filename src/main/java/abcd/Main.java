package abcd;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
       //exemple2();
       //exemple7();
        //exemple8();
        exemple10();
    }

    private static void exemple7() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myContext5.xml");

        Hangar hangar= context.getBean("hangar", Hangar.class);
        System.out.println(hangar);

        context.close();
    }

    private static void exemple6() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myContext4.xml");

        Garage gar = context.getBean("gar", Garage.class);
        System.out.println(gar);

        context.close();
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

    private static void exemple8(){
        Config1 config = new Config1();

        Car car2 = config.car2();

        System.out.println(car2);
    }

    private static void exemple9(){
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myContext2.xml");
        Config2 config = new Config2();

        Car car4 = config.car4();
        System.out.println(car4);
        //car4 = context.getBean("car4", Car.class);
        System.out.println(car4);
        //context.close();

    }

    private static void exemple10()
    {
        Config3 config3 = new Config3();
        Truck t1 = config3.leva();

        System.out.println(t1);

        Truck t2 = config3.leva();
        System.out.println(t1.equals( t2));

        Truck t3=config3.kesha();
        Truck t4 = config3.kesha();
        System.out.println(t3);
        System.out.println(t3.equals(t4));

        Truck t5 = config3.dima();
        System.out.println(t5);
    }

}
