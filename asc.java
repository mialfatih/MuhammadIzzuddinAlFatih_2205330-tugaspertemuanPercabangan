import java.util.Scanner;

public class asc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan tiga angka: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = max(a, b, c);

        System.out.println("nilai terbesar : " + max);

        input.close();
    }

    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c; 
        }
        return max;
    }
}
