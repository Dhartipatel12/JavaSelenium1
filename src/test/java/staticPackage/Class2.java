package staticPackage;

public class Class2 extends Class1{


 @Override
 public void myCar(){
     System.out.println("My car Name is Mazda");
 }


    public static void main(String[] args) {
        Class2 obj = new Class2();
        obj.myCar();
        System.out.println(123456);
    }






}
