package sqli.Beans.Wagons.Factory;

import sqli.Beans.Wagons.WagonDecorators.Wagon;

public abstract class WagonFactory {
    public abstract Wagon createWagon(String nom,int index);
}
