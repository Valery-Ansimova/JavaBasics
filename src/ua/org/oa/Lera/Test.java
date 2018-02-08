package ua.org.oa.Lera;

import ua.org.oa.Lera.Bus;

public class Test {

    public static void main (String[] args){
        Bus bus1 = new Bus();
        bus1.colorBus = "red";
        bus1.widthBus = 3;
        bus1.lengthBus = 15;
        bus1.isTheBusOk = true;
        bus1.busNumber = 54;
        int sOfBus1 = bus1.calculateArea();

        System.out.println(sOfBus1);
        bus1.sayProperties();

        Bus bus2 = new Bus();
        bus2.colorBus = "blue";
        bus2.widthBus = 2;
        bus2.lengthBus = 8;
        bus2.isTheBusOk = true;
        bus2.busNumber = 41;
        int sOfBus2 = bus2.calculateArea();

        System.out.println(sOfBus2);
        bus2.sayProperties();

        Bus bus3 = new Bus();
        bus3.colorBus = "green";
        bus3.widthBus = 5;
        bus3.lengthBus = 11;
        bus3.isTheBusOk = false;
        bus3.busNumber = 152;
        int sOfBus3 = bus3.calculateArea();

        System.out.println(sOfBus3);
        bus3.sayProperties();
    }
}
