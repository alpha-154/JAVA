// MainClass.java
package basics_02;

public class MainClass {
    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calculator = new Calculator(4, 6);

        //call the add method
        int result = calculator.add();
        System.out.println("result is " + result);

       
    }
}

