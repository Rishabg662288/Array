//Write a Java program to reverse an array of integer values.

class Array4
{
public static int[] reverse(int[] num)
{
for(int index=0;index<num.length;index++)
{
int temp= num[index];
num[index]=num[num.length-index-1];
num[num.length-index-1]=temp;
}
return num;
}
public static void main(String[] args)
{
int[] a1={1,2,3,4,5,6,7,8,9};
System.out.println(reverse(a1));
}
}
