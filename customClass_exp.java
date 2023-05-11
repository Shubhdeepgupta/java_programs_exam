package com.shubh;

class Employee1
{
     int salary;
     String name;

     public int getSalary()
     {
         return salary;
     }
     public String getName()
     {
         return name;
     }
     public void setName (String n)
     {
         name = n;
     }
}

public class customClass_exp {
    public static void main(String[] args) {

        //

        Employee1 shubh = new Employee1 ();

        shubh.setName("Developer");
        shubh.salary = 5000;

        System.out.println(shubh.getSalary());

        System.out.println(shubh.getName());

    }
}
