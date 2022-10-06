import java.util.Scanner;

class Main {
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);
int a,b,c,max;
    
System.out.println("Enter Three Numbers :- ");
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();
    
if(a=b=c)
{
System.out.println("Equal");
return 0;
    
}
max = (a>b && a>c) ?a:(b>c) ?b:c;
System.out.println("\nMaximum Number is "+ max);
}
}
