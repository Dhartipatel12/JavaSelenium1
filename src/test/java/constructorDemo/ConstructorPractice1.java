package constructorDemo;

public class ConstructorPractice1 {

// Constructor: Constructor is a special type of method has same name as class.
// It is Used to Initialize the variable while create object of the class.
// This method does not return anything.T
// the constructor method being called while creating an object of the class.
//when we create constructor private then it become singleton class.
// we can not create any object if this in another class.
//1.Parameterize Constructor has attributes
     String name;
     int ID;
     String location;
     boolean isFemale;
public ConstructorPractice1(String name,int ID, String location, boolean isFemale){
   this.name = "Dharti";
   this.ID = 101;
   this.location = "Omaha";
   this.isFemale = true;
   System.out.println(name);
   System.out.println(ID);
   System.out.println(location);
   System.out.println(isFemale);
     }
// 2.Default Constructor:
    public ConstructorPractice1(){ // Declare the constructor private insted of Public
        System.out.println("Hello World");
    }

public static void main(String[] args) {
    ConstructorPractice1 obj = new ConstructorPractice1("Dharti", 101, "Omaha", true);
    ConstructorPractice1 obj1 = new ConstructorPractice1();


}
}
