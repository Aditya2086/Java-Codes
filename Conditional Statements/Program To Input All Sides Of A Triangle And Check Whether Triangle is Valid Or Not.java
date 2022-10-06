import java.util.Scanner;

class Main {
public static void main(String[] args) {
int a,b,c;
System.out.println("Enter Three Sides :- ");

Scanner sc = new Scanner(System.in);
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
if(a+b+c==180 && a!=0 && b!=0 && c!=0)
{
System.out.println("Valid");
}
else {
System.out.println("Invalid");
}
}
}
