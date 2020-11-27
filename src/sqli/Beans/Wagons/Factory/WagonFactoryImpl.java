package sqli.Beans.Wagons.Factory;

import sqli.Beans.Wagons.WagonDecorators.*;

public class WagonFactoryImpl extends WagonFactory {
    public static WagonFactory instance;

    public static WagonFactory getFactory(){
        if (instance == null)
            return new WagonFactoryImpl();
        return instance;
    }

    @Override
    public Wagon createWagon(String nom, int index) {
        Wagon wagon = new WagonImp();
        switch (nom) {
            case "H":
                if (index == 0)
                    wagon = new FirstHead(wagon);
                else
                    wagon = new LastHead(wagon);
                return wagon;
            case "P":
                wagon = new Passenger(wagon);
                return wagon;
            case "R":
                wagon = new Restaurant(wagon);
                return wagon;
            case "C":
                wagon = new EmptyCargo(wagon);
                return wagon;
            default:
                return null;

        }
    }
}
