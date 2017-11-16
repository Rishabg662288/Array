//Write a Java program to find the index of an array element.
class Array3
{
public static int findindex(int[] num, int t)
{
int last=num.length-1;
for(int index=0;index<num.length;index++)
{
if(num[index]==t)
{
return index;
}
}
return -1;
}

public static void main(String[] args)
{
int[] a1={1,2,3,4,5,6,7,8,9,10};
System.out.println(findindex(a1,6));
}
}

