//William Han, Josh Zeng
/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
  Player player1;
  Player player2;

  Board board;
  boolean solved;
  /* your code here - constructor(s) */ 
  public PhraseSolver(String player1name, String player2name){
    player1 = new Player(player1name, 0);
    player1 = new Player(player1name, 0);

    board = new Board();
    solved = false;
  }
  /* your code here - accessor(s) */
  
  /* your code here - mutator(s)  */

  public void play()
  {
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */
      
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}