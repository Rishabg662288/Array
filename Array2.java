class Array2
{
public static double avg(int [] num)
{
int last= num.length-1;
int sum=0;
double avg=0.0;
for(int i=0;i<=last;i++)
{
sum=sum+num[i];
avg=sum/num.length;
}
return avg;
}
public static void main(String[] args)
{
int[] a1={1,2,3,4,5,6,7,8,9,10};
System.out.println(avg(a1));
}
}

