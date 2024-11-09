package basics_04;


// In Java, the static keyword is used to indicate that a particular
//  member (variable, method, or inner class) belongs to the class 
//  itself, rather than to instances (objects) of the class. This 
//  means that static members are shared across all instances of the class.


//Static Variables (Class Variables)
// 1. A static variable belongs to the class, not to any individual instance, so all instances share the same static variable.
// 2. It is often used for constants or data that should be shared among all instances.
class Example{
    public static int count = 0;
    
    public Example(){
        count++;
    }
}

// Static Methods (Class Methods)
// 1. static methods can be called without creating an instance of the class, as they belong to the class itself.
// 2. hey can access only other static members (variables or methods) and cannot access instance (non-static) members directly.

class Utility{
    public int x; //instance variable belongs to instance and can't be used in static methods
    public static int y ; //static variable belongs to class and can be used in static methods
    public static int z ;

    //staic block
    // 1. A static block is used to initialize static variables when the class is loaded.
    // 2. It runs only once, the first time the class is loaded into memory.
    static {
        y = 9;
        z = 10;
    }

    public static int add(int a, int b){
        return a + b + y + z;
    }

    public static int sub(Utility obj, int c, int d){
        return obj.x + ( c - d );
    }
}

public class Statics {
    public static void main(String[] args){
        new Example(); // count becomes 1
        new Example(); // count becomes 2
        System.out.println(Example.count); // Outputs 2

        int sum = Utility.add(5, 3); // No need to create an instance of Utility
        System.out.println("Sum: " + sum);

        //in order to use instance variable in static method
        Utility obj = new Utility();
        obj.x = 10;
        int result = Utility.sub(obj, 5, 9);

        System.out.println("Result: " + result);

    }
}
