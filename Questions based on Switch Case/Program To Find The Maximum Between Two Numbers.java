import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Input Two Integer");
        a = sc.nextInt();
        b = sc.nextInt();
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
