package staticPackage;

public  class Final1 {

//final String name = "Dharti Patel";

String name = "Dharti";
final int number = 10;


public void myName(){
    System.out.println("My Name is Dharti Patel");

}
public void Dharti(){   // Using SuperKeyword
    System.out.println("Hello");
}
public void Fayza(){    // Using This Keyword
    System.out.println("World");
    this.Dharti();// which means we can call method form the same class
}
    public static void main(String[] args) {
        Final1 obj = new Final1();
        obj.myName();
        obj.name= "Dharti Patel";
        System.out.println(10);
        obj.Fayza();

    }




}












