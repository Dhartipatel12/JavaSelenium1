package encapsulationDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Encapsulation:used to protect our code and data accessible from other class.
//We can create variable and methods private so that it's not accessible in other class.
//We keep the Web driver private and use the getter/setter method.
//So we can get the driver calling the getdriver() method.
//creating getter setter method... these are public... plain old java object(pojo)
public class EncapDemo {

    private int SSN;  // Private variable

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;

    }

    // SubString Example:
    public void subString() {
        String str = "abcdedde";
        String subStr = str.substring(5);
        System.out.println(subStr);
    }

    // Duplicate value Example:
    public void duplicate() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(11);
        list1.add(12);
        list1.add(12);
        list1.add(13);

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == list1.get(i + 1)) {
                System.out.println(list1.get(i));
                break; // Break/ Stop the loop.
            }

        }
    // Removing Duplicate value Example:
        Set<Integer> set1 = new HashSet<>(list1);
        System.out.println(set1);
    }
}