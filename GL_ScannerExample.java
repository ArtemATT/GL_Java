import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        String breakText = "exit";
        String inputText;
        Scanner sc = new Scanner(System.in);

        while (true) {
            inputText = sc.next();
            if (inputText.equals(breakText))
            {
                System.out.println(inputText);
                break;
            }
            else System.out.println(inputText);
        }
    }
}
