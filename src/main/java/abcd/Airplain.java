package abcd;

public class Airplain extends Transport{
    String name;

    public Airplain(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Airplain{" +
                "name='" + name + '\'' +
                '}';
    }
}
