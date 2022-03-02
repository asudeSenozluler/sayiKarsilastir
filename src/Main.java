import java.net.SecureCacheResponse;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a,b;
        System.out.println("Birinci sayıyı girin: ");
        a=scanner.nextInt();
        System.out.println("İkinci sayıyı girin: ");
        b=scanner.nextInt();
        if (a<b){
            System.out.println(a+"<"+b);
        }
        if (b<a){
            System.out.println(b+"<"+a);
        }
        else{
            System.out.println(a+"0"+b);
        }
	// write your code here
    }
}
