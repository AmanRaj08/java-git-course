// import other.tools.*;
// import java.util.Scanner;
// import java.util.*;
// import java.util.stream.Stream;

// class Computer {
//     public void playMusic(){
//         System.out.println("Music Playing....");
//     }


//     public String getMePen(int cost){                   //COMPUTER CLASS
//         if(cost>=10)
//             return "Pen";

//         return "Nothing";
//     }
    
// }
// class Calculator{
//     public int add(int n1, int n2){
//         return n1 + n2;
//     }
//     public int add(int n1, int n2, int n3){            //CALCULATOR CLASS 
//         return n1 + n2 + n3;
//     }
//     public double add(double n1, int n2){
//         return n1 + n2;
//     }
// }

// class Student{
//     public int roll;
//     public String name;                                //STUDENT CLASS
//     public int marks;
// }

// class Mobile{
//       String brand;
//       int price;
//       static String name;
//       static{
//         name="Phone";
//         System.out.println("inside static");
//       }

//       public Mobile(){
//         brand="";
//         price=200;
//         System.out.println("inside constructor");
//       }

//       public void show(){
//         System.out.println(brand + " : " + price + " : " + name);    //MOBILE CLASS
//       }
//       public static void show1(Mobile obj){
//         System.out.println(obj.brand + " : " + obj.price + " : " + name);
//       }
// }

// class Human{
//         private int age;
//         private String name;
//         public int getAge() {
//           return age;
//         }
//         public void setAge(int age) {
//           this.age = age;                                 //HUMAN CLASS
//         }
//         public String getName() {
//           return name;
//         }
//         public void setName(String name) {
//           this.name = name;
//         }
// }

// class A{
//   public A(){
//     super();
//     System.out.println("in A");
//   }
//   public A(int n){
//     super();
//     System.out.println("in A int");
//   }
// }
// class B extends A{
//   public B(){
//     super(5);
//     System.out.println("in B");
//   }
//   public B(int n){
//     this();
//     System.out.println("in B int");
//   }
// } 

// class A{
//     public void show(){
//       System.out.println("in A show");
//     }
// }
// class B extends A{
//      public void show(){
//       System.out.println("in B show");
//     }
// }

// abstract class car{
//   public abstract void drive();
//   public abstract void fly();
//   public void playMusic(){
//     System.out.println("Play Music");
//   }                                                      //ABSTRACT CLASS
// }
// abstract class Bmw extends car{
//   public void drive(){
//     System.out.println("Driving...");
//   }
// }
// class updatedBmw extends Bmw{                           //CONCREATE CLASS

//   public void fly() {
//     System.out.println("Unimplemented method 'fly'");
//   }
// }

// class A{
//   int age;
//   public void show(){
//       System.out.println("in show");
//   }

//   class B{
//     public void config(){
//       System.out.println("Configuring B");
//     }
//   }
// }

// interface Computer{
//     void code();
// }
// class Laptop implements Computer{
//     public void code(){
//         System.out.println("Coding on Laptop");
//     }
// }                                                      // INTERFACE AND IMPLEMENTATION
// class Desktop implements Computer{
//     public void code(){
//         System.out.println("Coding on Desktop");
//     }
// }
// class Developer{
//     public void devApp(Computer lap){
//         lap.code();
//     }
// }

// class Counter{
//     int count;
//     public synchronized void increment() {
//         count++;
//     }
// }

// class Student implements Comparable<Student> {
//     int age;
//     String name;
//     public Student(int age, String name) {
//         this.age = age;
//         this.name = name;                              //STUDENT CLASS WITH COMPARABLE
//     }
//     public String toString() {
//         return "Student [age=" + age + ", name=" + name + "]";
//     }
//     public int compareTo(Student that) {
//         if(this.age > that.age)
//             return 1;
//         else return -1;
//     } 
// }

// sealed class A permits B{
// }
// final class B extends A {
// }
// class C extends B {
//     // This class cannot extend A or B because they are sealed and final respectively.
//     // If you try to extend A or B here, it will result in a compilation error.
// }

// record Alien(int id, String name) {
//     // This is a record class in Java, which is a special kind of class that is used to model immutable data.
//     // It automatically generates the constructor, getters, equals, hashCode, and toString methods.
//     public Alien() {
//         this(0, "Unknown"); // Default constructor with default values
//     }
//     public Alien(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }
// }

//import java.util.Arrays;

public class Hello
{
    public static void main(String args[])
    {
        // int num1=1;
        // int num2=9;
        // int num3=10;

    // <-------------------------------NORMAL---------------------------------->

        // System.out.println(8);
        // System.out.println(8+5);
        // System.out.println(num+num1);

    //<----------------------CONDITIONAL STATEMENT-----------------------------> 

        // if(num1 > num2 && num1 > num3){
        //         System.out.println(num1);
        // }
        // else if(num2 > num3){
        //     System.out.println(num2);
        // }
        // else{
        //     System.out.println(num3);
        // }

    //<------------------------TERNARY OPERATOR-------------------------------->

        // String res=(num1 % 2==0)?"True":"False";
        // System.out.println(res);

    //<--------------------------SWITCH CASE-----------------------------------> 

        // switch(num1){
        //     case 1: System.out.println("Sunday");
        //     break;
        //     default: System.out.println("Invalid option");
        // }

    //<-----------------------LOOPING & ITERATION ----------------------------->

        // for(int i=0; i<5; i++){
        //     System.out.println("Hi");
        // }
        // while(condition){
        //      statement
        // }
        // do{
        //      statement
        // }while(condition)
    //<-------------------------OOP's PRINCIPLE-------------------------------->

        // Computer com = new Computer(); //object
        // com.playMusic();
        // String res=com.getMePen(2);
        // System.out.println(res);
        // Calculator obj = new Calculator();
        // double res = obj.add(7.2, 4);
        // System.out.println(res);

    //<------------------------------ARRAY------------------------------------->

      //---------------------1-D ARRAY------------------------

        // int nums[] = {3, 7, 2, 4};
        // int nums[] = new int[4];

        // for(int i=0;i<4;i++){
        //     System.out.println(nums[i]);
        // }
     //----------------------2-D ARRAY------------------------

        // int num[][] = new int[2][2];
        // for(int i=0;i<2;i++){
        //     for(int j=0;j<2;j++){
        //         num[i][j] = (int) (Math.random()*10);
        //     }
        // }
        // for(int i=0;i<2;i++){
        //     for(int j=0;j<2;j++){
        //         System.out.print(num[i][j] + " ");
        //     }
        //     System.out.println();
        // }
      //---------------------JAGGED ARRAY---------------------- 

        // int num[][]= new int[3][];
        // num[0]=new int [3];
        // num[1]=new int [4];
        // num[2]=new int [2];
        // for(int i=0;i<num.length;i++){
        //     for(int j=0;j<num[i].length;j++){
        //         num[i][j]=(int)(Math.random()*10); 
        //     }
        // }
        // for(int n[] : num){
        //     for(int m : n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }
      //-------------------------3-D ARRAY----------------------- 

        //  int num[][][]= new int[3][3][2];
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         for(int k=0;k<2;k++)
        //         num[i][j][k]=(int)(Math.random()*10);   
        //     }
        // }
        // for(int n[][] : num){
        //     for(int m[] : n){
        //         for(int x : m){
        //         System.out.print(x + " ");
        //         }
        //         System.out.println();
        //     }
        //     System.out.println();
        // }

      //--------------------------CLASS ARRAY---------------------  

        // Student s1= new Student();
        // s1.roll=1;
        // s1.name="AMAN";
        // s1.marks=87;
        // Student s2= new Student();
        // s2.roll=2;
        // s2.name="RAJ";
        // s2.marks=97;
        // Student s3= new Student();
        // s3.roll=3;
        // s3.name="HARSH";
        // s3.marks=77;

        // Student students[]=new Student[3];
        // students[0]=s1;
        // students[1]=s2;
        // students[2]=s3;
        
        // // for(int i=0;i<students.length;i++){
        // //     System.out.println(students[i].roll+". "+students[i].name+" : "+students[i].marks);
        // // }
        // for(Student stud : students){
        //     System.out.println(stud.roll+". "+stud.name+" : "+stud.marks); 
        // }

    //<-----------------------------STRING------------------------------------>
        
      //---------------------------BASIC--------------------------
        
        // String name ="aman";
        // name=name+" raj";
        // System.out.println("Hello "+name);
        // String s1="Aman";
        // String s2="Aman";
        // System.out.println(s1==s2);

      //--------------------------STRING BUFFER-------------------

        // StringBuffer sb = new StringBuffer("AMAN");
        // sb.append(" RAJ");
        // sb.insert(0, "HELLO ");
        // System.out.println(sb);

      //--------------------------STRING BUILDER------------------

    //<-----------------------------STATIC----------------------------------->
      //-------------------------STATIC VARIABLE------------------

        // Mobile obj1=new Mobile();
        // obj1.brand="APPLE";
        // obj1.price=1500;
        // obj1.show();
        
      //-------------------------STATIC METHOD--------------------

        // Mobile obj1=new Mobile();
        // obj1.brand="APPLE";
        // obj1.price=1500;
        // obj1.show();
        // Mobile obj2=new Mobile();
        // obj2.brand="SAMSUNG";
        // obj2.price=1700;
        // obj2.show();
        // Mobile.show1(obj1);

    //<---------------------------ENCAPSULATION---------------------------->

        // Human obj = new Human();
        // obj.setAge(23);
        // obj.setName("Aman Raj");
        // System.out.println(obj.getName() + " : "+ obj.getAge());

    //<--------------------------THIS AND SUPER---------------------------->

        // B obj = new B(5);
    
    //<---------------------------INHERITANCE------------------------------>

        // ScincCalc obj = new ScincCalc();
        // System.out.println(obj.add(5, 3));
        // System.out.println(obj.subtract(10, 4));
        // System.out.println(obj.multiply(2, 3));
        // System.out.println(obj.divide(10, 2));
        // System.out.println(obj.power(2, 3));

    //<--------------------------PACKAGE------------------------------------>

        // Calc obj = new Calc();
        // AdvCalc advObj = new AdvCalc(); 
    
    //<-------------------------POLYMORPHISM------------------------------->

        // A obj = new A();
        // obj.show();    // This will call the show method of class A, as B does not override it.
        // obj = new B();
        // obj.show();    // This will call the show method of class B, due to dynamic method dispatch.
        // If B had overridden the show method, it would have called B's version.
        // B obj2 = new B();
        // obj2.show(); // This would call the show method of class B if it was defined.

    //<------------------------FINAL KEYWORD------------------------------->

        // FINAL VARIABLES ARE CONSTANTS, ONCE ASSIGNED THEY CANNOT BE CHANGED

        // final int x = 10; // x cannot be changed
        // System.out.println(x);
        // x = 20; // This will cause a compilation error, as x is final.

        // FINAL CLASS CANNOT BE INHERITED
        // final class A {
        //     public void display() {
        //         System.out.println("This is a final class.");
        //     }
        // }
        // class B extends A { // This will cause a compilation error
        //     public void display() {
        //         System.out.println("This is a subclass.");
        //     }
        // }

        // FINAL METHOD CANNOT BE OVERRIDDEN
        // class A {
        //     public final void display() {
        //         System.out.println("This is a final method.");
        //     }
        // }
        // class B extends A {
        //     public void display() { // This will cause a compilation error
        //         System.out.println("This is an overridden method.");
        //     }
        // }
    
    //<------------------------TYPE CASTING------------------------------->

        // Type casting in Java is the process of converting a variable from one type to another.
        // There are two types of type casting in Java:
        // Upcasting and Downcasting in Java
        // A obj = new B(); // Upcasting
        // obj.show(); // Calls B's show method due to dynamic method dispatch
        // B obj2 = (B) obj; // Downcasting
        // obj2.show(); // Calls B's show method

    //<------------------------WRAPPER CLASSES------------------------------->

        // Wrapper classes in Java are used to convert primitive data types into objects.
        // For example, Integer is a wrapper class for the primitive type int.
        // int num = 10;
        // Integer wrappedNum = Integer.valueOf(num); // Boxing
        // int unwrappedNum = wrappedNum.intValue(); // Unboxing
        // System.out.println("Wrapped: " + wrappedNum + ", Unwrapped: " + unwrappedNum);

    //<------------------------ABSTRACT CLASS------------------------------->

        // car myCar = new Bmw();
        // myCar.drive(); // Calls the drive method of Bmw
        // myCar.playMusic(); // Calls the playMusic method of car

    //<------------------------CONCRETE CLASS------------------------------->

        // updatedBmw myUpdatedBmw = new updatedBmw();
        // myUpdatedBmw.drive(); // Calls the drive method of Bmw
        // myUpdatedBmw.fly(); // Calls the fly method of updatedBmw
        // myUpdatedBmw.playMusic(); // Calls the playMusic method of car

    //<------------------------INNER CLASS------------------------------->

        // A obj = new A();
        // obj.show(); // Calls the show method of class A
        // A.B obj1 = obj.new B(); // Creating an instance of the inner class B
        // obj1.config(); // Calls the config method of class B

    //<------------------------INTERFACES------------------------------->

        // Computer myLaptop = new Laptop();
        // Computer myDesktop = new Desktop();
        // Developer myDevApp = new Developer();
        // myDevApp.devApp(myLaptop); // Coding on Laptop
        // myDevApp.devApp(myDesktop); // Coding on Desktop

    //<-----------------------ENUMERATION----------------------------->

        // Days today = Days.MONDAY;
        // System.out.println("Today is: " + today);
        // System.out.println("Day number: " + today.getDayNumber());
        // System.out.println("Is it a weekend? " + today.isWeekend());

    //<-----------------------ANNOTATIONS----------------------------->

        // @Override
        // public String toString() {
        //     return "Hello, World!";
        // }
        // Hello hello = new Hello();
        // System.out.println(hello.toString()); // Calls the overridden toString method
        // @Deprecated

    //<-----------------------TYPES OF INTERFACES----------------------------->

        // Functional Interface
        // @FunctionalInterface
        // interface MyFunctionalInterface {
        //     void myMethod();
        // }
        // MyFunctionalInterface myFunc = () -> System.out.println("Hello from functional interface!");
        // myFunc.myMethod(); // Calls the method of the functional interface

        // Marker Interface
        // interface MyMarkerInterface {}
        // class MyClass implements MyMarkerInterface {}
        // MyClass obj = new MyClass();
        // if (obj instanceof MyMarkerInterface) {
        //     System.out.println("obj is an instance of MyMarkerInterface");
        // }

    //<-----------------------EXCEPTION HANDLING----------------------------->

        // try {
        //     int result = 10 / 0; // This will throw an ArithmeticException
        // } catch (ArithmeticException e) {
        //     System.out.println("Caught an exception: " + e.getMessage());
        // } finally {
        //     System.out.println("This block always executes.");
        // }

    //<-----------------------CUSTOM EXCEPTION HANDLING----------------------------->

        // try {
        //     throw new CustomException("This is a custom exception");
        // } catch (CustomException e) {
        //     System.out.println("Caught a custom exception: " + e.getMessage());
        // }

    //<-----------------------INPUT AND OUTPUT----------------------------->

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter your name: ");
        // String name = scanner.nextLine();
        // System.out.println("Hello, " + name + "!");
        // scanner.close();

    //<-----------------------FINALLY BLOCK----------------------------->

        // try {
        //     int[] arr = {1, 2, 3};
        //     System.out.println(arr[5]); // This will throw an ArrayIndexOutOfBoundsException
        // } catch (ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Caught an exception: " + e.getMessage());
        // } finally {
        //     System.out.println("This block always executes.");
        // }


    //<-----------------------MULTITHREADING----------------------------->

        // Thread thread1 = new Thread(() -> {
        //     for (int i = 0; i < 5; i++) {
        //         System.out.println("Thread 1: " + i);
        //         try {
        //             Thread.sleep(500); // Sleep for 500 milliseconds
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // });

        // Thread thread2 = new Thread(() -> {
        //     for (int i = 0; i < 5; i++) {
        //         System.out.println("Thread 2: " + i);
        //         try {
        //             Thread.sleep(500); // Sleep for 500 milliseconds
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // });
        // thread1.start();
        // thread2.start();

        // Runnable obj1 = () -> {
        //     for (int i = 0; i < 5; i++) {
        //         System.out.println("Runnable Thread 1: " + i);
        //         try {
        //             Thread.sleep(500); // Sleep for 500 milliseconds
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // };
        // Runnable obj2 = () -> {
        //     for (int i = 0; i < 5; i++) {
        //         System.out.println("Runnable Thread 2: " + i);
        //         try {
        //             Thread.sleep(500); // Sleep for 500 milliseconds
        //         } catch (InterruptedException e) {
        //             e.printStackTrace();
        //         }
        //     }
        // };
        // Thread thread1 = new Thread(obj1);
        // Thread thread2 = new Thread(obj2);
        // thread1.start();
        // thread2.start();

    //<-----------------------SYNCHRONIZATION----------------------------->

        // Counter counter = new Counter();
        // Runnable obj1 = () -> {
        //     for(int i=0;i<1000;i++){
        //         counter.increment();
        //     }
        // };
        // Runnable obj2 = () -> {
        //     for(int i=0;i<1000;i++){
        //         counter.increment();
        //     }
        // };
        // Thread thread1 = new Thread(obj1);
        // Thread thread2 = new Thread(obj2);
        // thread1.start();
        // thread2.start();
        // try{
        //     thread1.join();
        //     thread2.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        // System.out.println("Final count: " + counter.count); // Should print 2000 if synchronized correctly

    //<-----------------------COLLECTIONS----------------------------->   
        // Collections in Java are used to store, retrieve, manipulate, and communicate aggregate data.

      //------------------------LIST---------------------

        // List<Integer> nums = new ArrayList<Integer>();
        // nums.add(1);
        // nums.add(2);
        // nums.add(3);
        // nums.add(4);
        // for(int n : nums) {
        //     System.out.println(n);
        // }

      //-----------------------------SET-----------------------------

       //----------------------HASHSET------------------------

        // Set<Integer> nums = new HashSet<Integer>();
        // nums.add(1);
        // nums.add(2);
        // nums.add(3);
        // nums.add(1); // Duplicate will not be added
        // for(int n : nums) {
        //     System.out.println(n);
        // }

       //-----------------------TREESET------------------------

        // Set<Integer> nums = new TreeSet<Integer>();
        // nums.add(11);
        // nums.add(23);
        // nums.add(3);
        // nums.add(11); // Duplicate will not be added
        // for(int n : nums) {
        //     System.out.println(n);
        // }

      //------------------------MAP-----------------------------
      
        // Map<String, Integer> students = new HashMap<String, Integer>(); //We can use Hashtable also.
        // students.put("Aman", 85);
        // students.put("Raj", 90);
        // students.put("Harsh", 78);
        // System.out.println(students);
        // System.out.println(students.values());
        // for(String key : students.keySet()){
        //     System.out.println(key + " : " + students.get(key));
        // }
    
    //<-----------------------COMPARATOR------------------------------------->
    
        // Comparator<String> com = new Comparator<String>() {
            
        //     public int compare(String s1, String s2){

        //         if(s1.length() > s2.length()){
        //             return 1;
        //         } else if(s1.length() < s2.length()){
        //             return -1;
        //         } else {
        //             return s1.compareTo(s2); // If lengths are equal, compare lexicographically
        //         }
        //     }
        // };
        // List<String> names = new ArrayList<>();
        // names.add("Aman");
        // names.add("Raj");
        // names.add("Harshpreet");
        // names.add("Zaraw");

        // Collections.sort(names, com);
        // System.out.println(names);


        // Comparator<Student> com = (i, j) ->
        //     i.age>j.age?1:-1;
        // List<Student> stud = new ArrayList<>();
        // stud.add(new Student(20, "Aman"));
        // stud.add(new Student(22, "Raj"));
        // stud.add(new Student(21, "Harsh"));
        // stud.add(new Student(23, "Zaraw"));
        // Collections.sort(stud, com);
        // for(Student s : stud) {
        //     System.out.println(s);
        // }

    //<-----------------------FOR EACH------------------------------------->

        // List<Integer> nums = Arrays.asList(2, 3, 7, 5, 6);
        // nums.forEach(n -> System.out.println(n));


    //<-----------------------STREAMS------------------------------------->

        // Streams in Java are a sequence of elements supporting sequential and parallel aggregate operations.
        // List<Integer> nums = Arrays.asList(2, 3, 7, 5, 6, 4);
        // Stream<Integer> s1 = nums.stream();
        // // s1.forEach(n -> System.out.println(n));
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // // s2.forEach(n -> System.out.println(n)); // This will print only even numbers
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // // s3.forEach(n -> System.out.println(n)); // This will print even numbers multiplied by 2
        // int result = s3.reduce(0, (a,b) -> a+b);

        // int result = nums.stream()
        //                     .filter(n -> n%2==0)
        //                         .map(n -> n*2)
        //                             .reduce(0, (a,b) -> a+b);
        // System.out.println("Sum of even numbers multiplied by 2: " + result);

        // Stream<Integer> sortedValues = nums.stream()
        //                                     .filter(n -> n%2==0)
        //                                      .sorted();

        // sortedValues.forEach(n -> System.out.println(n)); // This will print even numbers in sorted order

    //<------------------------JAVA 10 FEATURES----------------------------->

        // Java 10 introduced the 'var' keyword for local variable type inference.
        // var nums = List.of(2, 3, 7, 5, 6, 4); // Java 10 feature to create an immutable list
        // nums.forEach(n -> System.out.println(n)); // This will print all numbers in the list 
        // var nums = Arrays.asList(2, 3, 7, 5, 6, 4);
        // var b=8;
        // int a=6;
        // System.out.println(a+b);

        // SEALED CLASSES
        // Sealed classes and interfaces allow you to control which classes can extend or implement them.
        // Sealed classes allow you to control which classes can extend or implement them.
        // sealed class Shape permits Circle, Rectangle; // Sealed class
        // final class Circle extends Shape { // Final class
        //     // Circle implementation
        // }
        // final class Rectangle extends Shape { // Final class
        //     // Rectangle implementation
        // }
        // Shape shape = new Circle(); // You can create an instance of Circle
        // System.out.println(shape instanceof Circle); // This will print true
        // System.out.println(shape instanceof Rectangle); // This will print false

    
        // Alien a1 = new Alien(1, "Aman");
        // Alien a2 = new Alien(1, "Aman");
        // Alien a3 = new Alien(); // This will call the default constructor with default values
        // System.out.println(a1.equals(a2));
        // System.out.println(a1); // This will call the toString method of the record class Alien
        // System.out.println(a3); // This will call the toString method of the record class Alien with default values

        // Calc obj = new Calc();
        // int result = obj.add(5, 4);
        // if(result == 8) {
        //     System.out.println("Addition is correct: " + result);
        // } else {
        //     System.out.println("Addition is incorrect: " + result);
        // }

    //<------------------------JUNIT TESTING----------------------------->

        // JUnit is a testing framework for Java that allows you to write and run tests for your code.
        // You can create test classes and methods using annotations like @Test, @Before, @After, etc.
        // For example:
        // @Test
        // public void test() {
        //     int result = obj.add(5, 4);
        //     assertEquals(9, result); // This will check if the addition is correct
        // }

    //<------------------------SORTING ALGORITHMS----------------------------->

        // Sorting algorithms are used to arrange the elements of a list or array in a specific order.
        // There are various sorting algorithms like Bubble Sort, Selection Sort, Insertion Sort, Merge Sort, Quick Sort, etc.
        // For example, you can use Arrays.sort() method to sort an array in Java:
        // int[] arr = {5, 2, 3, 4, 1};
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr)); // This will print the sorted array
        // You can also implement your own sorting algorithms like Bubble Sort:
        // int[] arr = {5, 2, 3, 4, 1};
        // for(int i=0; i<arr.length-1; i++) {
        //     for(int j=0; j<arr.length-i-1; j++) {
        //         if(arr[j] > arr[j+1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // }
        // System.out.println(Arrays.toString(arr)); // This will print the sorted array using Bubble Sort

    //<------------------------GIT AND GITHUB------------------------------->

        // Git is a version control system that allows you to track changes in your code and collaborate with others.
        // You can create a repository, commit changes, push to remote repositories, and more.
        // GitHub is a platform that hosts Git repositories and provides additional features like pull requests, issues, etc.
        // For example, you can create a new repository on GitHub, clone it to your local machine, make changes, commit them, and push them back to GitHub.
        // You can also use Git commands like git init, git add, git commit, git push, git pull, etc. to manage your code.

    //<------------------------GIT COMMANDS------------------------------->

        // git init - Initializes a new Git repository
        // git add . - Adds all changes to the staging area
        // git commit -m "Your commit message" - Commits the changes with a message
        // git push origin main - Pushes the changes to the remote repository on the main branch
        // git pull origin main - Pulls the latest changes from the remote repository on the main branch
        // git status - Shows the current status of the repository
        // git log - Shows the commit history of the repository
        // git diff - Shows the differences between the working directory and the staging area
        // git branch - Lists all branches in the repository
        // git tag - Lists all tags in the repository
        // git checkout <branch_name> - Switches to the specified branch
        // git push origin v1.0 - Pushes a specific tag to the remote repository
        // git clone <repository_url> - Clones a remote repository to your local machine
    
     //<------------------------------JDBC------------------------------------>

        // JDBC (Java Database Connectivity) is an API that allows Java applications to interact with databases.
        // The 7 steps of JDBC are:
        // 1. Import the JDBC package
        // 2. Load the JDBC driver
        // 3. Establish a connection to the database
        // 4. Create a statement
        // 5. Execute a query
        // 6. Process the results
        // 7. Close the connection

        // Example code for JDBC:
        // Class.forName("com.mysql.cj.jdbc.Driver");
        // Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "user", "password");
        // Statement stmt = conn.createStatement();
        // ResultSet rs = stmt.executeQuery("SELECT * FROM mytable");
        // while(rs.next()) {
        //     System.out.println(rs.getString("column_name"));
        // }
        // rs.close();
        // stmt.close();
        // conn.close();

    //<------------------------------SERVLETS------------------------------------>

        // Servlets are Java programs that run on a web server and handle HTTP requests and responses.
        // They are used to create dynamic web applications.
        // A servlet can be created by extending the HttpServlet class and overriding the doGet() or doPost() methods.
        // Example code for a simple servlet:
        // import java.io.*;
        // import javax.servlet.*;
        // import javax.servlet.http.*;

        // public class HelloServlet extends HttpServlet {
        //     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //         PrintWriter out = response.getWriter();
        //         out.println("Hello, World!");
        //     }
        // }



    } 
}