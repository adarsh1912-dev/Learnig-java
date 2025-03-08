package StringProblems;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Student{ ");
        str.append("Name: ").append(name).append(", ");
        str.append("Age: ").append(age);
        str.append(" }");
        return str.toString();
    }


    public static void main(String[] args) {
        Student s1 = new Student("Krishna", 16);
        System.out.println(s1);
    }
}
