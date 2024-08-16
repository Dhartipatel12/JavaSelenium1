package staticPackage;

public class StaticPractice1 {

    int carNumber;
    static String carName;


    public static void main(String[] args) {
        StaticPractice1 obj = new StaticPractice1();
        obj.carNumber = 1234567;
        System.out.println(obj.carNumber);
        String carName = "Mazda";
        System.out.println(carName);
    }

}
