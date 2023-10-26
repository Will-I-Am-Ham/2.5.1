//William Han, Josh Zeng
/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  private String name = ""; 
  private double points;
  
  public Player(){
    name = "";
    points = 0.0;
  }

  public Player(String name_, double points_){
    name = name_;
    points = points_;
  }

  public String getName()
  {
    return name;
  }
  
  public void setName(String x)
  {
    name = x;
  }
   
  public double getPoints()
  {
    return points;
  }
   
}