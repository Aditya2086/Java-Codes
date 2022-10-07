import java.util.Scanner;

class Main {
public static void main(String[] args) {
int count , num;
count = 0;
Scanner sc = new Scanner(System.in);
   
System.out.println("Enter The Number :- ");
num = sc.nextInt();
for(; num != 0; num /= 10, ++count) {
}
System.out.println("The Number Of Digits In The Given Input is :- " + count);
}
}
