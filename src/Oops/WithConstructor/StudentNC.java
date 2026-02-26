

public class StudentNC {
    int USN;
    String name;
    int marks;
    void evaluateMarks(){
    if(marks >= 40) {
        System.out.println(name + " has passed");
    }else{
        System.out.println(name + "has failed");
    }
    }

public static void main(String [] args) {

    StudentNC S1 = new StudentNC();
    S1.name = "Vikrant";
    S1.marks = 80;
    S1.evaluateMarks();
}


}
