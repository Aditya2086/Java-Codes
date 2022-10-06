import java.util.Scanner;

class Main {
public static void main(String[] args) {
    
int a,b,max;
System.out.println("Enter Two Numbers :- ");
Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
if (a==b)
{
System.out.println("Equal");
}
max = (a > b) ? a : b;
System.out.println("Maximum Number is "+ max);
}
}
