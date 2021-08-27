package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 1000;
        int b = 7;
        int c = a - b;

        while(true) {
            System.out.println("Я");
            try {                               //
                Thread.sleep(1000);        // Задержка
            } catch (InterruptedException e) {  //
                e.printStackTrace();            //
            }
            System.out.println("Гуль");
            try {                                 //
                Thread.sleep(1500);         // Задержка
            } catch (InterruptedException e) {   //
                e.printStackTrace();             //
            }
            for (a = 1000; a >= b; a--, c--) {
                if (a < 0) {
                    break; // Остановка вычислений, если a меньше нуля
                }
                System.out.println(a + " - 7 = " + c);
                try {                                   //
                    Thread.sleep(5);              // Замедление кода
                } catch (InterruptedException e) {     //
                    e.printStackTrace();               //
        if(c == 0) {                // Попытка остановить цикл
             System.exit(0);  // (не работает, даже находясь в цикле for)
        }
                }
            }
        }
    }
}
