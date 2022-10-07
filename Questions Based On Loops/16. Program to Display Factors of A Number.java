import java.util.Scanner;

class Main 
{
public static void main(String[] args) 
{
int input, i;
Scanner sc = new Scanner(System.in);  
System.out.println("Enter The Number :- ");
input = sc.nextInt();
   
System.out.println("The Factors Of " + input + " Are :- ");
for(i = 1; i <= input; ++i) 
{
if(input % i == 0) 
{
System.out.println(i + " ");
}
}
}
}
