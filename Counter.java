import java.io.*;

public class Counter{

public static void main( String []args ){

try{

FileInputStream a = new FileInputStream("E:/a.txt"); 




int counter=0;

    while(a.read() != -1){
     counter=counter+1;

}

System.out.println("Total characters = "+ counter);
}

catch(Exception e ){

System.out.println("Exception");

}



}
}