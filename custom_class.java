package com.shubh;

class Employee{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
        System.out.println("My salary is " + salary);
    }

    public int getSalary()
    {
        return salary;
    }
}

public class custom_class {
    public static void main(String[] args) {

        System.out.println("This is custom class \n");

        Employee harry = new Employee(); // Instantiating a new Employee object
        Employee shubh = new Employee(); // Instantiating a new Employee

        // Setting Attributes of harry
        harry.id = 12;
        harry.name = "codeWithHarry";
        harry.salary = 5678;

        // Setting attributes for shubh
        shubh.id = 123;
        shubh.name = "developer shubh";
        shubh.salary = 7890;


        System.out.println("My salary is " + harry.salary);
        System.out.println("Student's id is " + harry.id);
        System.out.println("Student's name is " + harry.name + "\n");

        harry.printDetails();
        System.out.println();
        shubh.printDetails();

        int salary = shubh.getSalary();
        System.out.println(salary);
    }
}
