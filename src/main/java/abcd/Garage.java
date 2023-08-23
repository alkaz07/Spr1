package abcd;

import java.util.ArrayList;

public class Garage {

    ArrayList<Car> cars = new ArrayList<>();

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "cars=" + cars +
                '}';
    }
}
