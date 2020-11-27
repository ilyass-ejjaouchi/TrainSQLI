package sqli.Beans.Wagons.WagonDecorators;

import sqli.Beans.Configuration.Configuration;

public class FirstHead extends WagonDecorater {

    public FirstHead(Wagon wagon) {
        super(wagon);
    }

    @Override
    public String drow() {
        return Configuration.FIRST_WAGON;
    }

}
