package staticPackage;

public class Class1 {

  String Name = "Mazda";
  int Number= 123456;

 public void myCar(){
     System.out.println("My car name is Mazda");


 }

    public static void main(String[] args) {
        Class1 obj = new Class1();
        obj.myCar();
        System.out.println(123456);
    }

}
