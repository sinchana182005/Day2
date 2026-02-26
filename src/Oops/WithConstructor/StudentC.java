package Oops.WithConstructor;

public class StudentC {
    int USN;
    String name;
    int marks;
    static String college =  "SNPSU";

    StudentC(String name, int USN, int marks){
    this.name = name;
    this.USN = USN;
    this.marks = marks;
    }

    void evaluateMarks() {
        if (marks >= 40) {
            System.out.println(name + " has passed");
        } else {
            System.out.println(name + "has failed");
        }
    }
        void studentDetails () {
            System.out.println("Name: " + this.name);
            System.out.println("USN:" + this.USN);
            System.out.println("Marks:" + this.marks);
            System.out.println("College: " + college);
        }
        public static void main (String[] args) {
            StudentC s1 = new StudentC("Vikranth", 101, 80);

            s1.studentDetails();
            s1.evaluateMarks();


        }
    }