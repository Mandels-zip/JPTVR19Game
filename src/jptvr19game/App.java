/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19game;

import java.util.Random;
import java.util.Scanner;

public class App {
    public void run(){
        System.out.println("Hello");
        System.out.println("Программа задумала число, угадай");
        Random random = new Random();
        int attempt = 0;
        int myNumber = random.nextInt(5 - 0 + 1) + 0;
        do {
            Scanner scanner = new Scanner(System.in);
            int gamerNumber = scanner.nextInt();
            if(myNumber == gamerNumber){
                System.out.println("Ты выиграл!");
                break;
            }else{
                attempt = attempt +1;
                if (attempt > 2){  
                    System.out.println("Ты проиграл, было: "
                                    + myNumber);
                    break;
                }else{
                    System.out.println("Попробуй еще раз!");
                }
            }  
        }while(true);  
    }
}
