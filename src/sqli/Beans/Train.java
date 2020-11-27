package sqli.Beans;

import sqli.Beans.Configuration.Configuration;
import sqli.Beans.Wagons.WagonDecorators.EmptyCargo;
import sqli.Beans.Wagons.WagonDecorators.LoadedCargo;
import sqli.Beans.Wagons.WagonDecorators.Wagon;
import sqli.Beans.Wagons.Factory.WagonFactory;
import sqli.Beans.Wagons.Factory.WagonFactoryImpl;

import java.util.LinkedList;

public class Train {
    LinkedList<Wagon> wagonsList= new LinkedList<>();
    WagonFactory wagonFactory = WagonFactoryImpl.getFactory();

    public Train(String wagons) {
        String[] MyWagons = wagons.split("");
        for (int i = 0; i < MyWagons.length; i++) {
           wagonsList.add(wagonFactory.createWagon(MyWagons[i],i));
        }
    }

    public String print() {
       StringBuilder train = new StringBuilder();
       wagonsList.forEach(wagon -> {
           train.append(wagon.drow());
           if (wagonsList.getLast() != wagon)
               train.append(Configuration.CONNECTION);
       });
        return train.toString();
    }

    public void detachEnd() {
        wagonsList.removeLast();
    }

    public void detachHead() {
        wagonsList.removeFirst();
    }

    public boolean fill() {
        boolean stillEmpty = false;
        for (int i = 0; i <wagonsList.size() ; i++) {
            if (wagonsList.get(i) instanceof EmptyCargo) {
                stillEmpty = true;
                wagonsList.set(i,new LoadedCargo(wagonsList.get(i)));
                break;
            }
        }
/*        wagonsList.forEach(wagon -> {
            if (wagon instanceof EmptyCargo) wagon = new LoadedCargo(wagon);
        });*/
        return stillEmpty;
    }
}
