package Majdoor;

public class Employee {
    private String name;
    private int age;
    private long salary;

    public Employee(String name, int age, long salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : "  + age);
        System.out.println("Salary : " +  salary);
    }



}
