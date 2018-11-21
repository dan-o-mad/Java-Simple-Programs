//Programming Ex 10

import java.util.Scanner;
public class exTen{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

double temp;



System.out.println("Enter Temperature: ");


temp = input.nextDouble();

if(temp>35){

System.out.println("Hot day");
}

else if(temp>=25&&temp<=35){

System.out.println("Pleasent day");
}

else if(temp<25){

System.out.println("Cool Day");
}



}


}