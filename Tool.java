/*
   Homework
   Program Description - Wood Store
   Author: Melody Hancock
   Date: 07/03/2018
   Project Name: Tool Class
*/

//import statements
import java.util.*;
import java.text.*;

// name of class and file
class Tool { 

//define variables
double price;
String description;
private double drill = 39.99;
private double saw = 129.99;
private double hammer = 15.99;
private double level = 29.99;
private double knife = 59.99;

//constructor default
public Tool ()   {
description = "none";
price = 0.00;
}
//constructor sets  values
public Tool (String thing, double cost)   {
description = thing;
price = cost;
}

//accessors and modifiers for description
public String getDescription() {                //accessor
   return description;
   }
public void setDescription(String thing) {       //modifier
      description = thing;
   }
//accessors and modifiers for price
public String getPrice() {                //accessor
   return description;
   }
public void setPrice(double cost) {       //modifier
      price = cost;
   }
//accessors and modifiers for drill
public double getDrill() {                //accessor
   return drill;
   }
public void setDrill(double drillCost) {       //modifier
      drill = drillCost;
   }
//accessors and modifiers for saw
public double getSaw() {                //accessor
   return saw;
   }
public void setSaw(double sawCost) {       //modifier
      saw = sawCost;
   }
//accessors and modifiers for hammer
public double getHammer() {                //accessor
   return hammer;
   }
public void setHammer(double hammerCost) {       //modifier
      hammer = hammerCost;
   }
//accessors and modifiers for level
public double getLevel() {                //accessor
   return level;
   }
public void setLevel(double levelCost) {       //modifier
      level = levelCost;
   }
//accessors and modifiers for knife
public double getKnife() {                //accessor
   return hammer;
   }
public void setKnife(double knifeCost) {       //modifier
      knife = knifeCost;
   }
   


} //end class