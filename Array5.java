class Array5
{
public static void max123(int[] ar)
{
int max1=ar[0]; int pos1=0;
int max2=ar[1]; int pos2=1;
int max3=ar[2]; int pos3=2;

for(int i=0; i<ar.length; i++)
{
if(max1<ar[i] && max2<ar[i])
{
max3=max1;
pos3=pos1;
max1=ar[i];
pos1=i;
}
else if(max2<ar[i])
{
max3=max2;
pos3=pos2;
max2=ar[i];
pos2=i;
}
else if(max3<ar[i])
{
max3=ar[i];
pos3=i;
}
}
System.out.println("max1="+max1);
System.out.println("max2="+max2);
System.out.println("max3="+max3);
}
public static void main(String[] args)
{
int[] a1={1,2,3,4,5};
max123(a1);
}
}





















