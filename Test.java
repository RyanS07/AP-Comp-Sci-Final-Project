import java.util.Scanner;
import classes.SigFig;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(SigFig.add(a,b));
        sc.close();
    }
}