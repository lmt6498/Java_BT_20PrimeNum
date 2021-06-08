import java.util.Scanner;

public class xuLy {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhập số phần tử cần in: ");
        int numbers = nhap.nextInt();
        int count = 0;
        int n = 2;
        while (count < numbers) {
            boolean flag = true;
            if (n < 2) {
                flag = false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = false;
                }
            }
            if (flag) {
                count++;
                System.out.print("\t" + n);
            }
            n++;
        }
    }
}
