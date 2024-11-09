package basics_02;

public class Calculator {
    // Fields to store two numbers
    private int number1;
    private int number2;

    // Constructor to initialize the numbers
    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Method to add the two numbers
    public int add() {
        return number1 + number2;
    }

    // Method to subtract the second number from the first
    public int subtract() {
        return number1 - number2;
    }

    // Method to multiply the two numbers
    public int multiply() {
        return number1 * number2;
    }

    // Method to divide the first number by the second
    public double divide() {
        if (number2 == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return (double) number1 / number2;
    }

    // Getters for the fields (optional, for accessing the numbers if needed)
    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    // Setters for the fields (optional, for changing the numbers if needed)
    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
}

