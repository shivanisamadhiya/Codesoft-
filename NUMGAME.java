import java.util.Scanner;
import java.util.Random;


public class NUMGAME {
    public static void main(String[] args){
        int ans ,guess ,rounds = 0, maxAttempts = 5;
        int score=0;
        int TotalAteempts=5;


        final int MAX = 100;
        Scanner in = new Scanner (System.in);
        Random rand = new Random () ;

        boolean correct = false;
         ans= rand. nextInt(MAX)+ 1;
          while (!correct && rounds < maxAttempts){
            rounds++;
            TotalAteempts++;
            System.out.println("Roundn " + rounds + " of " + maxAttempts + ":Take a guess between 1 to 100:");
            guess=in.nextInt();
            score++;
            
             if ( guess > ans) {
                System.out.println(" Too high ! Try again");
            }

             else if ( guess > ans) {
                System.out.println(" Too low ! Try again");
            }

            else {
                System.out.println("Congratulations ! You gussed the correct number in " + rounds + " rounds !");
                System.out.println("Your final score is: " + score);
                correct=true;


            }
            if (rounds==maxAttempts && ! correct){
                System.err.println("Sorry , you've reached the maximum number of attempts !");
                System.err.println("The correct number was: " + ans);
                System.err.println("Your final score is :" + score);

            }

        }
            

          
          System.out.println(" Total attempts : " + TotalAteempts);
          System.exit(0);
         }


}