package staticPackage;

public class Final2 extends Final1 {
//Final keyword can be used before the Class, method and variables
//Final class cannot be extended.This class cannot have any child class.
//Final variable cannot be modified.the value is final means fix.
//Final method cannot be overridden
//public final class Final2- Before class cannot extend it
// public final void myName(){--Before Method cannot override it
// final int number = 10;-- Before Variable cannot change value
// we use super keyword to calling  any parent class method inside child class method.

    @Override
    public void myName(){
    System.out.println("My Name is Dharti Patel");
}
// Super Key Word
public void sadia(){
    System.out.println();
    super.Dharti();// we use super keyword to calling  any parent class method inside child class method.
}

    public static void main(String[] args) {
        Final2 obj = new Final2();
        obj.myName();
        obj.sadia();
    }

}
