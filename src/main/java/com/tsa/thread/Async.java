package com.tsa.thread;
/*
IntelliJ IDEA 2023.3.1 (Ultimate Edition)
Build #IU-233.11799.300, built on December 12, 2023
@Author PT.DIKA a.k.a. Trisa Sarifatul Anisak
Java Developer
Created on 09/09/2024 21:13
@Last Modified 09/09/2024 21:13
Version 1.0
*/

public class Async {

    public static void main(String[] args) throws InterruptedException {


        for (int i = 0; i < 3; i++) {


            if(i==1){
                Thread thread = new Thread(new Runnable() {
                    public void run() {
                        for(int j=0;j<4;j++){
                            System.out.println("INI Thread "+Thread.currentThread().getId()+" j ke : "+j);
                        }
                    }
                });
                thread.start();
            }
            System.out.println("INI Thread "+Thread.currentThread().getId());
        }
    }
}
