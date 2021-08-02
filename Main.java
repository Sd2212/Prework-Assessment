import java.util.Scanner;
public class Main{
   Scanner sc=new Scanner(System.in);

      //function to check Palindrome
        
         public void checkPalindrome(){
            //Taking a number
              System.out.println("Enter a number:"); 
                   int pnum=sc.nextInt();
                   int temp,sum=0,rem;
       
           //comparing
              temp=pnum;
              while(pnum>0){
                    rem=pnum%10;
                    sum=(sum*10)+rem;
                    pnum=pnum/10;     
            }
               if(temp==sum)
                    System.out.println("Palindrome!!!");
                else
                    System.out.println("Not a palindrome");


        }

     //function to print pattern
        
          public  void printPattern(){
            System.out.println("Enter a number:"); 
                   int num=sc.nextInt();
        //inner loop 
          for(int i=num-1;i>=0;i--){

        // outer loop 
          for(int j=0;j<=i;j++){
       
          System.out.println("*");
         } 
          System.out.println();       
         }
        }


     //function to check numbernis prime or not
         
         public  void checkPrimeNumber(){
            
              System.out.println("Enter a number:"); 
                   int p =sc.nextInt();
                   int count=0,i;
             //0,1 are not prime number
               if(p<=1)                  
                   System.out.println("Not a prime number");
                 
               else{
                    for(i=2;i<=p-1;i++){
                            if(p%i==0){
                                 count++; }
                                  
          }
                if(count>0)                      
                    System.out.println("Not a Prime Number");
               
                else                    
                    System.out.println("It is a prime number:");           

                 
          }
    
        }


        //function to print Fibonacci Series
        
          public  void printFibonacciSeries(){
             
            //initalise the first and second value as 0,1 resp.
                int first=0, second=1,third,i,count=3 0;
                   System.out.println(first+""+second);
                  
                    for(i=2;i<count;i++){
                            third=first+second;
                           System.out.println(""+third);
                           first=second;
                           second=third;
                    
                          
     }
     }
     
     // main method which contains switch and do while loop
     
           public static void main(String d[]){
                 Main obj =new Main();
                 int choice;
                 Scanner sc=new Scanner(System.in);
     
      do{
           System.out.println("Enter your choice from below list\n"+"1.Find palindrome of number\n"+"2.Print Pattern for a given no.\n"+"3.Check whether the no is a prime or not.\n"+"4.Print Fibonacci Series.\n"+"-->Enter 0 to Exit.\n");
              System.out.println();

       choice= sc.nextInt();
       switch(choice){
            case 0:
                    choice=0;
                    break;
              case 1:{  
                  obj.checkPalindrome();
               }
                   break;
              case 2:{  
                  obj.printPattern();
               }
                   break;
             case 3:{  
                  obj.checkPrimeNumber();
               } 
                   break;
             case 4:{ 
                  obj.printFibonacciSeries();
               } 
                   break;
             default:  
                  System.out.println("Invalid choice. Enter a valid no.\n");
               
}
       }while(choice!=0);
             System.out.println("Exited Successfully!!!");
               sc.close();
}
}
     
     
     