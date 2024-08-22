package goormEXP;

import java.util.Arrays;
import java.util.Scanner;

public class Java_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);

        System.out.println("오름차순 정렬 : " + Arrays.toString(num));
    }
}
