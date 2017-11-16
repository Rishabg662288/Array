import java.util.Scanner;
class Mainclass
{
public static void main(String []Rishab)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size of array");
  int size = sc.nextInt();

  int []ar=new int[size];
  for(int i=0;i<ar.length;i++)
     {
	   System.out.println("enter the value at "+i+" position");
	   ar[i]=sc.nextInt();
     }

  System.out.println("the array element are");
  for(int i=0;i<ar.length;i++)
     {
         System.out.println("ar["+i+"]="+ar[i]);
     }
}
}
   
