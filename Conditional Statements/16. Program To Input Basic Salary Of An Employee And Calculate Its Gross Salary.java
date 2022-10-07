import java.util.*;

class Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

double sal,da,hra,g_sal;
System.out.println("Enter The Salary :-");

sal = sc.nextDouble();
if(sal<=10000)
{
da = sal*0.8;
hra = sal*0.2;
}
else if(sal<=20000)
{
da = sal*0.9;
hra = sal*0.25;
}
else if(sal<=30000)
{
da = sal*0.95;
hra = sal*0.3;
}
else
{
da = sal*0.0;
hra = sal*0.0;
}
g_sal=sal+da+hra;
System.out.println("Gross Salary is :- "+g_sal);
}
}
