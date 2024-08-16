package staticPackage;

public class StaticPractice {
    int studentID;
    static String studentName;



    public static void main(String[] args) {
       StaticPractice obj = new StaticPractice();
       obj.studentID= 101;
        studentName= "Dharti";
        System.out.println(obj.studentID);
        System.out.println(studentName);
    }




}
