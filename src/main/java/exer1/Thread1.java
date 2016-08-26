package exer1;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kann
 */
public class Thread1 extends Thread{
       
   
        byte[] bis;
        int size = 0;
        String url;
        
        public Thread1(String url){
            this.url = url;            
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getSize() {
            return size;
        }
        
        @Override
        public void run(){
            
            byte[] arr;
            
            arr = getBytesFromUrl(url);
            
            for (int i = 0; i < arr.length; i++) {
                size += arr[i];
                
            }
            setSize(size);
        
        }
        
        private byte[] getBytesFromUrl(String url) {
            
            ByteArrayOutputStream bis = new ByteArrayOutputStream();
            try{
                byte[] byte1 = new byte[4096];
                InputStream is = new URL(url).openStream();
                int read;
                while((read = is.read(byte1)) > 0){
                    bis.write(byte1, 0, read);
                }
                    
            } catch (IOException e) {
                System.out.println(e);
            }
        return bis.toByteArray();
        }
        
        
    }


