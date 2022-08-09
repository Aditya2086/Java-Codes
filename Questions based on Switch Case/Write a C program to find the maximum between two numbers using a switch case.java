import java.util.Scanner;
public class Funycode {
    public static void main(String[] args) {

        Scanner z=new Scanner(System.in);
        int a,b;
        System.out.println("Input Two Integer");
        a=z.nextInt();
        b=z.nextInt();
        switch(a > b)
        {
            case 0:
                System.out.println("maximum number " + b);
                break;
            case 1:
                System.out.println("maximum number " + a);
                break;
            default:
                System.out.println("Both are equal");
        }

    }
}
