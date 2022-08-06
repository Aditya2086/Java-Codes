import java.util.Scanner;

public class DIV {
    public static void main(String[] args) {

        Scanner z=new Scanner(System.in);
        int a;
        System.out.print("Enter a Number :-\n");
        a=z.nextInt();

        if(a%5==0 && a%11==0)
            System.out.print("Number is Visible By 5 and 11");
        else
            System.out.print("Number is Not Divisible");
    }
}
