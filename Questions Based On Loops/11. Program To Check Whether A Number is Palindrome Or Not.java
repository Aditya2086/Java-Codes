import java.util.*;

class Main 
{  
public static void main(String[] args) 
{  
Scanner sc = new Scanner(System.in);
System.out.println("Enter The Number :- ");
   
String reverse = ""; 
String num = sc.nextLine(); 
int length = num.length();   
for (int i = length - 1; i >= 0; i--)
   
reverse = reverse + num.charAt(i);  
if(num.equals(reverse))
   
System.out.println("The Entered String " +num +" is A Palindrome.");  
else  
System.out.println("The entered string " +num +"  isn't A Palindrome.");     
}
} 
