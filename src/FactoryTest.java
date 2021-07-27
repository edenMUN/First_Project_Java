import jdk.jshell.spi.ExecutionControl;

public class FactoryTest {
    public static void main(String[] args) throws ExecutionControl.NotImplementedException {
        CarFactory CarFactory = new CarFactory();
        Drivable myfiat = CarFactory.getCar("Fiat");
        myfiat.drive();
        Drivable mybmw = CarFactory.getCar("BMW");
        mybmw.drive();
        Drivable myporsche = CarFactory.getCar("Porsche");
        myporsche.drive();
    }

}
