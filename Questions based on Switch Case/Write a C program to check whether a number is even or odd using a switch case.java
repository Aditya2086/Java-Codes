import java.util.Scanner;
class CheckOddEvenSwitch3{
public static void main(String args[]){
    Scanner scan=new Scanner(System.in); //create a scanner object for input
System.out.print("Enter the integer number: ");

int num=scan.nextInt();//get input from the user for num

switch(num%2){
case 0:
    System.out.println(num+" is an Even number");
  break;
case 1:
    System.out.println(num+" is an Odd number");

}

}
}
