package util;

public class DateUtilMain {
    public static void main(String[] args) {
        System.out.println("현재 시간을 불러오는 기능 확인.");
        String currentTime = DateUtil.getCurrentDateTime();
        System.out.println("현재 시간 : " + currentTime);
    }

    // 퀴즈
    // user_mini_project -> MainClass.java 파일에
    // 회원가입 항목에, 현재 가입 시간을 추가하고, 출력도 해보기
}
