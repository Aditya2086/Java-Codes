import java.util.Scanner;

class Main  
{  
public static void main(String[] args)   
{  
Scanner input = new Scanner(System.in);  
System.out.print("Enter the value of A :- ");  
double a = input.nextDouble();  
System.out.print("Enter the value of B :-  ");  
double b = input.nextDouble();  
System.out.print("Enter the value of C :-  ");  
double c = input.nextDouble();  
double d = b * b - 4.0 * a * c;  
if (d> 0.0)   
{  
double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
System.out.println("The Roots Are " + r1 + " and " + r2);  
}   
else if (d == 0.0)   
{  
double r1 = -b / (2.0 * a);  
System.out.println("The Root is " + r1);  
}   
else   
{  
System.out.println("Roots are Not Real.");  
}  
}  
}  
