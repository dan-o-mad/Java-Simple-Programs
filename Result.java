//Program 5.28

import java.util.Scanner;
public class Result{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

int n;



System.out.println("Enter your marks: ");


n = input.nextInt();

System.out.println("Result is " +  n > 40 ?  + "Pass" : "Fail" );

}


}