package user_mini_project;

import java.util.Scanner;

import ch2.OperConditionTest;
import util.random.RandomUtil;
import util.user.UserService;

public class MainClass_switch_case_doc {
    public static void main(String[] args) {
        // 공용으로 사용할 스캐너 생성
        Scanner scanner = new Scanner(System.in);

        // 무한 루프이고, 메인 메뉴를 출력하는 부분
        // 반복문 안에서, 리턴등으로 나오지 않는 이상, 계속 출력이 됨.
        while (true) {
            // 따로 앞단 없어서, 현재는 콘솔을 화면 대체로 이용중
            // 디비가 따로 없어서 현재는 메모리에 임시 저장으로 이용함
            // 나중에 jdbc 연결 하면 그때 디비에 저장, 불러오고, 쓰기 , 수정 등을 할 예정
            System.out.println("========================================================");
            System.out.println("회원 관리 시스템에 오신 것을 환영합니다. 배운거 복습 적용해보기");
            // 순서3
            // 3번 메뉴 추가
            System.out.println("1. 회원 가입  2. 로그인 3. 산술 연산자 테스트 4. 산술 연산자 퀴즈  0. 종료");
            System.out.println("5. 로또 번호 생성기 : 배열 없는 버전");
            System.out.println("========================================================");
            System.out.println("메뉴 번호를 선택해주세요 (0~5): ");
            // 사용자가 입력한 번호를 문자열 형태로 받기
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    UserService.registerUser(scanner);
                    break;
                case "2":
                    UserService.loginUser(scanner);
                    break;
                case "3":
                    OperConditionTest.oper1();
                    break;
                case "4":
                    OperConditionTest.oper2();
                    break;
                case "5":
                    RandomUtil.generateLottoNumbers();
                    break;
                case "0":
                    System.out.println("프로그램을 종료합니다. 감사합니다!");
                    scanner.close();
                return;
                default:
                    System.out.println("잘못된 입력입니다. 0, 1, 2, 3, 4, 5 중에서 선택해주세요.");
            }
        }
    }
}
