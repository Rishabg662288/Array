// First maximum and its position
import java.util.Scanner;
class Mainclass1
{  
 public static void firstMax(int [] ar)
 {
  int max= ar[0];
  int position= 0;
 
 for(int i=1;i<ar.length;i++)
 { 
  if(max<ar[i])
   {
    max= ar[i];
    position = i;
   }
  }

  System.out.println("Maximum element is "+max);
  System.out.println(" position of maximum element is "+position);
 }

  public static void main(String[]args)
  { 
	   Scanner sc = new Scanner(System.in);
	   System.out.println(" Enter the size");
	   int size =sc.nextInt();
   
        int []ar = new int[size];
        for(int i=0; i<ar.length; i++)
   { 
	    System.out.println("enter the value at "+i+" position");
	    ar[i]=sc.nextInt();
   }
   
         System.out.println("enter the array element");
         for(int i=0;i<ar.length;i++)
   { 
           System.out.println("ar["+ i + "]="+ar[i]);
   } 
         firstMax(ar);
  }
}
