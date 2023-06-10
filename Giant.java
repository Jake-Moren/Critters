// Programmer: Jake Moren
// Class: CS 145 OL
// Date: 04/13/2023
// Lab: Lab 2 Critters 
// Reference Material: CS145 Week 2 lecture videos and critter zip
import java.awt.*;

public class Giant extends Critter 
{//start of Giant class
   private int count = -1; 
   private final String[] giantNames = {"fee", "fie", "foe", "fum"};
   private String pastName;
   private int nameIndex = 0; 

   // constructor of the critter giant
   public Giant() 
   {//start of Gian 
 
   }//end of Giant
   
   public Action getMove(CritterInfo info)
   {//start of getMove
      if (info.getFront() == Neighbor.OTHER)
      {//start of if statement
         return Action.INFECT;
      }//end of if statement
      else if (info.getFront() == Neighbor.EMPTY)
      {//start of else if 
         return Action.HOP;  
      }//end of else if statement
      else
      {//start of else statement
         return Action.RIGHT;
      }//end of else statement
   }//end of get move 

   // returns the color of the giant
   public Color getColor() 
   {//start of getColor
      return Color.GRAY;
   }//end of getColor

   // returns the string value of the giant
   public String toString()
   {//start of toString
      this.count++; 
      if(this.count == 6)
      {//start of if statement
         this.count = 0; 
         if(this.nameIndex == 3)
         {//start of nested if statement
            this.nameIndex = 0; 
         }//end of nested if statement
         else
         {//start of else statement
            this.nameIndex++; 
         }//end of else statement
      }//end of if statement
      return this.giantNames[nameIndex]; 
   }//end of toString
}//end of class