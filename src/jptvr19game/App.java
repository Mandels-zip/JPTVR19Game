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
        Random random = new Random();
        System.out.println("Какой минимум и максимум вы хотите");
        Scanner scanner = new Scanner(System.in);
        int minimum1 = scanner.nextInt();
        int maximum1 = scanner.nextInt();
        System.out.println("Какое количество попыток вы хотите иметь?");
        int popitky = scanner.nextInt();
        System.out.println("Программа задумала число, угадай");
        int attempt = 1;
        int myNumber = random.nextInt(maximum1 - minimum1 + 1) + 0;
        do {
            int gamerNumber = scanner.nextInt();
            if(myNumber == gamerNumber){
                System.out.println("Ты выиграл!");
                break;
            }else{
                attempt = attempt +1;
                if (attempt > popitky){  
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
