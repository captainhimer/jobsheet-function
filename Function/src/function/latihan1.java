package function;
import java.util.Scanner;
public class latihan1 {
    public static void hiya(int a, int b)
    {
        System.out.println("Hasil : "+ (a + b));
    }
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan I : ");
        int bill = input.nextInt();
        
        System.out.print("Masukkan bilangan II : ");
        int bil2 = input.nextInt();
        
        hiya(bill, bil2);
    }
}
