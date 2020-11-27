package sqli.Beans.Wagons.WagonDecorators;

import sqli.Beans.Configuration.Configuration;

public class LoadedCargo extends WagonDecorater {

    public LoadedCargo(Wagon wagon) {
        super(wagon);
    }

    @Override
    public String drow() {
        return Configuration.LOADED_CARGO;
    }

}
