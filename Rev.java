//Program 4.23

public class Rev{

public static void main( String []args) {

int n , a , b , c , d;

n=92174;

a=n/10000;
n=n%10000;

b=n/1000;
n=n%1000;


c=n/100;
n=n%100;


d=n/10;
n=n%10;

System.out.println("Number in reverse order = ");
System.out.println(""+ n );
System.out.println(""+ d );
System.out.println(""+ c );
System.out.println(""+ b );
System.out.println(""+ a );
}


}