package my_pack;

public class Temperature {
    public boolean isTemperaturePositive(double temperature){
        boolean isPositive = temperature > 0;

        if(isPositive){
            System.out.println("Temperature " + temperature + " is positive.");
        }

        else {
            System.out.printf("Temperature " + temperature + " is negative.");
        }

        return isPositive;
    }
}
