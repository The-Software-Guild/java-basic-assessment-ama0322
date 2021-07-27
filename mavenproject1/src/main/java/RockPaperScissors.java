import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 16265
 */
public class RockPaperScissors {
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


    
    
    public static void main(String[] args) {
        
        // variable to determine if player plays game again
        boolean playAgain = true;      // True by default. Set false to stop playing
        
        // Rock Paper Scissors 
        do{
        
            // Take input for number of rounds to play (between 1 to 10)
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of round you want to play (1-10 inclusive): ");
            String in = sc.nextLine();
            int numRounds = Integer.parseInt(in);
        
            // If numRounds not within rounds, then print error and quit
            if ( numRounds < 1 || numRounds > 10  ){
                System.out.println(numRounds + " is not within bounds. Program has exited.");
                System.exit(0);
            }
        
        
        
            // Create a random object to generate random numbers
            Random rn = new Random();
        
        
            // Variables to keep track of game state
            int ties = 0;
            int pWins = 0; // player wins
            int cWins = 0; // computer wins
        
        
        
            // Play the rounds of rock, paper, scissors
            for(int i = 0; i < numRounds; i++){
            
                // Take the user's move
                System.out.println("Round " + (i + 1) + ", your move (1 = Rock, 2 = Paper, 3 = Scissors): ");
                in = sc.nextLine();
                int pMove = Integer.parseInt(in);
            
                // Print out user's moves
                if (pMove == 1) System.out.println("Player played rock.");
                if(pMove == 2) System.out.println("Player played paper.");
                if (pMove == 3) System.out.println("Player played scissors.");

                // Generate the computer's move randomly (from 1 to 3) 
                int cMove = rn.nextInt(3) + 1; 
            
                // Print out the computer's move
                if (cMove == 1) System.out.println("Computer played rock.");
                if(cMove == 2) System.out.println("Computer played paper.");
                if (cMove == 3) System.out.println("Computer played scissors.");
                
            
                // Update game variables based on the moves       
                // If the user has won
                if ( (pMove == 1 && cMove == 3) || (pMove == 2 && cMove == 1) || (pMove == 3 && cMove == 2) ){
                    pWins++;
                    System.out.println("Player won round.");
                }
                // If the computer has won
                else if ( (pMove == 1 && cMove == 2) || (pMove == 2 && cMove == 3) || (pMove == 3 && cMove == 1) ){
                    cWins++;
                    System.out.println("Player lost round.");
                }
                // Else, tie
                else{
                    System.out.println("Player tied.");
                    ties++;
                }
            
                
                System.out.println();
            
            }
        
        
            // Print out the number of ties, player wins, and computer wins. And overall winner
            System.out.println("Number of ties: " + ties);
            System.out.println("Number of user wins: " + pWins);
            System.out.println("Number of computer wins: " + cWins);
            if(pWins > cWins){
                System.out.println("The user has won.");
            }
            else if (pWins < cWins){
                System.out.println("The computer has won.");
            }
            else{
                System.out.println("Neither has won more rounds. Tie. ");
            }
        
        
            
            // Ask if the user wants to continue playing
            System.out.println("Continue playing? Enter command (\"Yes\" or \"No\"):");                  
            String command = sc.nextLine();
            if(command.equals("No")){
               playAgain = false; 
            }
            
        
        } while(playAgain);
        
        
        
        
        
        System.out.println("Program has exited.");
        System.exit(0);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // Exercise 1
        /*
        System.out.print("1 + 2 is: ");
        System.out.println(1 + 2);

        System.out.print("42001 modulus 5 is: ");
        System.out.println(42001 % 5);

        System.out.print("5565.0 divided by 22.0 is : ");
        System.out.println(5565.0 / 22.0);

        System.out.print("223 times 31 - 42: ");
        System.out.println(223 * 31 - 42);

        System.out.print("Is 4 greater than -1? ");
        System.out.println(4 > -1);

        System.out.println("\n****** Now make the computer do some harder math!");

        System.out.print("8043.52 minus 4.2 plus 23.0 divided by 56.0 times -76.13 is: ");
        System.out.println("???");

        System.out.print("11111 modulus 3 minus 67 minus 1 plus 9 is: ");
        System.out.println("???");

        System.out.print("44 minus 22 minus 11 minus 66 minus 88 minus 76 minus 11 minus 33 is : ");
        System.out.println("???");

        System.out.print("22 times 3 minus 1 plus 4 times 6 minus -9 is : ");
        System.out.println("???");

        System.out.print("Is 67 greater than 4 * 5? ");
        System.out.println("???");

        System.out.print("Is 78 less than 4 * 5? ");
        System.out.print("???");
        */
        
        
        // Exercise 2
        /*
                double number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5.0;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "yellow";
        origin = "Martian";
        material = "platinum";
        purpose = "good";

        noun = "dragons";

        // Using the + with strings doesn't add -- it concatenates! (sticks them together)
        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape
                 + " " + color + " " + origin + " " + material + " " + purpose + " " + noun);
        */
        
        
        
        
        // Exercise 3
        /*
        int meaningOfLifeAndEverything = 42;
        double pi = 3.14159;
        String cheese, color;

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Give me pi to at least 5 decimals: ");
        Double.parseDouble(inputReader.nextLine());

        // We've used Double.parseDouble but meaningOfLifeAndEverything is an INT
        // so we'll have to use Integer.parseInt

        System.out.println("What is the meaning of life, the universe & everything? ");
        Integer.parseInt(inputReader.nextLine());

        System.out.println("What is your favorite kind of cheese? ");
        inputReader.nextLine();

        System.out.println("Do you like the color red or blue more? ");
        inputReader.nextLine();

//        System.out.println("Ooh, " + color + " " + cheese +" sounds delicious!");
//        System.out.println("The circumference of life is " +( 2 * pi * meaningOfLifeAndEverything));
        */
        
        
        
        
        
        // Exercise 4
        /*
                Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) { }
        } else if (action.equals("go to the house")) { }
        */
        
        
        
        // Exercise 5
        /*
        Random diceRoller = new Random();

        int rollResult = diceRoller.nextInt(6) + 1;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        }
        */
        
        
        
        // Exercise 6
        /*
        
        int timeNow = 5;
        int bedTime = 10;

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes
        }

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
        
        
        
        Scanner userInput = new Scanner(System.in);

        System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");

        String keepRiding = "y";
        int loopsLooped = 0;
        while (keepRiding.equals("y")) {
            System.out.println("WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!");
            System.out.print("Want to keep going? (y/n) :");
            keepRiding = userInput.nextLine();
            loopsLooped++;
        }

        System.out.println("Wow, that was FUN!");
        System.out.println("We looped that loop " + loopsLooped + " times!!");
    }
        
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Should I do it? (y/n) ");
        boolean doIt;

        if (input.next().equals("y")) {
            doIt = true; // DO IT!
        } else {
            doIt = false; // DONT YOU DARE!
        }

        boolean iDidIt = false;

        do {
            iDidIt = true;
            break;
        } while (doIt);

        if (doIt && iDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        }
        
        
        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;

        // Turns out the ocean is only so deep, 36200 at the deepest survey,
        // so if we reach the bottom ... we should probably stop.
        while(depthDivedInFt < 36200){
            System.out.println("So far, we've swum " + depthDivedInFt + " feet");

            if(depthDivedInFt >= 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            }

            // I can swim, really fast! 500ft at a time!
            depthDivedInFt += 1000;
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
        */
        
        
        
        
        // Exercise 7
        /*
        Scanner userInput = new Scanner(System.in);
        System.out.print("What year would you like to count back from? ");
        int year = userInput.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " years ago would be " + (year - i));
        }

        System.out.println("\nI can count backwards using a different way too...");

        for (int i = year; i >= year - 10; i--) {
            System.out.println( (year - i) + " years ago would be " + i);
        }
        
        
        int fish = 1;
        while(fish < 10){
            if(fish == 3){
                System.out.println("RED fish!");
            }else if(fish == 4){
                System.out.println("BLUE fish!");
            } else{
                System.out.println(fish + " fish!");
            }

            fish++;
        }
        
        
        for (int i = 0; i < 3; i++) {
            System.out.print("|");

            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print("*");
                }
                System.out.print("|");
            }
            System.out.println("");
        }
        */
        
        
        
        // Exercise Factorizer
        /*
        System.out.println("Enter an integer");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        boolean isPrime = true;
        int sumOfPrimes = 0;
        
        System.out.println("Results: ");
        for (int i = 1; i <= num; i++){
            
            // If it is a factor, print it out
            if (num % i == 0){
                
                System.out.println(i);
                sumOfPrimes += i;
                
                // Updadte isPrime
                if (i != 1 && i != num){
                    isPrime = false;
                }
                
                
            }
            
        }
        
        // Update sumOfPrimes
        sumOfPrimes -= num;
        
        // Print if it is prime
        if(isPrime){
            System.out.println("Is prime");
         
        }
        
        // Print isPrime and perfect Prime
        if( sumOfPrimes == num){
            System.out.println("Is perfect");
        }
        */
        
        
        // Exercise     : Interest Calculator
        /*
        System.out.println("Enter annual interest (without percent)");
        Scanner sc = new Scanner(System.in);
        double interest = sc.nextDouble();
        
        System.out.println("Enter principal: ");
        double principal = sc.nextDouble();   
        
        System.out.println("Enter number of years invested (integer): ");
        int yearsInvested = sc.nextInt();   
        
        double current = principal;
        
        // Loop through and calculate
        for(int i = 1; i <= yearsInvested; i++){
            
            // Print year number
            System.out.println("Year " + i);
            
            // Principal at beginning of year
            System.out.println("Principal: " + current);
            
            // Interest earned for the year
            double newB = current * (1 + ((interest / 4) / 100) );
            newB = newB * (1 + ((interest / 4) / 100) );
            newB = newB * (1 + ((interest / 4) / 100) );
            newB = newB * (1 + ((interest / 4) / 100) );
            System.out.println("Interest earned for year: " + (newB - current));
            
            
            //Pirncipal at end of the yar
            System.out.println("Principal at end of yearL " + newB);
            
            // Update current
            current = newB;
            
            
        }
        */
        
        
        
        
        
        // Exercise Lucky Sevens
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    

 
    
    
    
    
    
    
    
    
}
