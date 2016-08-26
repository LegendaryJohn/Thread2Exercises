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
public class Exercise1 { // Explanation of results: Parallel execution is fastest because the threads don't wait for each other as in Sequential execution.
    
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("Available processors = " + Runtime.getRuntime().availableProcessors());

        String url1 = "https://fronter.com/cphbusiness/design_images/images.php/Classic/login/fronter_big-logo.png";
        String url2 = "https://fronter.com/cphbusiness/design_images/images.php/Classic/login/folder-image-transp.png";
        String url3 = "https://fronter.com/volY12-cache/cache/img/design_images/Classic/other_images/button_bg.png";

        Tester test = new Tester();

        test.Tester(url1, url2, url3);
        
    }
    
}
