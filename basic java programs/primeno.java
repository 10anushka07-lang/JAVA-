import java.util.Scanner;
public class primeno 
{
public static void main(String[] args) {
    int a =0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(" enter value of n =" +n);
    for (int i= 2;i<n-1;i++){
    if (n%i==0) {
         a=1;
        break;  }  }
    if(n==1)
    System.out.println(" 1 is unique no."+n);
    else if ( a==0)
    System.out.println("the given no is prime "+n);
    else 
    System.out.println(" the given no is composite"+n);
    sc.close();
}}
