import java.util.Scanner;

class Calculator {
 
    public static void main(String[] args) {
 
    	double a,b,result; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number value:");
        a = sc.nextDouble();
     
        System.out.println("Enter second number value:");
        b = sc.nextDouble();
 
        System.out.println("Enter any operator (+, -, *, /): ");
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
            System.out.println("You have entered wrong operator or value");
            return;
        }
 
        System.out.println(a+" "+opt+" "+b+": "+result);
    }
}
