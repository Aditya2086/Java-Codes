import java.util.Scanner;

public class Main 
{
public static void main(String[] args) 
{
int high, low, i;
      
boolean temp;
System.out.println("Required Packages Have Been Imported");
Scanner sc = new Scanner(System.in);
   
System.out.println("A Reader Object Has Been Defined ");
System.out.println("Enter The Starting Number :- ");
   
low = sc.nextInt();
System.out.println("Enter An Ending Number :- ");
   
high = sc.nextInt();
System.out.println("The Prime Numbers Between The Interval " + low + " and " + high + " Are :- ");
while (low < high) 
{
temp = false;
for(i = 2; i <= low/2; ++i) 
{
if(low % i == 0) {
temp = true;
break;
}
}
if (!temp && low != 0 && low != 1)
System.out.println(low + " ");
++low;
}
}
}
