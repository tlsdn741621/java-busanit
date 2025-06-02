package ch3;

import java.util.Scanner;

import util.date.DateUtil;

public class Exs_ch3_2_quiz {
    static final int MAX_BOOKS = 100;
    static String[] titles = new String[MAX_BOOKS];
    static String[] authors = new String[MAX_BOOKS];
    static String[] isbns = new String[MAX_BOOKS];
    static String[] registrationDates = new String[MAX_BOOKS];
    static int bookCount = 0;

    public static void addBook(Scanner scanner) {
        if (bookCount < MAX_BOOKS) {
            System.out.println("도서 제목을 입력하세요: ");
            String title = scanner.nextLine();
            titles[bookCount] = title;

            System.out.println("저자를 입력하세요: ");
            String author = scanner.nextLine();
            authors[bookCount] = author;

            System.out.println("고유번호를 입력하세요: ");
            String isbn = scanner.nextLine();
            isbns[bookCount] = isbn;

            String registrationDate = DateUtil.getCurrentDateTime();
            registrationDates[bookCount] = registrationDate;

            bookCount++;
            System.out.println("도서가 추가되었습니다: " + title + ", " + author + ", " + isbn + ", " + registrationDate);
        } else {
            System.out.println("도서 수가 최대치를 초과했습니다.");
        }
    }

    public static void viewBooks() {
        if (bookCount == 0) {
            System.out.println("등록된 회원이 없습니다.");
            return;
        }
        System.out.println("등록된 회원 목록:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("인덱스 번호 : " + i + ", " + (i + 1) + ". " + titles[i] + ", " + authors[i] + ", "
                    + registrationDates[i]);
        }
    }

    public static void updateUser(Scanner scanner) {
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

        System.out.println("수정할 고유번호를 입력하세요: ");
        String isbn = scanner.nextLine();
        isbns[index] = isbn;

        String registrationDate = DateUtil.getCurrentDateTime();
        registrationDates[index] = registrationDate;

        System.out.println("도서 정보가 수정되었습니다: " + titles[index] + ", " + authors[index]);
    }

    public static void deleteUser(Scanner scanner) {
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
            isbns[i] = isbns[i + 1];
            registrationDates[i] = registrationDates[i + 1];
        }
        titles[bookCount - 1] = null;
        authors[bookCount - 1] = null;
        isbns[bookCount - 1] = null;
        registrationDates[bookCount - 1] = null;

        bookCount--;
        System.out.println("도서가 삭제되었습니다.");
    }

    public static void addDummyUsers() {
        for (int i = 0; i < 5; i++) {
            if (bookCount < MAX_BOOKS) {
                titles[bookCount] = "더미도서" + (i + 1);
                authors[bookCount] = "dummy" + (i + 1);
                isbns[bookCount] = "isbn" + (i + 1);
                registrationDates[bookCount] = DateUtil.getCurrentDateTime();
                bookCount++;
            } else {
                System.out.println("더미 도서 추가 실패: 최대 도서 수 초과");
                break;
            }
        }
        System.out.println("더미 도서 5권이 추가되었습니다.");
    }
}
