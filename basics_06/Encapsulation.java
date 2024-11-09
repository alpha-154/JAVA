package basics_06;

class Human {
    private String name;// This private variable can only be accessed within this Human class
    private int age; // This private variable can only be accessed within this Human class


    // constructor

    public Human() { //default constructor
        System.out.println("constructor called");
        this.name = "john doe";
        this.age = 34;
    }


    // constructor overloading (same function name but different parameters)
    public Human(String name, int age) {  // parameterized constructor
        System.out.println("constructor called");
        this.name = name;
        this.age = age;
    }

    // getters
    public String getName() { // This method can be accessed within & outside this Human class
        return name;
    }

    public int getAge() { // This method can be accessed within & outside this Human class
        return age;
    }

    // setters

    public void setName(String name) {
        this.name = name; // here , `this` keyword is used to refer to the current instance (caller `object` of this class) of the Human class
    }

    public void setAge(int age) {
        this.age = age;
    }

    // & congrats that're called ->>> Encapsulation, Setters & Getters in Class

}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();

        obj.setName("john");
        obj.setAge(38);

        System.out.println(obj.getName());
        System.out.println(obj.getAge());

        Human obj1 = new Human("matthew", 28);
        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
    }
}
