//Programming Ex 11

import java.util.Scanner;
public class exEleven{

public static void main( String []args ){

Scanner input = new Scanner(System.in);

double obMarks,percentage;
double total=1100;



System.out.println("Enter Obtained Marks: ");


obMarks = input.nextDouble();
percentage=(obMarks*100)/total;

if(percentage>=80){

System.out.println("Grade= A+");
}

else if(percentage>=70&&percentage<80){

System.out.println("Grade= A");
}

else if(percentage>=60&&percentage<70){

System.out.println("Grade= B");
}

else if(percentage>=50&&percentage<60){

System.out.println("Grade= C");
}

else if(percentage>=40&&percentage<50){

System.out.println("Grade= D");
}

else if(percentage>=33&&percentage<40){

System.out.println("Grade= E");
}

else if(percentage<33){

System.out.println("Grade= F");
}



}
}