package staticPackage;

public class ClassA {



public void Sadia(){
    System.out.println("Hello");


}
public void Lota(){  // Using This Key word
    System.out.println("Friend");
    this.Sadia();
}
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        obj.Sadia();
        obj.Lota();
    }




}
