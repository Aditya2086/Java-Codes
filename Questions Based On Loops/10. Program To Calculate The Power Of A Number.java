import java.util.Scanner;

class Main   
{  
public static void main(String[] args)    
{
Scanner sc = new Scanner(System.in); 
System.out.println("Enter The Base Value :- ");  
int base = sc.nextInt();
    
System.out.println("Enter The Exponent Value :- ");  
int exp = sc.nextInt();  
long result = 1;
    
System.out.print(base+ " Raised To The Power "+ exp+" is :- ");
while (exp != 0)
{
result *= base;
--exp;
}
System.out.println(result);
}  
}  
