import java.util.Scanner;

class Main {
public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
int a;
System.out.print("Enter a Number :-\n");
a = sc.nextInt();

if(a>0)
System.out.print("Positive Number");
    
if(a<0)
System.out.print("Negative Number");
    
if(a==0)
System.out.print("Number Is Equal To Zero");
    
}
}
