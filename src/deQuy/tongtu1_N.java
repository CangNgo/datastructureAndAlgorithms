package deQuy;

import java.util.Scanner;

public class tongtu1_N {

    public static int tinhtong(int n) {

        if (n == 1) {
            return 1;
        }
        return n + tinhtong(n - 1);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("tình tổng số từ 1 đến ");
        n = sc.nextInt();
        System.out.println(tinhtong(n));
    }
}