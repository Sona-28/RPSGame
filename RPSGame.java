import java.util.*;


public class RPSGame{
    static void gameResult(int c1, int c2){
        if(c1==c2){
            System.out.println("Uhoh! You both chose the same thing!");
        }
        else{
            if (c1==1) {
                if(c2==2) System.out.println("Try again. Maybe your luck just went for a break!😒");
                else System.out.println("You smashed it. Literally smashed the scissors. I always beleived in you🫡");
            }
            else if(c1==2){
                if(c2==1) System.out.println("You crushed it. Start the party.🤩");
                else System.out.println("Losers are always the next leaders!🙃");
            }
            else{
                if(c2==1) System.out.println("Failures are the step to make you a leader.🙂");
                else System.out.println("It's not about losers or winner, but you WON!!🥳");
            }
        }
    }
    static int userInput(Scanner sc){
        boolean flag = true;
        int userchoice = 0;
        while (flag) {
            userchoice = sc.nextInt();
            if(userchoice>3 || userchoice<1){
                System.out.println("Choose any number between 1 to 3");
            }
            else{
                flag= false;
            }
        }
        return userchoice;
    }

    static void gameWithComputer(Scanner sc){
        System.out.println("Friends are always great and a game with them is just the way to have fun!");
        System.out.println("1.Rock👊\n2.Paper🤚\n3.Scissor✌️");
        System.out.println("Enter your choice(1 or 2 or 3): ");
        int userchoice = userInput(sc);
        System.out.println("The computer's playing...");
        Random rand = new Random();
        int computerchoice = rand.nextInt(3);
        String cchoice = "";
        switch (computerchoice) {
            case 0:
                cchoice = "Rock";
                break;
            case 1: 
                cchoice = "Paper";
            case 2:
                cchoice = "Scissor";
        }
        System.out.println("The computer's choice is " + cchoice);
        gameResult(userchoice, computerchoice+1);
    }
    
    static void gameWithFriend(Scanner sc){
        System.out.println("Friends are always great and a game with them is just the way to have fun!");
        System.out.println("1.Rock👊\n2.Paper🤚\n3.Scissor✌️");
        System.out.println("Enter your choice(1 or 2 or 3): ");
        int userchoice1 = userInput(sc);
        System.out.println("Enter friend's choice(1 or 2 or 3): ");
        int userchoice2 = userInput(sc);
        gameResult(userchoice1, userchoice2);


    }
    
    public static void main(String[] args){
        System.out.println("************************************************");
        System.out.println("Rock🪨 Paper📃 and Scissor✂️");
        System.out.println("************************************************");
        System.out.println("1. With Computer💻\n2. With Friend🤝");
        System.out.println("Enter your choice(1 or 2): ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("Great choice!!!");
        System.out.println("Get ready with your choice");
        System.out.println("************************************************");
        switch (choice) {
            case 1:
                gameWithComputer(sc);
                break;
            case 2:
                gameWithFriend(sc);
                break;
            default:
                break;
        }
       
    }
}