import java.util.Scanner;

class Mainclass22
 {
 public static int[] accending(int []ar)
 { 
  for(int i=0;i<ar.length-1;i++)
  {
   for(int j=i+1;j<ar.length;j++)
     {
    	if(ar[i]>ar[j])
 	  {
	   int t = ar[i];
 	   ar[i] = ar[j];
 	   ar[j] =  t;
 	  }
     }
  }
   return ar;
  }
 public static void main(String[] args)
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
            int [] nar=accending(ar);
  
            System.out.println("the sorted element are");
    
           for(int i=0; i<nar.length; i++)
            { 
             System.out.println("nar["+ i +"]="+nar[i]);
            }
          System.out.println("enter the which max");
          int max=sc.nextInt();
          if(max<=ar.length)
          System.out.println(nar[nar.length-max]);
          else
          System.out.println("invalid index");
         }
}

 

