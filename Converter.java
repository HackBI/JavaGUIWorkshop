/**
Your Name
Today
Creating a binary/decimal/hex calculator for a Java GUI Workshop
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Converter {

   //the components you need to use to make it
   private JFrame frame;
   private JButton[] buttons;
   private JButton buttonSwitch;
   private JButton buttonConvert;
   private JButton buttonClear;
   private int currentBase;
   private int nextBase;
   private JLabel label;
   private JLabel label2;
   private int inputNum;
      //keeps track of the number to be converted
   private int outputNum;
      //holds number that has been converted


   private JLabel errorDisplay; //may or may not want to use this
   //depends on if you want to check if the
   //inputNum or outputNum is too large
     
     
   //Constructor for the GUI interface we're using
   //set up frame, instantiate universal variables
   //EXCEPT buttons b/c buttons instatiated in fillAllButtons()
   //instantiate add all needed components (these are also universals)
   public Converter(int cBase, int nBase) {   
   } 
   
   //instantiate a Converter
   public static void main(String[] args) {
      
   }
   
   //here to make it easier for you
   public static String getStringBase(int base) {
         
      switch(base) {
         case 2:
            return "Binary";
         case 10:
            return "Decimal";
         default: 
            return "Error: not an available base";
      }
      
   }
   
   //instantiate and add all needed buttons (with correct text)
   //add approppriate ActionListeners for buttons (look below)
   //make sure to add different buttons for different bases (if statement)
   //for loop may be helpful (for number buttons)
   //so you do not have to write out code for all buttons
   public void fillButtons() {
   }
   
   
   //called when a number button is clicked
   public class NumButtonListener implements ActionListener {
      
      //adds number clicked to inputNum in correct place value
      //make sure it shows up on label
      //challenge: ensure there will be no leading zeros
      public void actionPerformed (ActionEvent e) {   
      }
   }
   
   //called when buttonConvert clicked
   //where you would use errorDisplay if you want to
   public class ConvertButtonListener implements ActionListener {
      
      //should be able to convert from binary to decimal and back
      //for binary to decimal can use:
      //       Integer.parseInt(String s, int baseStringIsIn);
      //       [s is where you'd put the binary as a String]
      //for decimal to binary can use:
      //       Integer.toBinaryString(int decimalInt)
      //make sure label2 displays converted number
      public void actionPerformed(ActionEvent e) {
              
      }   
   
   }
   
   //used when buttonClear clicked
   public class ClearButtonListener implements ActionListener {
      
      //resets inputNum and outputNum 
      //removes the numbers from label and label2
      public void actionPerformed(ActionEvent e) {
      }
   }
   
   //used when buttonSwitch clicked
   public class SwitchButtonListener implements ActionListener {
      
      //switch currentBase and nextBase
      //best to do this by instantiating a new Converter
      //dispose of old frame before creating a new Converter
      // can use JFrame.dispose();
      public void actionPerformed(ActionEvent e) {
           
      }
   }
   
}