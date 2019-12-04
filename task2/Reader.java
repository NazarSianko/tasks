import java.util.Scanner;
import java.io.*;
public class Reader {
    public String str;
    public void Scan() {
        System.out.println("Input string");
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
    }
}
