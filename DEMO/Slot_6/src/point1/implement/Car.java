package point1.implement;

public class Car {
//fields
    private String Colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean parkingBrake;
    //methods
    public Car(){
        Colour="";
        EnginePower = 0 ;
        Convertible = false;
        parkingBrake = false;
                }
public Car(String Colour, int EnginePower, boolean Convertible, boolean parkingBrake){
    this.Colour = Colour;
    this.EnginePower = EnginePower;
    this.Convertible = Convertible;
    this.parkingBrake = parkingBrake;
    
}
public void pressStartButton(){
    System.out.println("You can press the star button");
}

}
