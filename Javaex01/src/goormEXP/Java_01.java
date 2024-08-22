package goormEXP;

import java.util.Scanner;

public class Java_01 {
    public static void main(String[] args) {
        System.out.print("숫자를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int input;
        int num = sc.nextInt();

        if (num % 2 ==0) {
            System.out.println("짝수입니다.");
        }else {
            System.out.println("홀수입니다.");
        }
    }
}
