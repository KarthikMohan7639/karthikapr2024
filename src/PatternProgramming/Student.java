package PatternProgramming;

public class Student {
    static String sname="Karthik";
    static int age=23;

    void showDetails(){
        System.out.println("Student Name:"+sname+"Age:"+age);
    }

    static void showDet(){
        sname="karthik";
        age=21;
        System.out.println(sname+""+age);
    }

    public static void main(String[] args) {
        Student stud=new Student();
        stud.showDetails();
        Student.showDet();
    }
}
