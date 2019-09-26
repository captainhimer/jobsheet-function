package function;
import java.util.Scanner;
public class latihan4 {
    public static void hitung(double a, double b)
    {
     System.out.println("Kecepatan : "+ (a / b)+" km/jam");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukkan jarak : ");
        int jarak = input.nextInt();
        
        System.out.print("Masukkan waktu tempuh : ");
        int waktu = input.nextInt();
        
        hitung(jarak, waktu);
    }
}
