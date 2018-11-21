//Program 4.17

public class Seco{

public static void main( String []args) {

int sec , s , m , h;

sec=5300;

h=sec/3600;
sec=sec%3600;

m=sec/60;
s=sec%60;




System.out.println("HH-MM-SS =  " + h + ":" + m + ":" + s);

}


}
