package abcd;

public class Truck extends Car{
    public Truck(String name, int speed) {
        super(name, speed);
    }

    public void init(){
        paint();
    }
    public void paint()
    {
        System.out.println("грузовик в свежей краске");
    }

    public void bibi()
    {
        System.out.println("грузовик бибикнул");
    }
}
