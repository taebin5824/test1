package chap_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        // 비교 연산자
        System.out.println(5 > 3); // 5는 3 보다 크다 (참이면 true , 거짓이면 false)
        System.out.println(5 >= 3); // 5는 3보다 크거나 같다 (true)
        System.out.println(5 >= 5); // 5는 5보다 크거나 같다 (true)
        System.out.println(5 >= 7); // 5는 7보다 크거나 같다 (false)

        System.out.println(5 < 3); // 5는 3보다 작다 (false)
        System.out.println(5 <= 3); // 5는 3보다 작거나 같다 (false)

        System.out.println(5 == 5); // 5는 5 와 같다 (true)
        System.out.println(5 == 3); // 5는 3 과 같다 (false)
        System.out.println(5 != 5); // 5는 5 와 같지 않다 (false)
        System.out.println(5 != 3); // 5는 3 과 같지 않다 (true)

    }
}
