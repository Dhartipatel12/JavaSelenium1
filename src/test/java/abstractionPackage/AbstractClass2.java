package abstractionPackage;

public class AbstractClass2 extends Abstract {


    @Override
    public void animalSound() {
        System.out.println("Moo Moo ");
    }

    public static void main(String[] args) {
        AbstractClass2 obj = new AbstractClass2();
        obj.animalSound();
    }







}
