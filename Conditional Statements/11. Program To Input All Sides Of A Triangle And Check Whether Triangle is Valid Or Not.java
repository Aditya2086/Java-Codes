import java.util.Scanner;

class Main {
public static void main(String[] args) {

int side1,side2,side3;
System.out.println("Enter Three Sides :- ");

Scanner sc=new Scanner(System.in);
side1 = sc.nextInt();
side2 = sc.nextInt();
side3 = sc.nextInt();

if((side1+side2>side3)||(side2+side3>side1))
{
System.out.println("Valid");
}
else if((side3+side1>side2))
{
System.out.println("Invalid");
}
else {
System.out.println("Not Triangle");
}
}
}
