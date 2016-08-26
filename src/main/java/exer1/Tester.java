package exer1;


import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kann
 */
public class Tester {
    
    public void Tester(String url1, String url2, String url3) throws InterruptedException{
        
        Thread1 t1 = new Thread1(url1);
        Thread1 t2 = new Thread1(url2);
        Thread1 t3 = new Thread1(url3);
    
        long start = System.nanoTime();
        t1.start();
        t2.start();
        t3.start();
        
        t1.join();
        t2.join();
        t3.join();
        
        long end = System.nanoTime();
        
        System.out.println("Time parallel:" + (end - start));
        
        int sum = t1.getSize() + t2.getSize() + t3.getSize();
        
        System.out.println(sum);
        
    }
}
