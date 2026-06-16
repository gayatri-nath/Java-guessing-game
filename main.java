package First;

import java .util.Random;
import java .util.Scanner;
public class Taskone{
    public static void main(String[] args) {
        Random randomno=new Random();
       
		Scanner sc=new Scanner (System.in);
		
        int secretNumber=randomno.nextInt(100)+1;
        int energy=100;
        System.out.println("!...Guessing no game...!");
        System.out.println("--Guessing no Between 1 to 100 --");
    while (energy>0 ){
        System.out.println("Enter your Guessing number");
       int guess=sc.nextInt();
      
if (guess==secretNumber) {
	System.out.println("Congratulations! You Guessed Currect Number");
        break;
    }

int difference=Math.abs ( secretNumber - guess);

       int energyloss;
       if (difference>50) {
    	   energyloss =25;
       }if (difference>10) {
    	   energyloss =5;
       }else {
    	   energyloss =2;
       }
       energy-=energyloss;
    if (guess> secretNumber){
    System.out.println("The number Too High!Please Try again.");
    
}else{
    System.out.println("The number Too Low!Please Try again.");
    
}
    System.out.println("Energy Lost:"+energyloss);
    System.out.println("Remaining Energy:"+energy);
    }
    if (energy<=0) {
    	System.out.println("Gameover!");
    	System.out.println("The correct number Was :"+secretNumber);
    }
          sc.close();

    }
}



