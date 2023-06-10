// Programmer: Jake Moren
// Class: CS 145 OL
// Date: 04/13/2023
// Lab: Lab 2 Critters 
// Reference Material: CS145 Week 2 lecture videos and critter zip
import java.awt.*; 

//Bear newBearAnimal = new Bear(false);
public class Bear extends Critter 
{//start of bear class  Bear bearanimal = new Bear(true)
   private boolean isPolar = false; 
   private String appearance = "\\";
   //states that if boolean for it to be either a black bear or polar bear 

   public Bear(boolean polar)
   {//start of constructor method 
      isPolar = polar; 
   }//end of constructor 

   public Action getMove(CritterInfo info) 
   {//behavior of animal 
      if (info.getFront() == Neighbor.OTHER) 
      {//start of if statment 
         return Action.INFECT;
      }//end of if statement 
      else if(info.getFront() != Neighbor.WALL && info.getFront() != Neighbor.SAME)
      {//start of else statement
         return Action.HOP; 
      }//end of else if
      else
      {//start of else 
         return Action.LEFT; 
      }//end of if statment
   }//end of getMove
    
   public Color getColor()
   {//start of Color
      if(this.isPolar) return Color.WHITE;
      {//start of if statement 
         return Color.BLACK;
      }//end of if statement 
  }//end of Color
  
  public String toString()
  {//start of toString
   if(this.appearance.equals("\\"))
   {//start of if statement
      this.appearance = "/";
      return this.appearance; 
   }//end of if statement
   else
   {//start of else statement
      this.appearance = "\\";
      return this.appearance; 
   }//end of else statement
   }//end of toString
}//end of bear class

