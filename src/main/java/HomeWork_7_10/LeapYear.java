package HomeWork_7_10;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean T = false;
        int a = s.nextInt();
        if(a%4==0&&a%100!=0||a%400==0) T =true;
        if(T) System.out.println("这是闰年");
        else System.out.println("这不是闰年");
    }
}
