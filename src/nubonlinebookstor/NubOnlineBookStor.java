
package nubonlinebookstor;

import java.util.Scanner;


public class NubOnlineBookStor {
    
    static  Scanner input = new Scanner (System.in); // scanner userInput
    static String bookNameInput, priceCalculateInput, code ; // userInput bookName&teacher or student
    static public String [] bookNames = {"Java", "C", "C++", "Python", "Kotlin"}; // book names
    static public double [] bookPrice = {500,400,450,520,550}; // books price
     static public double teacherDiscount = 8; // teacher discount
    static public double studentDiscount = 5; // student discount
    static public double normalPublicDiscount = 0; // normal Public Discount
   
    
    public static void main(String[] args) {
    
        System.out.println("<<----- WELCOME TO OUR 'NUB_ONLINE_BOOK_STORE' ----->>"); // welcome dailouge
        System.out.println("Avaible book ---> Java, C, C++, Python, Kotlin.");
   
        choseBook();
    }
    
    
    
  // ----------------  choseBook method running
    
   static public void choseBook(){
       
        
        System.out.print("\nWhich book do you want?\nAns: "); // chose book
        bookNameInput=input.nextLine(); //user input
        
           // ----------------  user input conditon check start
        
        if(bookNames[0].toLowerCase().equals(bookNameInput.toLowerCase())){
          
            teacherStudentPriceCalulate(bookNames[0],bookPrice[0]);
            
        }else  if(bookNames[1].toLowerCase().equals(bookNameInput.toLowerCase())){
      
            teacherStudentPriceCalulate(bookNames[1],bookPrice[1]);
            
        } else  if(bookNames[2].toLowerCase().equals(bookNameInput.toLowerCase())){
          
            teacherStudentPriceCalulate(bookNames[2],bookPrice[2]);
            
        }else  if(bookNames[3].toLowerCase().equals(bookNameInput.toLowerCase())){
           
            teacherStudentPriceCalulate(bookNames[3],bookPrice[3]);
            
        }else  if(bookNames[4].toLowerCase().equals(bookNameInput.toLowerCase())){
          
            teacherStudentPriceCalulate(bookNames[4],bookPrice[4]);
        }else {
            System.out.println("Sorry!!,We don't have that book. Please try again.");
            choseBook();
            
        } // ---------------- user input condition check end
        
    } // ----------------  choseBook method end
    
   
   
   
   
   
    
    
    
    
    // ---------------- teacherStudentPriceCalulate method start
    
    static public void teacherStudentPriceCalulate(Object bk, Object bp){
        
        System.out.print("\nAre you Teacher, Student, Others?\nAns: ");
        priceCalculateInput=input.nextLine();
        
      
        
        
        
        
        
        // Teacher----------------------------------------start
        if(priceCalculateInput.toLowerCase().equals("Teacher".toLowerCase())){
              System.out.print("\nInput your teacher cupon code\nAns: ");
              code=input.nextLine(); 
              
  if(priceCalculateInput.toLowerCase().equals("Teacher".toLowerCase()) && code.equals("NUBteacher")){
            
      if(bp.equals(bookPrice[0])){
           System.out.println("\n<<---------------Shopping Receipts---------------->>");
            System.out.println("javYou opted for "+bookNames[0]+" Book.");
             System.out.println(bookNameInput+" Book total price = "+bookPrice[0]+" Tk");
             
           bookPrice[0] = bookPrice[0]-((bookPrice[0]*teacherDiscount)/100) ;
           
            System.out.println("\nYour order is confrim,You got "+teacherDiscount+" % discount.\nYour total payable amount: "+bookPrice[0]+" Tk");
            System.out.println("\n<<----- THANK YOU FOR SHOPPING FROM OUR 'NUB_ONLINE_BOOK_STORE' ----->>\n\n\n\n");
       
      }else if(bp.equals(bookPrice[1])){
            System.out.println("\n<<---------------Shopping Receipts---------------->>");
            System.out.println("\nYou opted for "+bookNames[1]+" Book.");
            System.out.println(bookNameInput+" Book total price = "+bookPrice[1]+" Tk");
            
           bookPrice[1] = bookPrice[1]-((bookPrice[1]*teacherDiscount)/100) ;
          
            System.out.println("\nYour order is confrim,You got "+teacherDiscount+" % discount.\nYour total payable amount: "+bookPrice[1]+" Tk");
            System.out.println("<<----- THANK YOU FOR SHOPPING FROM OUR 'NUB_ONLINE_BOOK_STORE' ----->>\n\n\n\n");
       
      }else if(bp.equals(bookPrice[2])){
          System.out.println("\n<<---------------Shopping Receipts---------------->>");
            System.out.println("\nYou opted for "+bookNames[2]+" Book.");
            System.out.println(bookNameInput+" Book total price = "+bookPrice[2]+" Tk");
            
           bookPrice[2] = bookPrice[2]-((bookPrice[2]*teacherDiscount)/100) ;
            
            System.out.println("\nYour order is confrim,You got "+teacherDiscount+" % discount.\nYour total payable amount: "+bookPrice[2]+" Tk");
            System.out.println("<<----- THANK YOU FOR SHOPPING FROM OUR 'NUB_ONLINE_BOOK_STORE' ----->>\n\n\n\n");
       
      }else if(bp.equals(bookPrice[3])){
          System.out.println("\n<<---------------Shopping Receipts---------------->>");
            System.out.println("\nYou opted for "+bookNames[3]+" Book.");
            System.out.println(bookNameInput+" Book total price = "+bookPrice[3]+" Tk");
            
           bookPrice[3] = bookPrice[3]-((bookPrice[3]*teacherDiscount)/100) ;
            
            System.out.println("\nYour order is confrim,You got "+teacherDiscount+" % discount.\nYour total payable amount: "+bookPrice[3]+" Tk");
            System.out.println("<<----- THANK YOU FOR SHOPPING FROM OUR 'NUB_ONLINE_BOOK_STORE' ----->>\n\n\n\n");
        
      }else if(bp.equals(bookPrice[4])){
           System.out.println("\n<<---------------Shopping Receipts---------------->>");
            System.out.println("\nYou opted for "+bookNames[4]+" Book.");
            System.out.println(bookNameInput+" Book total price = "+bookPrice[4]+" Tk");
            
           bookPrice[4] = bookPrice[4]-((bookPrice[4]*teacherDiscount)/100) ;
           
            System.out.println("\nYour order is confrim,You got "+teacherDiscount+" % discount.\nYour total payable amount: "+bookPrice[4]+" Tk");
            System.out.println("<<----- THANK YOU FOR SHOPPING FROM OUR 'NUB_ONLINE_BOOK_STORE' ----->>\n\n\n\n");
        }
      
  
      }else {
         System.out.println("Invaid cupon code,Please try again.!!\n\n");
     }
        } 
          // Teacher----------------------------------------end
          
      
      
          
          
          
          
          
          
          
          
        
        
           // Student----------------------------------------start
        
       else if(priceCalculateInput.toLowerCase().equals("Student".toLowerCase())){
              System.out.print("\nInput your student cupon code\nAns: ");
              code=input.nextLine(); 
              
     if(priceCalculateInput.toLowerCase().equals("Student".toLowerCase()) && code.equals("NUBstudent")){
          
           if(bp.equals(bookPrice[0])){
                System.out.println("\n<<---------------Shopping Receipts---------------->>");
            System.out.println("\nYou opted for "+bookNames[0]+" Book.");
            System.out.println(bookNameInput+" Book total price = "+bookPrice[0]+" Tk");
            
           bookPrice[0] = bookPrice[0]-((bookPrice[0]*studentDiscount)/100) ;
           
            System.out.println("\nYour order is confrim,You got "+studentDiscount+" % discount.\nYour total payable amount: "+bookPrice[0]+" Tk");
            System.out.println("\n<<----- THANK YOU FOR SHOPPING FROM OUR 'NUB_ONLINE_BOOK_STORE' ----->>\n\n\n\n");
       
      }else if(bp.equals(bookPrice[1])){
          System.out.println("\n<<---------------Shopping Receipts---------------->>");
            System.out.println("\nYou opted for "+bookNames[1]+" Book.");
            System.out.println(bookNameInput+" Book total price = "+bookPrice[1]+" Tk");
            
           bookPrice[1] = bookPrice[1]-((bookPrice[1]*studentDiscount)/100) ;
            
            System.out.println("\nYour order is confrim,You got "+studentDiscount+" % discount.\nYour total payable amount: "+bookPrice[1]+" Tk");
            System.out.println("<<----- THANK YOU FOR SHOPPING FROM OUR 'NUB_ONLINE_BOOK_STORE' ----->>\n\n\n\n");
       
      }else if(bp.equals(bookPrice[2])){
          System.out.println("\n<<---------------Shopping Receipts---------------->>");
            System.out.println("\nYou opted for "+bookNames[2]+" Book.");
            System.out.println(bookNameInput+" Book total price = "+bookPrice[2]+" Tk");
            
           bookPrice[2] = bookPrice[2]-((bookPrice[2]*studentDiscount)/100) ;
            
            System.out.println("\nYour order is confrim,You got "+studentDiscount+" % discount.\nYour total payable amount: "+bookPrice[2]+" Tk");
            System.out.println("<<----- THANK YOU FOR SHOPPING FROM OUR 'NUB_ONLINE_BOOK_STORE' ----->>\n\n\n\n");
       
      }else if(bp.equals(bookPrice[3])){
           System.out.println("\n<<---------------Shopping Receipts---------------->>");
            System.out.println("\nYou opted for "+bookNames[3]+" Book.");
            System.out.println(bookNameInput+" Book total price = "+bookPrice[3]+" Tk");
            
           bookPrice[3] = bookPrice[3]-((bookPrice[3]*studentDiscount)/100) ;
           
            System.out.println("\nYour order is confrim,You got "+studentDiscount+" % discount.\nYour total payable amount: "+bookPrice[3]+" Tk");
            System.out.println("<<----- THANK YOU FOR SHOPPING FROM OUR 'NUB_ONLINE_BOOK_STORE' ----->>\n\n\n\n");
        
      }else if(bp.equals(bookPrice[4])){
           System.out.println("\n<<---------------Shopping Receipts---------------->>");
            System.out.println("\nYou opted for "+bookNames[4]+" Book.");
            System.out.println(bookNameInput+" Book total price = "+bookPrice[4]+" Tk");
            
           bookPrice[4] = bookPrice[4]-((bookPrice[4]*studentDiscount)/100) ;
           
            System.out.println("\nYour order is confrim,You got "+studentDiscount+" % discount.\nYour total payable amount: "+bookPrice[4]+" Tk");
            System.out.println("<<----- THANK YOU FOR SHOPPING FROM OUR 'NUB_ONLINE_BOOK_STORE' ----->>\n\n\n\n");
        }

     }else {
         System.out.println("Invaid cupon code,Please try again.!!\n\n");
     }
       }
        // Student----------------------------------------ebd
       
       
       
       
       
       
       
         // Others----------------------------------------start
       else if(priceCalculateInput.toLowerCase().equals("Others".toLowerCase())){
              System.out.print("\nDiscount offer not avaible for you.");
              
         
               if(bp.equals(bookPrice[0])){
                   System.out.println("\n<<---------------Shopping Receipts---------------->>");
            System.out.println("\nYou opted for "+bookNames[0]+" Book.");
            System.out.println(bookNameInput+" Book total price = "+bookPrice[0]+" Tk");
            
           bookPrice[0] = bookPrice[0]-((bookPrice[0]*normalPublicDiscount)/100) ;
            
            System.out.println("\nYour order is confrim.\nYour total payable amount: "+bookPrice[0]+" Tk");
            System.out.println("\n<<----- THANK YOU FOR SHOPPING FROM OUR 'NUB_ONLINE_BOOK_STORE' ----->>\n\n\n\n");
       
      }else if(bp.equals(bookPrice[1])){
          System.out.println("\n<<---------------Shopping Receipts---------------->>");
            System.out.println("\nYou opted for "+bookNames[1]+" Book.");
            System.out.println(bookNameInput+" Book total price = "+bookPrice[1]+" Tk");
            
           bookPrice[1] = bookPrice[1]-((bookPrice[1]*normalPublicDiscount)/100) ;
            
            System.out.println("\nYour order is confrim.\nYour total payable amount: "+bookPrice[1]+" Tk");
            System.out.println("<<----- THANK YOU FOR SHOPPING FROM OUR 'NUB_ONLINE_BOOK_STORE' ----->>\n\n\n\n");
       
      }else if(bp.equals(bookPrice[2])){
            System.out.println("\n<<---------------Shopping Receipts---------------->>");
            System.out.println("\nYou opted for "+bookNames[2]+" Book.");
            System.out.println(bookNameInput+" Book total price = "+bookPrice[2]+" Tk");
            
           bookPrice[2] = bookPrice[2]-((bookPrice[2]*normalPublicDiscount)/100) ;
          
            System.out.println("\nYour order is confrim.\nYour total payable amount: "+bookPrice[2]+" Tk");
            System.out.println("<<----- THANK YOU FOR SHOPPING FROM OUR 'NUB_ONLINE_BOOK_STORE' ----->>\n\n\n\n");
       
      }else if(bp.equals(bookPrice[3])){
           System.out.println("\n<<---------------Shopping Receipts---------------->>");
            System.out.println("\nYou opted for "+bookNames[3]+" Book.");
            System.out.println(bookNameInput+" Book total price = "+bookPrice[3]+" Tk");
            
           bookPrice[3] = bookPrice[3]-((bookPrice[3]*normalPublicDiscount)/100) ;
           
            System.out.println("\nYour order is confrim.\nYour total payable amount: "+bookPrice[3]+" Tk");
            System.out.println("<<----- THANK YOU FOR SHOPPING FROM OUR 'NUB_ONLINE_BOOK_STORE' ----->>\n\n\n\n");
        
      }else if(bp.equals(bookPrice[4])){
           System.out.println("\n<<---------------Shopping Receipts---------------->>");
            System.out.println("\nYou opted for "+bookNames[4]+" Book.");
            System.out.println(bookNameInput+" Book total price = "+bookPrice[4]+" Tk");
            
           bookPrice[4] = bookPrice[4]-((bookPrice[4]*normalPublicDiscount)/100) ;
           
            System.out.println("\nYour order is confrim.\nYour total payable amount: "+bookPrice[4]+" Tk");
            System.out.println("<<----- THANK YOU FOR SHOPPING FROM OUR 'NUB_ONLINE_BOOK_STORE' ----->>\n\n\n\n");
      
      } }  
        
        // Others----------------------------------------ebd
        
       
        else{
            System.out.println("Did not match your input");
            teacherStudentPriceCalulate("","");
        }
        

        
  
    } // ---------------- teacherStudentPriceCalulate method end
   

    
    
}
