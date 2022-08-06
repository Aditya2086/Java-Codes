import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner z=new Scanner(System.in);
        int a,b;
        System.out.println("Enter A Number :-");
        a=z.nextInt();
        if(a%2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");

    }
}
