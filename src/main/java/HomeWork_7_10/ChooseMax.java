package HomeWork_7_10;

import java.util.Scanner;

public class ChooseMax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if(a >= b) b = a;
        System.out.println(b);
    }
}
