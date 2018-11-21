//Program 5.22

import java.util.Scanner;
public class Comb{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int a,b,c;

System.out.println("Enter three digits: ");


a = input.nextInt();
b = input.nextInt();
c = input.nextInt();



if(( a!=b) && (b!=c) && (c!=a )){
System.out.println(a+b+c+"");
System.out.println(a+c+b+"");
System.out.println(b+a+c+"");
System.out.println(c+a+b+"");
System.out.println(c+b+a+"");
}

else
 {

if((a==b)&&(a==c)){
System.out.println(a+b+c);}
else
{
if(a==b){
System.out.println(a+b+c);
System.out.println(a+c+b);
System.out.println(c+b+a);

}
else
{
if(a==c){
System.out.println(a+c+b);
System.out.println(a+b+c);
System.out.println(b+a+c);
}

else
{

System.out.println(b+c+a);
System.out.println(b+a+c);
System.out.println(a+b+c);

}
}
}

}

}