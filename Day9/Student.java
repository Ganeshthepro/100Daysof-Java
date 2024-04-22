package Day9;

import java.util.Scanner;

public class Student{
    private String name;
    private int roll;
    private int age;
    private String gender;
    private double sub1;
    private double sub2;

    public Student(String name, int roll, int age, String gender, double sub1, double sub2){
        this.name = name;
        this.roll = roll;
        this.age = age;
        this.gender = gender;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public double total(){
        return sub1+sub2;
    }

    public double percentage(){
        double totalMarks = total();
        return (totalMarks/200)*100;
    }

    public String grade(){
        double percentage = percentage();
        if(percentage>90){
            return "A";
        } else if(percentage>80){
            return "B";
        } else if(percentage>70){
            return "C";
        } else{
            return "D";
        }
    }

    public void display(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(sub1);
        System.out.println(sub2);
        System.out.println(total());
        System.out.println(percentage());
        System.out.println(grade());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];


        for(int i=0;i<n;i++){
            System.out.println("Name");
            String name = sc.nextLine();
            int roll = sc.nextInt();
            int age = sc.nextInt();
            String gender = sc.nextLine();
            double sub1 = sc.nextDouble();
            double sub2 = sc.nextDouble();
            students[i] = new Student(name, roll, age, gender, sub1, sub2);
        }
           
        for(int i=0;i<n;i++){
            students[i].display();
            System.out.println();
        }
    }
}

