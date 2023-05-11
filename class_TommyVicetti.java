package com.shubh;

class tommy
{
    public void hit()
    {
        System.out.println("Hitting the enemy");
    }

    public void run()
    {
        System.out.println("Running from the enemy");
    }

    public void fire()
    {
        System.out.println("Firing on the enemy");
    }
}

public class class_TommyVicetti {

    public static void main(String[] args) {
        tommy player1 = new tommy();

        player1.fire();
        player1.run();
        player1.hit();
    }


}
