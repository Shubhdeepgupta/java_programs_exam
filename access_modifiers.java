package com.shubh;

class myEmployee
{
    private int id;
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }
    public void setID (int i)
    {
        id = i;
    }

    public int getID ()
    {
        return id;
    }
}

public class access_modifiers {
    public static void main(String[] args) {

        myEmployee shubh = new myEmployee();

//        shubh.id = 45;
//        shubh.name = "Developer"; --> throws an error due to private access modifier

        shubh.setName("CodeWithHarry");
        System.out.println(shubh.getName());

        shubh.setID(5678);
        System.out.println(shubh.getID());
    }
}


