package sqli.Beans.Wagons.WagonDecorators;

import sqli.Beans.Configuration.Configuration;

public class Passenger extends WagonDecorater {

    public Passenger(Wagon wagon) {
        super(wagon);
    }

    @Override
    public String drow() {
        return Configuration.PASSENGER;
    }
}
