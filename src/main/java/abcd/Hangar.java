package abcd;

import java.util.ArrayList;

public class Hangar {
    String adr;

    public void setAdr(String adr) {
        this.adr = adr;
    }

    ArrayList<Transport> transports = new ArrayList<>();

    public void setTransports(ArrayList<Transport> transports) {
        this.transports = transports;
    }

    @Override
    public String toString() {
        return "Hangar{" +
                "adr='" + adr + '\'' +
                ", transports=" + transports +
                '}';
    }
}
