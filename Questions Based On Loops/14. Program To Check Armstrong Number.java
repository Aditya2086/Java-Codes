import java.util.Scanner;

class Main 
{
public static void main(String[] args) 
{
int input, temp, remainder, result;
result = 0;
Scanner sc = new Scanner(System.in);

System.out.println("Enter The Number :- ");
input = sc.nextInt();
temp = input;
while (temp != 0) 
{
remainder = temp % 10;
result += Math.pow(remainder, 3);
temp /= 10;
}
if(result == input)
System.out.println(input + " is an Armstrong Number");
else
System.out.println(input + " is Not An Armstrong Number");
}
}
