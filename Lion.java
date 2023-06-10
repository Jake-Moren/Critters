// Programmer: Jake Moren
// Class: CS 145 OL
// Date: 04/13/2023
// Lab: Lab 2 Critters 
// Reference Material: CS145 Week 2 lecture videos and critter zip
import java.awt.*; 
import java.util.Random; 

public class Lion extends Critter 
{//start of the Lion class  
   private String appearance = "L"; 
   private int moves = 1; 
   private Random rand = new Random(); 
   private int RANGE = 3; 
   private Color[] colorArray = {Color.RED, Color.GREEN, Color.BLUE}; 
   private int randomIndex = this.rand.nextInt(RANGE);
 
   public Action getMove(CritterInfo info) 
   {//start of getMove, behavior of animal 
      if(this.moves == 3)
      {//start of if statment
         this.moves = 1;
         this.randomIndex = this.rand.nextInt(RANGE); 
      }//end of if statement
      else
      {//start of else statement
         this.moves++; 
      }//end of else statement
      if (info.getFront() == Neighbor.OTHER) 
      {//start of if statement
         return Action.INFECT;
      }//end of if statement
      else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL)
      {//start of else statement
         return Action.LEFT;
      }// end of else if statement
      else if (info.getFront() == Neighbor.SAME)
      {//start of else if statement
         return Action.RIGHT;
      }//end of else if statement
      else
      {//end of else statement
         return Action.HOP;
      }//end of else statement
  }//end of getMove
    
  public Color getColor()
  {//start of getColor
   return this.colorArray[this.randomIndex];
  }//end of getColor
  
  public String toString()
  {//start of toString
   return this.appearance; // "L"
  }//end of toString

}//end of lion class

