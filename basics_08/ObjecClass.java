package basics_08;

class Laptop{
    public String model;
    public int price;

    //Every class by defualt extends Object class in Java

    //Object Class default toString() method is overriden here 
    public String toString(){
        return "Model: " + model + ", Price: " + price;
    }

    //Object Class default equals() method is overriden here 
    // not a best way to define equals method
    public boolean equals(Laptop that){
        if(this.model.equals(that.model) && this.price == that.price){
            return true;
        }else{
            return false;
        }
    }
}



public class ObjecClass {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.model = "Dell";
        l1.price = 50000;

        Laptop l2 = new Laptop();
        l2.model = "Dell";
        l2.price = 50000;

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(l1.equals(l2));
    }
}