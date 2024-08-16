package polymotphism;

public class MethodOverloading {


//Method Overloading has same name but different sets of parameters with
//different data types, different numbers of parameters, different order of parameters
//Method overloading called Compile time Polymorphism.

        public void addition(int a, float b) {
            System.out.println(a+b);
            // Different Types of Parameter
        }
        public void addition(int a, float b, int c){
            System.out.println(a+b+c);
            // Different Sets of Parameter
        }

        public void addition(int a, int b, int c){
            System.out.println(a+b+c);
            // Different Number of Parameter
        }

        public void addition(String name, int a){
            System.out.println(name);
            System.out.println(a);

        }

        public static void main(String[] args) {
            MethodOverloading obj = new MethodOverloading();
            obj.addition(10,20f);
            obj.addition(10,20f,30);
            obj.addition(10,11,12);
            obj.addition("Dharti", 11);
        }




    }


