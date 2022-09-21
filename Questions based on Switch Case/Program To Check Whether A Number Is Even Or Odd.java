import java.util.Scanner;

class Main {
    
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
    
System.out.print("Enter the integer number: ");

int num = sc.nextInt();

switch(num%2){
case 0:
    System.out.println(num+" is an Even number");
  break;
case 1:
    System.out.println(num+" is an Odd number");

}
}
}
