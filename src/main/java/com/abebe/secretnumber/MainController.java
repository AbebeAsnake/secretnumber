package com.abebe.secretnumber;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.Scanner;
@RestController
public class MainController {
    @RequestMapping("/")
    public String gussNumber(){
        int number;
        String guessResult;
        Random r = new Random();

        int x = r.nextInt(10);

        Scanner keyboard = new Scanner(System.in);
         number = keyboard.nextInt();
        String getnumber = keyboard.nextLine();
         do{System.out.println("guess a number from 1 to 10");
         if(number >x){
             guessResult ="You guessed Too high number ";
         }
         else if(number<x){
             guessResult = "<b style='color:red'>You guessed Too Low number</b>";
         }
         else {
             guessResult ="I got your number ";
         }}
         while (getnumber =="Y");
         System.out.println("Do you want to continue? Y/N");
         System.out.println(x);
         return guessResult;
    }

}
