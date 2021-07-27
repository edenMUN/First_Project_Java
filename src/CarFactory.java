import jdk.jshell.spi.ExecutionControl;

public class CarFactory {
    static Drivable getCar(String cardrive) throws ExecutionControl.NotImplementedException{
        if (cardrive == null) {
            return null;
    }

    if(cardrive.equalsIgnoreCase("BMW")){
        return new BMW();
    } else if(cardrive.equalsIgnoreCase("Porsche")){
        return new Porsche();
    } else if(cardrive.equalsIgnoreCase("Fiat")){
        return new Fiat();
    }
    return null;

    }
}
