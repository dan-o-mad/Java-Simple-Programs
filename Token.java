import java.io.*;

public class Token{

public static void main( String []args ){


try{

  Reader f = new FileReader("e://a.txt");
  StreamTokenizer s = new StreamTokenizer(f);
Writer w = new FileWriter("e://Tokens.txt");

   
    while( s.nextToken() != -1 ){
       


System.out.println(s.sval);


 

}

}


catch(Exception ex){

System.out.println("S");
}


}

}


