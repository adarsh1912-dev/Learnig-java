package Abstraction;

import Interfaces.Transport;

public abstract class Vehicle implements Transport {

    private int numberOfTyres;
    public abstract void startSound();

    public Vehicle(int numberOfTyres){
        this.numberOfTyres = numberOfTyres;
    }

    public void setNumberOfTyres(int n){
        numberOfTyres = n;
    }

    public int getNumberOfTyres(){
        return numberOfTyres;
    }

    public  void commute(){
        System.out.println("Vehicle is running.....");
    }

}
