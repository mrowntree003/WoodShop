
//import statements
import java.util.*;     

// class beginning
class  Wood{
      
      //declare variables
      private final double ashCost = 4.85;
      private final double whiteOakCost = 5.75;
      private final double teakCost = 37.65;
      private final double birchCost = 5.05;
      private final double poplarCost = 3.20;
      
      private double length, width, volume, cost;
      private String name;
      
      //default 
      public Wood(){
         name = "";
         length = 0.0;
         width = 0.0;
         
      }
      
      //constructor
      public Wood(String inputName, double inputLength, double inputWidth){
      
         name = inputName;
         length = inputLength;
         width = inputWidth;
         
      }
      
      //set name of wood type
      public void setName(String inputName){
      
            name = inputName;
            
      }
      
      //return name of wood type
      public String getName(){
      
            return name;
            
      }
      
      //set length in inches
      public void setLength(double inputLength){
      
            length = inputLength;
            
      }
      
      //get length in inches
      public double getLength(){
      
            return length;
      }
      
      //set width in inches
      public void setWidth(double inputWidth){
      
            width = inputWidth;
            
      }
      
      //get width in inches
      public double getWidth(){
      
            return width;
            
      }
      
      //calculate cost of ash per boardfoot
      public double getAshCost(){
            cost = ashCost * length * width;
            return cost;
            
      }
      
      //calculate cost of white oak per boardfoot
      public double getWhiteOakCost(){
            cost = whiteOakCost * length * width;
            return cost;
            
      }
      
      //calculate cost of teak per boardfoot
      public double getTeakCost(){
      
            cost = teakCost * length * width;
            return cost;
      }
      
      //calculate cost of birch per boardfoot
      public double getBirchCost(){
      
            cost = birchCost * length * width;
            return cost;
      }
      
      //calculate cost of poplar per boardfoot
      public double getPoplarCost(){
      
            cost = poplarCost * length * width;
            return cost;
      }
            
      
      
      
         
}// end class