package homework.ksw_0605.ch4;

import java.util.Scanner;

import util.date.DateUtil;

public class Car_Func {

    static final int MAX_CARS = 100; // 최대 자동차 수

    // Car_Model 클래스를 담아 둘 배열 생성. 크기는 동일하게 100대로 정하기.
    static Car_Model[] Car_Models = new Car_Model[MAX_CARS];

    static int carCount = 0; // 현재 등록된 자동차 수

    // 자동차 추가 메서드
    public static void addCar(Scanner scanner) {
        if (carCount < MAX_CARS) { // 기본 유효성 체크
            System.out.println("자동차 모델명을 입력하세요: ");
            String name = scanner.nextLine();

            System.out.println("제조사를 입력하세요: ");
            String company = scanner.nextLine();

            System.out.println("연식을 입력하세요: ");
            String carAge = scanner.nextLine();

            // 현재 날짜와 시간 저장
            String registrationDate = DateUtil.getCurrentDateTime();

            // 사용자들로 부터 입력 받은 정보를, 모델 클래스의 인스턴스 생성 하는 곳에 사용.
            Car_Model Car_Model = new Car_Model(name, company, carAge, registrationDate);

            Car_Models[carCount] = Car_Model;
            // 자동차 수 증가
            carCount++;
            System.out.println("자동차가 추가되었습니다: " + name + ", " + carAge + ", " + registrationDate);
        } else {
            System.out.println("자동차 수가 최대치를 초과했습니다.");
        }
    } // 자동차 추가 메서드

    // 자동차 조회 메서드
    public static void viewCars() {
        if (carCount == 0) {
            System.out.println("등록된 자동차가 없습니다.");
            return;
        }
        System.out.println("등록된 자동차 목록:");
        for (int i = 0; i < carCount; i++) {
            Car_Models[i].showInfo();
        }
    } // 자동차 조회 메서드

    // 자동차 수정 메서드
    public static void updateCar(Scanner scanner) {
        System.out.println("수정할 자동차의 인덱스를 입력하세요 (0 ~ " + (carCount - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index < 0 || index >= carCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }
        System.out.println("수정할 자동차의 모델명을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.println("수정할 자동차의 제조사을 입력하세요: ");
        String company = scanner.nextLine();

        System.out.println("수정할 자동차의 연식을 입력하세요: ");
        String carAge = scanner.nextLine();

        String registrationDate = DateUtil.getCurrentDateTime();

        Car_Model Car_Model = new Car_Model(name, company, carAge, registrationDate);
        Car_Models[index] = Car_Model;

        System.out.println("자동차 정보가 수정되었습니다: " + name + ", " + company + ", " + carAge + ", "
                + registrationDate);
    } // 자동차 수정 메서드

    // 자동차 삭제 메서드
    // 수정 처럼, 자동차의 인덱스 번호를 입력시, 삭제하는 로직.
    public static void deleteCar(Scanner scanner) {
        System.out.println("삭제할 자동차의 인덱스를 입력하세요 (0 ~ " + (carCount - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= carCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }

        Car_Model Car_Model = Car_Models[index];
        System.out.println("삭제할 자동차 정보: ");
        Car_Model.showInfo();

        for (int i = index; i < carCount - 1; i++) {
            Car_Models[i] = Car_Models[i + 1];
        }
        Car_Models[carCount - 1] = null;

        carCount--;
        System.out.println("자동차가 삭제되었습니다.");
    } // 자동차 삭제 메서드

    // 자동차 더미 데이터 5개 추가하는 메서드
    public static void addDummyCars() {
        for (int i = 0; i < 5; i++) {
            if (carCount < MAX_CARS) {
                Car_Model dummyCar_Model = new Car_Model(
                        "더미자동차" + (i + 1),
                        "제조사" + (i + 1),
                        "201" + (i + 1) + "년식",
                        DateUtil.getCurrentDateTime());
                Car_Models[carCount] = dummyCar_Model;

                carCount++;
            } else {
                System.out.println("더미 자동차 추가 실패: 최대 자동차 수 초과");
                break;
            }
        }
    } // 자동차 더미 데이터 5개 추가하는 메서드

    // 검색 기능
    public static void searchCar(Scanner scanner) {
        System.out.println("검색할 자동차의 이름 또는 연식을 입력하세요: ");
        String searchQuery = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < carCount; i++) {
            if (Car_Models[i].getName().contains(searchQuery) || Car_Models[i].getCarAge().contains(searchQuery)) {
                Car_Models[i].showInfo(); // 자동차 정보 출력
                found = true;
            }
        }

        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    } // 검색 기능

    // 자동차 추가 관련프로그램 UI 그리는 메소드
    public static void car_ui(Scanner scanner) {
        int menu;
        do {
            System.out.println("자동차 관리 프로그램 예시");
            System.out.println("=============================================================================================================");
            System.out.println("1. 자동차 추가 , 2. 자동차 조회, 3. 자동차 수정, 4. 자동차 삭제, 5.더미 데이터 추가 5개, 6. 검색기능,  0. 종료");
            System.out.println("=============================================================================================================");
            System.out.print("메뉴를 선택하세요(0 ~ 6): ");
            menu = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거
            switch (menu) {
                case 1:
                    Car_Func.addCar(scanner); // 자동차 추가
                    break;
                case 2:
                    Car_Func.viewCars(); // 자동차 조회
                    break;
                case 3:
                    Car_Func.updateCar(scanner); // 자동차 수정
                    break;
                case 4:
                    Car_Func.deleteCar(scanner); // 자동차 삭제
                    break;
                case 5:
                    Car_Func.addDummyCars(); // 더미 데이터 추가
                    System.out.println("더미 데이터 5개가 추가되었습니다.");
                    break;
                case 6:
                    Car_Func.searchCar(scanner); // 자동차 검색
                    System.out.println("자동차 검색 기능이 실행되었습니다.");
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴 선택입니다. 다시 시도하세요.");
            }

        } while (menu != 0); // 메뉴가 0이 아닐 때까지 반복
    } // 자동차 추가 UI 그리는 메소드
}