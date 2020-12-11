import java.util.Scanner;

public class MyApp {
    static Calculator calc;
    static boolean isRun = true;
    public static void main(String[] args) throws Exception {

        while (isRun) {
            ConvertToArab.createToRomeArr();
            Scanner in = new Scanner(System.in);
            System.out.print("Input a expression: ");
            String num = in.nextLine();
            calc = new Calculator(num);
        }


    }
}
