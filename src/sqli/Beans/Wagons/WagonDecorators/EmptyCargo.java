package sqli.Beans.Wagons.WagonDecorators;

import sqli.Beans.Configuration.Configuration;

public class EmptyCargo extends WagonDecorater {

    public EmptyCargo(Wagon wagon) {
        super(wagon);
    }

    public String drow() {
        return Configuration.EMPTY_CARGO;
    }

}
