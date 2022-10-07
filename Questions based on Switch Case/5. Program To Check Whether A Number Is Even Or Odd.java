import java.util.Scanner;

class Main {
    
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
    
System.out.print("Enter The Integer Number :- ");

int num = sc.nextInt();

switch(num%2){
case 0:
System.out.println(num+" is An Even Number");
break;
        
case 1:
System.out.println(num+" is An Odd Number");
}
}
}
