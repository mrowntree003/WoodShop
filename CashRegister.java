

import java.util.*;
import java.text.*;

class CashRegister {

   public static void main(String[] args) {
   //declae variabbles
   double total = 0; 
   double totalAfterTax = 0;
   final double SALESTAX = 0.08;
   boolean goOn = true;
   String purchase, purchaseType;
   int toolType, woodType;
   DecimalFormat df = new DecimalFormat("0.00");
  
   
   
   double boardWidth, boardLength;
   Scanner scanner = new Scanner(System.in);
   //ask if user would like to purchase item until they say no
   while (goOn == true)
   {
   System.out.println("Would you like to purchase an item? (yes/no)");
   purchase = scanner.next();
      while(!purchase.equals("no") && !purchase.equals("yes"))
         {
            System.out.println("Invalid selection. Enter yes or no: ");
            purchase = scanner.next();
         }
      if (purchase.equals("no"))
         {
            goOn= false;
         }
         
      else if (purchase.equals("yes") ) 
         {
            goOn=true;
            //ask if user is purchasing wood or tool and read input
            System.out.println("Are you purchasing wood or a tool? (wood/tool)");
            purchaseType = scanner.next();
               while (!purchaseType.equals("tool")&& !purchaseType.equals("wood"))
                  {
                     System.out.println("Invalid selection. Please select wood or tool: ");
                     purchaseType = scanner.next();
                  }
                  //if tool, give user option of the 5 tools
               if (purchaseType.equals("tool")) 
                  {
                     System.out.println("Please enter the number of the tool you would like to purchase:");
                     System.out.println("(Drill=1, Saw=2, Hammer=3, Level=4, Knife=5)");
                     toolType = scanner.nextInt();
                     while (toolType != 1 && toolType != 2 && toolType != 3 && toolType != 4 && toolType != 5)
                        {
                           System.out.println("Invalid selection.  Please enter 1,2,3,4, or 5: ");
                           toolType = scanner.nextInt();
                        }
                     //create new Tool object
                     Tool newTool = new Tool();
                     //get price for selected tool and add to total
                     switch (toolType) 
                     {
                        case 1: 
                           total = total + newTool.getDrill();
                           break;
                           
                        case 2:
                           total = total + newTool.getSaw();
                           break;
                           
                        case 3:
                           total = total + newTool.getHammer();
                           break;
                           
                        case 4:
                           total = total + newTool.getLevel();
                           break;
                           
                        case 5:
                           total = total + newTool.getKnife();
                           break;
                     }
                  }
                  
                  else 
                     {  //if wood, ask for length and width
                        System.out.println("Please enter the width of your board (in inches):");
                        boardWidth = scanner.nextDouble();
                        System.out.println("Please enter the length of you board (in inches):");
                        boardLength = scanner.nextDouble();
                        //create wood object and use length and width methods
                        Wood newWood = new Wood();
                        newWood.setWidth(boardWidth);
                        newWood.setLength(boardLength);
                        //ask for wood type
                        System.out.println("Please enter the number of the wood type you would like to purchase:");
                        System.out.println("Ash=1, White Oak=2, Teak=3, Birch=4, Poplar=5)");
                        woodType = scanner.nextInt();
                        while (woodType != 1 && woodType != 2 && woodType != 3 && woodType != 4 && woodType != 5)
                           {
                              System.out.println("Invalid selection.  Please enter 1,2,3,4, or 5: ");
                              woodType = scanner.nextInt();
                           }
                        //get price for selected wood and add to total
                        switch (woodType) 
                        {
                           case 1:
                              
                              total = total + newWood.getAshCost();
                              break;
                              
                           case 2:
                              
                              total = total + newWood.getWhiteOakCost();
                              break;
                              
                           case 3:
                              total = total + newWood.getTeakCost();
                              break;
                              
                           case 4:
                              total = total + newWood.getBirchCost();
                              break;
                              
                           case 5:
                              total = total + newWood.getPoplarCost();
                              break;
                        }
                     }
                    
         }
   }           //calculate total after tax and print results
               totalAfterTax = total + (total * SALESTAX);
               System.out.println("Your total is $" + df.format(totalAfterTax));
               System.out.println();
               System.out.println("Thank you for your purchase!");
               System.out.println("Have a great day!");
   
   }

}     