import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int guess, lifeForce = 5;
        int i = 0;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);


        int number = random.nextInt(100);
        boolean gameState = false ;
        boolean mistake = false;
        int [] predictions = new int[5];

        System.out.println(number);
        System.out.println("Welcome to NUmber guessing game");
        System.out.println("Please enter a number between 0 to 99");

while (lifeForce > 0) {

    System.out.println("Your guess :");
    guess = sc.nextInt();
    predictions[i++] = guess;

    if (guess < 0 || (guess > 99)) {

        if (mistake) {
            System.out.println("You enter so many wrong number. That is why you lost 1 point ");
            System.out.println(  "Remaing lifeforce" + --lifeForce);

            lifeForce--;
        } else {
            mistake = true;
            System.out.println("Please enter a number between 0 to 99");


        }
        continue;
    }

    if (guess == number) {
        gameState = true;
        break;
    } else {

        System.out.println("Wrong number. Pleas try again");
        System.out.println(--lifeForce + " Lifeforce remaning ");
    }


}
  if (gameState) {

      System.out.println("Congurculations write choice ! ");
      System.out.println("Number : " + number);
      System.out.println(--lifeForce + " Lifeforce remaning  ");
  } else {

      System.out.println("You failed ");


  }

  for (int value : predictions){

      if (value != 0){


      }
  }

    }



}
