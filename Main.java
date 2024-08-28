import java.util.*;
public class Main{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      //Get the input from the user
      int a=sc.nextInt();
      //Check if the number in positive,negative,zero
      if(a>0)
      {
        System.out.println("Positive");
      }
      else if(a<0)
      {
        System.out.println("Negative");
      }
      else 
      {
        System.out.println("zero");
      }
    //check the week based on given input
    switch(a)
    {
     case 0:{
     System.out.println("Sunday");
     break; 
     } 
     case 1:{
     System.out.println("Monday");
     break;
     }
     case 2:{
     System.out.println("Tuesday");
     break;
     }
     case 3:{
     System.out.println("Wednesday");
     break;
     }
     case 4:{
     System.out.println("Thursday");
     break;
     }
     case 5:{
     System.out.println("Friday");
     break;
     }
     case 6:{
     System.out.println("Saturday");
     break; 
     }
     default:{
     System.out.println("Invalid");
     }
    }
    //print the number from 1 till the user input
    for(int i=1;i<=a;i++)
    {
        System.out.print(i+" ");
    }
   System.out.println(" ");
   //print the number in desending order from the user input
    while(a!=0)
    {
        System.out.print(a+" ");
         a--;
    }
    System.out.println(" ");
    //print the number from 1 to 3,demonstrate that the block execute atleast one
    int b=1;
    do{
       System.out.print(b);
       b++;
    }
    while(b<=3);
 }
}