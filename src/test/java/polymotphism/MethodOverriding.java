package polymotphism;

public class MethodOverriding extends MethodOverloading{
//Method Overriding is used in Inheritance where we have parent class and child class.
//Method overriding as same name and same method, but we can change,add
// or remove code from the child class.
//child class extends parent class. Child use the same method name as the parent class
// but the child class body will be different.
// We can add or remove code in child class.

@Override
public void addition(int a, float b){
    System.out.println(a-b);

}


    public static void main(String[] args) {
        MethodOverriding obj = new MethodOverriding();
        obj.addition(20,10);
    }












}