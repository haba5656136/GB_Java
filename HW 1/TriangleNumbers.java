import java.util.Scanner;

/**
 * TriangleNumbers
 * get (n-th) Trinagle Number
 */
public class TriangleNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Вычисляем n-ое треугольное число. Введите число n (от 1 до 46340):");
        int n = in.nextInt();
      
        System.out.printf("n-ое треугольеон число = %d \n", CalcTriangeNum(n));
        in.close();
    }

    static int CalcTriangeNum(int n) {
        return (int)(n*(n+1)/2);
    }
    
}
