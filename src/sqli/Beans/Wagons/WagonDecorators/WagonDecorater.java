package sqli.Beans.Wagons.WagonDecorators;

public abstract class WagonDecorater extends Wagon {
    protected Wagon wagon;

    public WagonDecorater(Wagon wagon) {
        super();
        this.wagon = wagon;
    }
}
