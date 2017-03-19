package com.praveen.sample.test;

/**
 * Hello world!
 *
 */
public class App 
{
	public static long s1;
	public static long s2;
    public static void main( String[] args )
    {
        Demo t1 = new Demo("test-1");
        Demo t2 = new Demo("test-2");
        Demo t3 = new Demo("test-3");
        Demo t4 = new Demo("test-4");
        Demo t5 = new Demo("test-5");
        Demo t6 = new Demo("test-6");
        Demo t7 = new Demo("test-7");
        Demo t8 = new Demo("test-8");
        Demo t9 = new Demo("test-9");
        s1 = System.currentTimeMillis();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        
        long s5 = (App.s2-App.s1)/1000;
        System.out.println("Time Taken -> "+s5+" seconds");
    }
}
