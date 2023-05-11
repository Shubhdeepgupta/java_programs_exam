package com.shubh;

class Employee2
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

// creating class
class cellPhone{

    // creating methods
    public void ring()
    {
        System.out.println("Ring...");
    }
    public void vibrate()
    {
        System.out.println("Vibrate-...");
    }
    public void callingFriend()
    {
        System.out.println("Call Abhay...");
    }
}





public class class_with_method {

    public static void main(String[] args) {

        //

        Employee2 shubh = new Employee2 ();

        shubh.setName("Developer");
        shubh.salary = 5000;

        System.out.println(shubh.getSalary());

        System.out.println(shubh.getName());


        cellPhone apple = new cellPhone();
        apple.callingFriend();
        apple.vibrate();
        apple.ring();

    }

}
