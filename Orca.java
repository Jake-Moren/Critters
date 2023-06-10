// Programmer: Jake Moren
// Class: CS 145 OL
// Date: 04/13/2023
// Lab: Lab 2 Critters 
// Reference Material: CS145 Week 2 lecture videos and critter zip
import java.awt.*; 

public class Orca extends Critter 
{//start of Orca class
   private String appearance = "O";
   //sets appearance of the orca
   
   public Action getMove(CritterInfo info) 
   {//behavior of animal 
      if (info.getFront() == Neighbor.OTHER) 
      {//start of if statment 
         return Action.INFECT;
      }//end of if statement 
      else if(info.getLeft() == Neighbor.OTHER)
      {//start of else statement
         return Action.INFECT; 
      }//end of else if
      else if (info.getRight() == Neighbor.OTHER)
      {//start of else if statement
         return Action.INFECT;
      }//end of else if statement
      else if (info.getBack() == Neighbor.OTHER)
      {//start of else if statement
         return Action.INFECT;
      }//end of else if statement
      else if (info.getFront () != Neighbor.WALL && info.getFront() != Neighbor.SAME)
      {//start of else statement
         return Action.HOP;
      }//end of if else statement
      else if (info.getFront () == Neighbor.SAME)
      {//start of else if statement
         return Action.RIGHT; 
      }//end of getMove
      else 
      {//start of else statement
         return Action.LEFT;
      }//end of else statement
   }//end of getMove
   
   public Color getColor()
   {//start of Color
      return Color.ORANGE;
   }//end of Color
  
  public String toString()
  {//start of toStrin
      return this.appearance; 
  }//end of else statement

}///end of bear class
   
