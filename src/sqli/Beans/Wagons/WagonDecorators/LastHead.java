package sqli.Beans.Wagons.WagonDecorators;

import sqli.Beans.Configuration.Configuration;

public class LastHead extends WagonDecorater {

    public LastHead(Wagon wagon) {
        super(wagon);
    }

    @Override
    public String drow() {
        return Configuration.LAST_WAGON;
    }

}
