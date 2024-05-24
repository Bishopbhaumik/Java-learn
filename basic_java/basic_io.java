package basic_java;
import java.util.Scanner;;
public class basic_io {
    public static void main(String[] args) {
        int a,b,c;
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);

        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        System.err.println(c);
    }
}
