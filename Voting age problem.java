import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total number of people (N): ");
        int N = input.nextInt();
        int[] ages = new int[N];
        System.out.print("Enter the minimum voting age (X): ");
        int X = input.nextInt();
        System.out.println("Enter the ages of all people: ");
        for(int i = 0; i < N; i++) {
            ages[i] = input.nextInt();
        }
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            if(ages[i] >= X) {
                cnt++;
            }
        }
        System.out.println("Number of eligible voters: " + cnt);
    }
}
