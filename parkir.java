import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Jam masuk :");
        int a = input.nextInt();
        
        System.out.println("Jam Keluar :");
        int b = input.nextInt();
        
        int c = count(a, b);
        
        int total = hasilTotal(c);
        
        System.out.println("Total biaya parkir " + c + " jam adalah: Rp " + total);
        
        input.close();
    }
    
    public static int count(int a, int b) {
    int c;
    if (a <= b) {
        c = b - a;
    } else {
        c = (24 - a) + b;
    }
    return c;
}
    
    public static int hasilTotal(int c) {
        int total = 1500;
        if (c > 2) {
            total += (c - 2) * 1000;
        }
        return total;
    }
    
}