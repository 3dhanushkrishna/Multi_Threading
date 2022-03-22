package com.harman.Multithread;


import java.util.Scanner;

class Divisible8 extends Thread
{
    int a;

    public Divisible8(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        try {
            System.out.println("check the no is divisile by 8 or not :");
            if(a%8==0){
                System.out.println("no is dividble by 8");
            }
            else{
                System.out.println("no is not divisible by 8");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class Evenodd extends Thread
{
    int a;

    public Evenodd(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        try {
            System.out.println("check the no is even or odd :");
            if(a%2==0){
                System.out.println("no is even");
            }
            else{
                System.out.println("no is odd");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}
class Primeno extends Thread
{
    @Override
    public void run() {

        int min = 2;
        int max = 500;
        System.out.println("prime number between 2 to 500:");

        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }

        }

    }

    public boolean isPrime(int num) {
        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }



}
class Primecheck extends Thread
{
    int a;

    public Primecheck(int a) {
        this.a = a;
    }

    @Override
    public void run() {
        int temp;
        System.out.println("check given number is prime or not:");
        boolean isPrime = true;
        for (int i = 2; i <= a / 2; i++) {
            temp = a % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(a + " is a prime number ");
        else
            System.out.println(a + " not a prime number ");
    }


}
public class Threadconcepts {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x;
        System.out.println("enter the number: ");
        x=input.nextInt();

        Divisible8 divobj=new Divisible8(x);
        Evenodd eveobj=new Evenodd(x);
        Primeno primeobj=new Primeno();
        Primecheck primeobj1=new Primecheck(x);
        divobj.start();
        eveobj.start();
        primeobj.start();
        primeobj1.start();

    }
}
