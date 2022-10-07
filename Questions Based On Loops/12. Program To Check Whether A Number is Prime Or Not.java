import java.util.Scanner;

class Main
{
public static void main(String[] args)
{
int num, i, count = 0;
Scanner sc = new Scanner(System.in);
      
System.out.println("Enter A Number :- ");
num = sc.nextInt();
      
for(i=2; i<num; i++)
{
if(num%i == 0)
{
count++;
break;
}
}
if(count==0)
System.out.println("\nIt is A Prime Number.");
else
System.out.println("\nIt is Not A Prime Number.");
}
}
