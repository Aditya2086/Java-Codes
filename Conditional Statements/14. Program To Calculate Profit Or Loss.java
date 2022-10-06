import java.util.Scanner;

class Main {

public static void main(String[] args) {
double cp, sp, pl;
Scanner sc = new Scanner(System.in);
  
System.out.print("Enter The Cost Price :- ");
cp = sc.nextDouble();
System.out.print("Enter The Selling Price :- ");
sp = sc.nextDouble();
    
pl = sp - cp;
if (pl > 0)
System.out.print("Profit = " + pl);
else if (pl < 0)
  
System.out.print("Loss = " + -(pl));
else
System.out.print("No Profit, No Loss");
}
}
