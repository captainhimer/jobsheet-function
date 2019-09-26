package function;
public class Function{
    public static int hitung(int a, int b)
    {
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {
      int x = 10;
      int y = 20;
      int z = hitung(x,y);
      System.out.println("Hasil"+z);
    }
    
}
