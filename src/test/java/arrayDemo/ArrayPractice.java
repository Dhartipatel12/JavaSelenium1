package arrayDemo;

import java.util.Scanner;

//Array is static where we define the size or length of array during the array
//during the declaration.we cannot change the size once we declare it.
//Array can contain both primitive datatype and objects.
///Arrays are used to store multiple values in a single variable,
//instead of declaring separate variables for each value.
public class ArrayPractice {

 String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

 public void Array() {
  System.out.println(cars[0]);
  System.out.println(cars[1]);
  System.out.println(cars[2]);
  System.out.println(cars[3]);
  System.out.println(cars.length);// Array length starts from 1.
 }
//Take 5 numbers like 100,200,300,400,500 and add all number use array and Arraylist format
//Take 5 numbers like 100,200,300,400,500 and find the average of those number
 public void ArrayExample() {
  int[] numbers = {100, 200, 300, 400, 500};
  int sum = 0;
  for (int i = 0; i < numbers.length; i++) {
   sum = sum + numbers[i];
// System.out.println(numbers[i]);//comment out for total

  }
  System.out.println(sum);
// Find average 100+200+300+400+500=1500/5=300.0
  float average = sum/numbers.length;
  System.out.println(average);
 }

 //Take 5 numbers like 100,200,300,400,500 and find the highest number.
  public void ArrayHighest() {
  int[] numbers = {100, 200, 300, 400, 500};
  int max = numbers[0];
  for (int i = 0; i < numbers.length; i++) {
 //  System.out.println(numbers[i]);
   if (numbers[i]>max){
    max = numbers[i];
   }
  }
   System.out.println(max);
 }

//Write a Java program to find the number of even and odd integers
// in a given array of integers.

 public void EvenOdd(int number){ //method signature (int num = parameter)

  if (number %2 == 0) {
   System.out.println(number + "Is a even Number");
  }
  else if (number%2 == 1) {
   System.out.println(number + "Is an Odd Number");
  }
 }
//Take user input of a number and write a program to find that number is positive or negative

public void positiveNegative(){
 Scanner scan = new Scanner(System.in);// scanner method syntax
 int i = scan.nextInt();

 if (i == 0) { // If Condition
  System.out.println("This is a positive number");
 }
 else if (i > 0) {
  System.out.println("This is a positive number");
 }
 else {
  System.out.println("This is a negative number ");
 }
 }
//write a java function and take paramiter write a program to find that number is positive or negative
 public void positiveandnegative(int a){ //Positive and Negative number Another way
  if (a==0){
   System.out.println("This is positive number");
  }
  else if (a>0) {
   System.out.println("This is positive number");
  }
  else{
   System.out.println("This is Negative number");
  }
 }
////write a java function and take three int paramiter and prints greater number
 public void parameter(int a,int b,int c){
 if ((a>b) && (b>c)) {
  System.out.println(a + "is a greater number");
 }
 else if ((b>a) && (b>c)) {
   System.out.println(b + " is a greater number");
 } else if ((c>a) &&(c>b)) {

 }
 }
// A school has the following rules for grading system:
// a. Below 25 - F
// b. 26 to 45 - E
// c. 46 to 50 - D
// d. 51 to 60 - C
// e. 61 to 80 - B
// f. Above 80 - A
// Take a variable of marks and print the corresponding grade.
 public void gradeSystem(int marks){
  if (marks<25){
   System.out.println("The grade is F");
  }
  else if ((marks>=26) &&(marks<=45)) {
   System.out.println("The Grade is E");
  }
  else if ((marks>=46)&&(marks<=50)) {
   System.out.println("The grade is D");
  }
  else if ((marks>=51)&&(marks<=60)) {
   System.out.println("The grade is c");
  }
  else if ((marks>=61)&&(marks<=80)) {
   System.out.println("The grade is B");
  }
  else if (marks>80) {
   System.out.println("The grade is A");
  }
 }
 public static void main (String[]args){
   ArrayPractice obj = new ArrayPractice();
  // obj.Array();
 // obj.ArrayExample();
  // obj.ArrayHighest();
  // obj.EvenOdd(9);
 //  obj.positiveNegative();// Scanner method we input the value in the console to run
 // obj.parameter(10,20,45);
 // obj.positiveandnegative(-13);
  obj.gradeSystem(61);
  }


 }
