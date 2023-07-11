package HomeWork_7_10;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class SuShu {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        boolean T = false;
        for(int i = 2;i <= sqrt(a);i++){
            if( a%i == 0) {
                T = true;
                break;
            }
        }
        if(T) System.out.println("这不是素数");
        else System.out.println("这是素数");
    }
}
