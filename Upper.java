import java.io.*;

public class Upper{

public static void main( String []args ){


try{

  Reader f = new FileReader("e://a.txt");

   
BufferedReader i = new BufferedReader(f);

        String str;


        str = i.readLine();

         String sss = str.toUpperCase();
            System.out.println(sss);

        //i.close();


BufferedWriter w = new BufferedWriter(new FileWriter("e://outy.txt"));
w.write(sss);

}


catch(Exception ex){

System.out.println("S");
}


}

}


