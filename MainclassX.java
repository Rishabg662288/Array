import java.util.Scanner;
class MainclassX
{
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
  } 
}
