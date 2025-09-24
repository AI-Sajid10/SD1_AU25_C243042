import java.util.Scanner;

public class ExistingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int c = input.nextInt();
        if((a+c)%2==0){
            int b = (a+c)/2;
            System.out.println("Yes, B Exists: "+b);
        }else{
            System.out.println("No, B does not exists");
        }
    }
}
