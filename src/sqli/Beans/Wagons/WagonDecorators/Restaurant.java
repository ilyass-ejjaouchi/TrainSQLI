package sqli.Beans.Wagons.WagonDecorators;

import sqli.Beans.Configuration.Configuration;

public class Restaurant extends WagonDecorater{

    public Restaurant(Wagon wagon) {
        super(wagon);
    }

    @Override
    public String drow() {
        return Configuration.RESTAURANT;
    }
}
