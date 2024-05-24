package basic_java;
import java.util.Scanner;;
public class string_io {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Name is :"+name);
    }
}
