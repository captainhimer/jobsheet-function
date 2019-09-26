package function;
import java.util.Scanner;
public class latihan5 {
    public static int uhuy (int a, int b, int c)
    {
  int nilaibesar;
  if(a>b && a>c){
      nilaibesar=a;
  }else{
      if(b>c){
          nilaibesar=b;
      }else{
          nilaibesar=c;
      }
    
  }
  return nilaibesar;
    }
    public static void main(String[] args) {
        int pertama, kedua, ketiga;
       Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan bilangan pertama : ");
        pertama = input.nextInt();
        
        System.out.print("Masukkan bilangan kedua : ");
        kedua = input.nextInt();
        
        System.out.print("Masukkan bilangan ketiga :");
        ketiga = input.nextInt();
        
        int x = uhuy(pertama, kedua, ketiga);
        System.out.println("Bilangan terbesar : "+ x);
    }
}

