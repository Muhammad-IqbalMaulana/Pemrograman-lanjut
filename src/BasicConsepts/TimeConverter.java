package BasicConsepts;
import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        //your code goes here
        int h = days * 24;
        int u = h * 60;
        int i = u * 60;
        System.out.println(i)
        ;
    }
}
