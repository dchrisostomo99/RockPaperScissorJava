import javax.swing.JOptionPane;

public class RPS2 
{
    public static void main(String[] args) 
    {
        String player = "";
        int computer;
        String message = "";
        String instructions = "Type one of the following: \nRock \nPaper\nScissors";
        String compPick;
        final int LOW = 1;
        final int HIGH = 3;
        final int NUM_GAMES = 10;
        int gameCount = 0;
        int playerWins = 0;
        int compWins = 0;
        int tieGames = 0;

        //Loop that test how mant games have been played stopping at 10
        while(gameCount < 10)
        {
            player = "";
            message = "";
            //Computers randomly generated selection
            computer = LOW + (int)(Math.random() * HIGH);
            while(!player.equalsIgnoreCase("Rock") && !player.equalsIgnoreCase("Paper") && !player.equalsIgnoreCase("Scissors"));
            {
                player = JOptionPane.showInputDialog(null, "Enter ROCK,  \nPAPER, or, \nSCISSORS");
                player = player.toUpperCase();
                //Turn the numeric choice of player into a string for output
                if(player.startsWith("ro"))
                    player = "ROCK";
                else 
                    if(player.startsWith("pa"))
                    player = "PAPER";
                    else 
                        if(player.startsWith("sc"))
                        player = "SCISSORS";
                        else 
                            JOptionPane.showMessageDialog(null, "You must pick ROCK, PAPER, or Scissors!!");
            }            
                
            //Turn the numeric choice of computer into a string for output
            if(computer == 1)
            compPick = "ROCK";
            else 
                if(computer == 2)
                compPick = "PAPER";
                else 
                    compPick = "SCISSORS";
            
            //Game mechanics
            if(player == "ROCK")
                if(computer == 1)
                    message = "It's a tie!!";
                else 
                    if(computer == 2)
                        message = "You lose sucker!!";
                    else
                        message = "Hooray you are a winner";
            else 
                if(player == "PAPER")
                    if(computer == 2)
                        message = "It's a tie!!";
                    else 
                        if(computer == 3)
                            message = "BOOOO, computer won..";
                        else 
                            message = "You beat the nasty computer";
                            
            else 
                if(computer == 3) 
                    message = "We have a tie!!";
                else 
                    if(computer == 1)
                        message = "NOOOOOOOOOOO";
                    else 
                        message = "Yay! You have destroyed that machine";

        }//Ends while loop            
        //Output message dialog box displaying the results
        JOptionPane.showMessageDialog(null, "You chose " + player + "\nThe computer picked " + compPick + "\nResult: " + message);
    }//Ends main
}//Ends class
