package chap_03;

import java.sql.SQLOutput;

public class _03_StringCompare {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 내용 같으면 true

        // 문자열 비교 심화
        s1 = "1234"; // 메모지의 비밀번호 정보
        s2 = "1234";
        System.out.println(s1.equals(s2)); //true  (내용 비교)
        System.out.println(s1 == s2); //true   (참조 비교)
        // s1에 1234 의 데이터가 메모리에 저장되어있으니 s2도 그 데이터를 그대로 씀 (참조)


        s1 = new String("1234"); //각각의 사람에게 메모지 전달.
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2);  //false
    }
}
