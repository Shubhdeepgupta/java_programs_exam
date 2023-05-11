package com.shubh;

import javax.crypto.spec.PSource;

class square
{
    int side;
    public int area()
    {
        return side * side;
    }

    public int parimeter()
    {
        return 4 * side ;
    }
}

public class square_class_with_method {

    public static void main(String[] args) {

        square sq = new square();

        sq.side = 4;

        System.out.println(sq.area());
        System.out.println(sq.parimeter());

    }



}
