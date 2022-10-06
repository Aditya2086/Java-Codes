import java.util.*;

class Main
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
double a,b,c;
System.out.println("Enter The Total Electricity Units :- ");

a = sc.nextDouble();    
if(a<=50)
{
b=(0.5*a);
}
else if((a>50)&&(a<=150))
{
b=(50*0.5)+((a-50)*0.75);
}
else if((a>150)&&(a<=250))
{
b=(50*0.5)+(100*0.75)+((a-150)*1.2);
}
else 
{
b=(50*0.5)+(100*0.75)+(100*1.2)+((a-250)*1.5);
}        
c = ((20*b)/100)+b;
System.out.println(c+" is Your Total Bill");
}
}
