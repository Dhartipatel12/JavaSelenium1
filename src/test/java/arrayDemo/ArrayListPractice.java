package arrayDemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {

 /*
    Take 5 numbers like 100,200,300,400,500 and use it in an arrayList format and print out all the numbers using loop.
     */

    /*
    Take 5 numbers like 100,200,300,400,500 and add all the numbers and find the average of those number.
     */

    public void ArrayList(){
        List<Integer> number = new ArrayList<>();
        int sum=0;
        number.add(100);
        number.add(200);
        number.add(300);
        number.add(400);
        number.add(500);

        for (int i =0; i< number.size(); i++){
            System.out.println(number.get(i));
            sum =sum+ number.get(i);
        }
        System.out.println(sum+"This is sum value");
        float average = sum / number.size();
        System.out.println(average+"This is average value");
    }


    /*
    Take 5 numbers like 100,200,300,400,500  and write a program to find the highest value from those number? using Arraylist format
     */
    public void highestArraylist(){
        List<Integer>number = new ArrayList<>();
        int max=0;
        number.add(100);
        number.add(200);
        number.add(300);
        number.add(400);
        number.add(500);
        for (int i=0; i< number.size(); i++){
            if (number.get(i) > max){
                max = number.get(i);
            }
        }
        System.out.println(max);
    }


    public static void main(String[] args) {
        ArrayListPractice obj = new ArrayListPractice();
        // obj.ArrayList();
        obj.highestArraylist();
    }
}
