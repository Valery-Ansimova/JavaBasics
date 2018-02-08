package ua.org.oa.Lera;

//this class for creating bus objects
public class Bus {

    //this field for keeping bus color
    public String colorBus;
    //field for keeping bus width
    public int widthBus;
    //field for keeping bus leght
    public int lengthBus;
    //field to store information about the serviceability of the bus
    public boolean isTheBusOk;
    //field to store information about bus number
    public int busNumber;

    //method for calculate bus area
    public int calculateArea() {
        int s = widthBus * lengthBus;
        return s;
    }

    //method for printing bus propeties
    public void sayProperties() {
        System.out.println(colorBus +" "+ widthBus + " " +lengthBus +" "+ isTheBusOk + " "+busNumber + " "+ calculateArea());
    }
}
