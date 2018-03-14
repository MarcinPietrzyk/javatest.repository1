package my_pack;

public class MyClass {
    public static void main(String[] args){
        System.out.println("Temperature checker:");

        Temperature temp = new Temperature();
        boolean result = temp.isTemperaturePositive(-4);
    }
}
