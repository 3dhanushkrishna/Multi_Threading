package com.harman.Multithread;
class Program extends Thread
{
    public  void run()
    {
        try{
            System.out.println("thread executed: "+Thread.currentThread().getName());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
public class MulThread {
    public static void main(String[] args) {
        for(int i=0;i<=8;i++)
        {
            Program p = new Program();
            p.start();
        }
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
