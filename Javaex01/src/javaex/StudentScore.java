package javaex;

public class StudentScore {
    public static void main(String[] args) {
        int[][] scores = {
                {10,20,30,14}, // 1번 학생의 과목별 점수
                {40,59,34,25}, // 2번 학생
                {46,75,99,87}  // 3번
        };

        // 학생별로 평균 점수를 계산하고 출력
        for (int i = 0; i < scores.length; i++) { // 각 학생별로 반복
            int sum = 0; // 학생의 총점을 저장할 변수 초기화
            for (int j = 0; j < scores[i].length; j++) { // 해당 학생의 각 과목 점수를 반복
                sum += scores[i][j];
            }
            double avg = sum / (double) scores[i].length; // 평균 점수 계산
            System.out.println((i+1) + "번 학생의 평균 점수 : " + avg);
        }
    }
}
