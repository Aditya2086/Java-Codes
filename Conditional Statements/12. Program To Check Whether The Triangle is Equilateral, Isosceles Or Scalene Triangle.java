import java.util.Scanner;

class Main {
public static void main(String args[]) {

Scanner sc = new Scanner(System.in);
int a, b, c;
System.out.print("Enter 3 Sides :- ");
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
        
if ((a < b + c) && (b < a + c) && (c < a + b)) 
{
if ((a == b) && (b == c))
System.out.println("Equilateral triangle");
        
else if ((a == b) || (b == c) || (c == a))
System.out.println("Isosceles triangle");

else
System.out.println("Scalene triangle");
}
}
}
