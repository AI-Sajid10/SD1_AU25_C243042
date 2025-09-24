import java.util.Scanner;

public class LowerUppeCaseConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String w =  input.nextLine();
        String result = w.substring(0,1).toUpperCase() + w.substring(1);
        System.out.println(result);
    }
}
