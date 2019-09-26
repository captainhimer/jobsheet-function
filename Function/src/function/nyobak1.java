package function;
import java.util.Scanner;
public class nyobak1 {
    public static double hiya(double a, double b, double c)
    {
        double d = a+b+c;
        return d;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("----------=====UHUY=====----------");
        
        System.out.print("\nMasukkan nilai I : ");
        double hiya1 = input.nextDouble();
        
        System.out.print("Masukkan nilai II : ");
        double hiya2 = input.nextDouble();
        
        System.out.print("Masukkan nilai III : ");
        double hiya3 = input.nextDouble();
        double x;
       x = hiya(hiya1,hiya2,hiya3);
        System.out.println("Hasil jumlah : "+ x);
        
        x = x / 3;
        System.out.println("Hasil Rata-rata : "+ x);
    }
}
