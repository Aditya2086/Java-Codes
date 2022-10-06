import java.util.Scanner;

class Main {
public static void main(String[] args) {
    
char s,a,e,i,o,u,A,E,I,O,U,x,y;
Scanner sc=new Scanner(System.in);
s = sc.nextChar();
    
x=(s=='a'||s=='e'||s=='i'||s=='o'||s=='u');
y=(s=='A'||s=='E'||s=='I'||s=='O'||s=='U');
if(x||y)
    
System.out.println("The Letter Is Vowel");
else
System.out.println("The Letter Is Consonant");
}
}
