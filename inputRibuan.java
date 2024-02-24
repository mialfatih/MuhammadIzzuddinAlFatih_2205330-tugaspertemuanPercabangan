import java.util.Scanner;

public class InputRibuan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] a = new int[3];
        
        for (int i = 0; i < 3; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            if (ribuan(a[i])) {
                System.out.println(a[i] + " adalah ribuan.");
            } else {
                System.out.println(a[i] + " bukan ribuan.");
            }
        }

        input.close();
    }

    public static boolean ribuan(int a) {
        return a >= 1000 && a < 10000;
    }
}
