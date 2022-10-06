import java.util.Scanner;

class Main {
public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("Enter a Year :-");
a=sc.nextInt();
if(a%4==0)
if(a%100==0)
if(a%400==0)
System.out.println("Leap Year");
else
System.out.println("Not Leap Year");
else
System.out.println("Leap Year");
else
System.out.println("Not Leap Year");

}
}
