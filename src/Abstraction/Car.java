package Abstraction;

public class Car extends Vehicle {

    private int noOfdoors;

    public Car() {
        super(4);
    }

@Override
    public void startSound(){
    System.out.println("Vrooommmm.....");
}

@Override
    public void getSetGo(){
    System.out.println("Lets go.........");
}

}
