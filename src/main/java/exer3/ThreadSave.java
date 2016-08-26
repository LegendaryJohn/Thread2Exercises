/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kann
 */
public class ThreadSave extends Thread{
    
    List<String> list;
    

    public ThreadSave(List<String> lines) {
        
        list = lines;
    }
    
    @Override
    public void run() {
      
        while(true) {

            try{ // Saves the lines to the .txt file every 15 seconds.
                ThreadSave.sleep(15000);
                try (FileWriter writer = new FileWriter("backup.txt", false)) {
                    for(String lines : list) {
                        writer.write(lines);
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(ThreadSave.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadSave.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
}
