package basics_01;
public class Hello {
    public static void main(String args[]) {
        // ************ primitive data types *******************/
        // starts ->

        // int num1 = 9;
        // byte by = 127;
        // short sh = 338;
        // long l = 23432l;

        // float f = 2.3f;
        // double d = 2.3;

        // char c = 'a';

        // boolean b = true;

        // ends ->

        // ***************** literals **********************/
        // starts ->

        // int num1 = 0b101; // binary literal
        // System.out.println(num1);

        // int num2 = 0123; // octal literal
        // System.out.println(num2);

        // int num3 = 0x123; // hexadecimal literal
        // System.out.println(num3);

        // int num4 = 10_00_00; // decimal literal
        // System.out.println(num4);

        // double num5 = 12e10; // exponential literal
        // System.out.println(num5);

        // char c = 'a';
        // c++;
        // System.out.println(c);

        // ends ->

        // ************* type conversion & type casting ************/

        // starts ->

        // int num1 = 10;
        // long num2 = num1; // implicit type conversion
        // System.out.println(num2);

        // byte by = 10;
        // int num3 = 125;
        // by = (byte) num3; // explicit type casting
        // System.out.println(by);

        // int num = 257;
        // byte by = (byte) num;
        // System.out.println(by); // output would be 1 due to module of 256

        // int num1 = 12;
        // byte by1 = (byte) num1;
        // System.out.println(by1); // output would be 12 since the integer value is
        // within the byte range

        // float f = 12.5f;
        // int num1 = (int) f;
        // System.out.println(num1); //output would be 12 since the float value
        // converted to integer

        // Type Promotion
        // byte num1 = 10;
        // byte num2 = 20;
        // int result = num1 * num2;
        // System.out.println(result);

        // ends ->

        // **************** Arithmetic Operators ********************/
        // starts -> same as c++

        // ends ->

        // **************** Relational Operators ********************/
        // starts -> same as c++

        // ends ->

        // **************** Logical Operators ********************/
        // starts -> same as c++

        // ends ->

        // **************** Conditional Statements ********************/
        // starts -> same as c++

        // ends ->

        // **************** Ternery Operator ********************/
        // starts -> same as c++

        // ends ->

        // **************** Switch Statement ********************/
        // starts ->

        // int n = 10;
        // switch(n)
        // {
        // case 10: System.out.println("10"); break;
        // case 20: System.out.println("20"); break;
        // default: System.out.println("default");
        // }

        /** new way of using switch in java */
        // String day = "Monday";
        // String result = "";
        // result = switch (day) {
        //     case "Saturday", "Sunday" -> "Weekend";

        //     case "Monday" -> "Weekday";

        //     default -> "Invalid day";

        // };

        // System.out.println(result);

        // ends ->

        // **************** While loop  ********************/
        // starts -> same as c++

        // ends ->

        // **************** Do While loop  ********************/
        // starts -> same as c++    

        // ends ->

        // **************** For loop  ********************/
        // starts -> same as c++

        // ends ->

        


    }
}