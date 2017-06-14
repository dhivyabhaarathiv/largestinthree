import java.util.*;
public class Largestinthree
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3)
        {
        System.out.println(num1+" is the largest in given 3 numbers");
        }
        if(num2>num3 && num2>num1)
        {
        System.out.println(num2+" is the largest in given 3 numbers");
        }
        if(num3>num2 && num3>num1)
        {
        System.out.println(num3+" is the largest in given 3 numbers");
        }
        }
        }
