package ch3;

import java.util.Scanner;

import util.date.DateUtil;

public class Mini_quiz1_Func {
    static final int MAX_BOOKS = 100;
    static String[] titles = new String[MAX_BOOKS];
    static String[] authors = new String[MAX_BOOKS];
    static String[] publishers = new String[MAX_BOOKS];
    static String[] registrationDates = new String[MAX_BOOKS];
    static int bookCount = 0;

    // 도서 추가
    public static void addBook(Scanner scanner) {
        if (bookCount < MAX_BOOKS) {
            System.out.println("도서 제목을 입력하세요: ");
            String title = scanner.nextLine();
            titles[bookCount] = title;

            System.out.println("저자를 입력하세요: ");
            String author = scanner.nextLine();
            authors[bookCount] = author;

            System.out.println("출판사를 입력하세요: ");
            String publisher = scanner.nextLine();
            publishers[bookCount] = publisher;

            String registrationDate = DateUtil.getCurrentDateTime();
            registrationDates[bookCount] = registrationDate;

            bookCount++;
            System.out.println("도서가 추가되었습니다: " + title + ", " + author + ", " + publisher + ", " + registrationDate);
        } else {
            System.out.println("도서 수가 최대치를 초과했습니다.");
        }
    } // 도서 추가

    // 도서 조회
    public static void viewBooks() {
        if (bookCount == 0) {
            System.out.println("등록된 도서가 없습니다.");
            return;
        }
        System.out.println("등록된 도서 목록:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("인덱스 번호 : " + i + ", " + (i + 1) + ". " + titles[i] + ", " + authors[i] + ", "
                    + publishers[i] + ", " + registrationDates[i]);
        }
    } // 도서 조회

    // 도서 수정
    public static void updateBook(Scanner scanner) {
        System.out.println("수정할 도서의 인덱스를 입력하세요 (0 ~ " + (bookCount - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index < 0 || index >= bookCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }
        System.out.println("수정할 도서 제목을 입력하세요: ");
        String title = scanner.nextLine();
        titles[index] = title;

        System.out.println("수정할 저자를 입력하세요: ");
        String author = scanner.nextLine();
        authors[index] = author;

        System.out.println("수정할 출판사를 입력하세요: ");
        String publisher = scanner.nextLine();
        publishers[index] = publisher;

        String registrationDate = DateUtil.getCurrentDateTime();
        registrationDates[index] = registrationDate;

        System.out.println("도서 정보가 수정되었습니다: " + titles[index] + ", " + authors[index]);
    } // 도서 수정

    // 도서 삭제
    public static void deleteBook(Scanner scanner) {
        System.out.println("삭제할 도서의 인덱스를 입력하세요 (0 ~ " + (bookCount - 1) + "): ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= bookCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }
     
        System.out.println("삭제할 도서 정보: " + titles[index] + ", " + authors[index] + ", " + registrationDates[index]);

        for (int i = index; i < bookCount - 1; i++) {
            titles[i] = titles[i + 1];
            authors[i] = authors[i + 1];
            publishers[i] = publishers[i + 1];
            registrationDates[i] = registrationDates[i + 1];
        }
        titles[bookCount - 1] = null;
        authors[bookCount - 1] = null;
        publishers[bookCount - 1] = null;
        registrationDates[bookCount - 1] = null;

        bookCount--;
        System.out.println("도서가 삭제되었습니다.");
    } // 도서 삭제

    // 더미 데이터 추가
    public static void addDummyBooks() {
        for (int i = 0; i < 5; i++) {
            if (bookCount < MAX_BOOKS) {
                titles[bookCount] = "더미도서" + (i + 1);
                authors[bookCount] = "dummy" + (i + 1);
                publishers[bookCount] = "출판사" + (i + 1);
                registrationDates[bookCount] = DateUtil.getCurrentDateTime();
                bookCount++;
            } else {
                System.out.println("더미 도서 추가 실패: 최대 도서 수 초과");
                break;
            }
        }
        System.out.println("더미 도서 5권이 추가되었습니다.");
    } // 더미 데이터 추가

    // 도서 검색
    public static void searchBook(Scanner scanner) {
        System.out.println("검색할 도서 제목 또는 저자를 입력하세요:");
        String searchQuery = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < bookCount; i++) {
            if (titles[i].contains(searchQuery) || authors[i].contains(searchQuery)) {
                System.out.println("인덱스 번호 : " + i + ", " + (i + 1) + ". " + titles[i] + ", " + authors[i] + ", "
                    + publishers[i] + ", " + registrationDates[i]);
            found = true;
            }
        }

        if (!found) {
            System.out.println("검색 결과가 없습니다.");
        }
    } // 도서 검색
}
