package basics_03;

public class Student {
    public String name;
    public double marks;
    
    public Student(String name, double marks){
        this.name = name;
        this.marks = marks;
    }

    public String isPassed(){
        String result;
       if(marks > 50 ){
        result = "passed";
       }else {
        result = "failed";
       }
       return result;
    }
}
