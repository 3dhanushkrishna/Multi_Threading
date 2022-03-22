package com.harman.Multithread;

import java.util.Scanner;

class AddNo extends Thread{
    int x,y;

    public AddNo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {

        try {
            System.out.println("Addition");
            System.out.println(x + y);
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class SubNo extends Thread{
    int x,y;

    public SubNo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        try{
            System.out.println("subtraction");
            System.out.println(x-y);

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class MulNo extends Thread
{
    int x,y;

    public MulNo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void run() {
        try{
            System.out.println("Multiplication");
            System.out.println(x*y);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
public class CalculatorThread {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;
        System.out.println("enter the 1st number: ");
        a = input.nextInt();
        System.out.println("enter the 2nd number: ");
        b = input.nextInt();
        for(int i=0;i<=10;i++) {

            AddNo addobj = new AddNo(a, b);
            SubNo subobj = new SubNo(a, b);
            MulNo mulobj = new MulNo(a, b);
            addobj.start();
            subobj.start();
            mulobj.start();
        }



    }
}
