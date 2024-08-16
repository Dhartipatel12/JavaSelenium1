package collectionPackage;

import java.util.HashMap;

public class HashMapPractice {

//HashMap is a class that implements Map interface.
//Hashmap can hold two data types(Key, value).
//Hashmap follows key-value pair. We can get the value based on the key.
// Key is unique but value can be duplicated.
//Hashmap have only one null key and value.


        public void hashMap(){
            HashMap<Integer, String> student = new HashMap<>();
            student.put(110,"Sumaia");
            student.put(111,"Sadia");
            student.put(112,"Lota");
            student.put(113,"Fayja");
            student.put(114,"Fayja");

            System.out.println(student);
            //  System.out.println(student.get(112));
            student.remove(113);
            System.out.println(student);
        }

        public static void main(String[] args) {
            HashMapPractice obj = new HashMapPractice();
            obj.hashMap();
        }
    }









