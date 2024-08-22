package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int x = 121;
        int y = 115;
        int tall = (x > y) ? x : y;

        System.out.println("키가 " + tall + "cm 이므로 탑승 가능합니다.");

        int a = 121;
        int b = 115;
        int t = (x < y) ? x : y;

        System.out.println("키가 " + t + "cm 이므로 탑승 불가능합니다.");

        // 나도코딩 답안
        int height = 121;
        String result = (height >= 120) ? " 탑승 가능합니다" : " 탑승 불가능합니다";
        System.out.println("키가 " + height + "cm 이므로" + result);

        String m = "모상현";
        String k = "강애림";
        System.out.println(m + "은 아직도 " + k + "을 잊지 못한다");
    }
}
