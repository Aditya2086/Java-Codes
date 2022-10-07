import java.util.Scanner;

class Calculator {
 
public static void main(String[] args) {
 
double a,b,result; 
Scanner sc = new Scanner(System.in);
System.out.println("Enter First Number Value:");
a = sc.nextDouble();
     
System.out.println("Enter Second Number Value:");
b = sc.nextDouble();
 
System.out.println("Enter Any Operator (+, -, *, /): ");
char opt = sc.next().charAt(0);
 
switch(opt)
{
case '+':
result = a + b;
break;
 
case '-':
result = a - b; 
break;
 
case '*':
result = a * b;
break;
 
case '/':
result = a / b;
break;
 
default: 
System.out.println("You Have Entered Wrong Operator Or Value");
return;
}

System.out.println(a+" "+opt+" "+b+": "+result);
}
}
