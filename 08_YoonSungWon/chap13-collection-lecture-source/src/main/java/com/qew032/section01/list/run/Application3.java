package com.qew032.section01.list.run;

/* **************************************************************************************
 *  import
 * **************************************************************************************/

import com.qew032.section01.list.dto.BookDTO;
import com.qew032.section01.list.service.BookService;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;



/* **************************************************************************************
 *  class
 * **************************************************************************************
 *  도서 프로그램의 메뉴 화면을 담당하는 클래스.
 *  사용자 입력 받기
 *  BookService에 기능 요청하기
 * **************************************************************************************/

public class Application3 {

    private Scanner sc = new Scanner(System.in);                                                                          //  사용자 입력 담당
    private BookService bookService = new BookService();                                                                  //  실제 기능 담당 객체


    public static void main(String[] args) {                                                                              //  프로그램 실행
        new Application3().run();
    }

    public void run() {

        int input = 0;

        do {
            System.out.println("\n===== 도서 관리 프로그램 =====\n");
            System.out.println("1. 모든 도서 목록 조회");
            System.out.println("2. 도서 상세 조회(도서 번호)");
            System.out.println("3. 도서 추가");
            System.out.println("4. 도서 수정");
            System.out.println("5. 도서 제거");
            System.out.println("6. 도서 검색");
            System.out.println("7. 도서 정렬");
            System.out.println("8. 가격 범위 조회");
            System.out.println("9. 통계 보기");
            System.out.println("10. 가격 총 합 조회");
            System.out.println("11. 평균 가격 조회");
            System.out.println("12. 최대가격 도서 조회");
            System.out.println("13. 최저가격 도서 조회");
            System.out.println("0. 프로그램 종료");
            System.out.println("============================");

            try {
                System.out.print("번호 선택 >> ");
                input = sc.nextInt();
                sc.nextLine(); // 입력 버퍼 개행 문자 제거

                switch (input) {
                    case 1:
                        selectAll();
                        break;
                    case 2:
                        selectBookNumber();
                        break;
                    case 3:
                        addBook();
                        break;
                    case 4:
                        updateBook();
                        break;
                    case 5:
                        deleteBook();
                        break;
                    case 6:
                        searchBook();
                        break;
                    case 7:
                        sortBookList();
                        break;
                    case 8:
                        findByPriceRange();
                        break;
//          case 9: showStatistics(); break;
                    case 10:
                        getTotalPrice();
                        break;
                    case 11:
                        getAveragePrice();
                        break;
                    case 12:
                        getMaxPriceBook();
                        break;
                    case 13:
                        getMinPriceBook();
                        break;
                    case 0:
                        System.out.println("!#$% 프로그램을 종료합니다. !#$$#$");
                        break;
                    default:
                        System.out.println("@@@@@ 메뉴 목록에 존재하는 번호를 입력하세요. @@@@@");
                }

            } catch (InputMismatchException e) {                                                                        //  정수로 입력해야 하는데 문자를 입력한 경우 예외 발생
                System.out.println("##### 입력 형식이 잘못되었습니다. ######");
                sc.nextLine(); // 입력 버퍼의 남은 잘못된 문자열을 제거
                input = -1; // 첫 반복 입력 오류 시 비정상 종료 막기

            } catch (Exception e) { // 나머지 예외 발생 처리
                System.out.println("##### 예외 발생. 관리자에게 문의하세요. #####");
                e.printStackTrace();
            }

        } while (input != 0);
    }

    /*
     * 1. 모든 도서 목록 조회
     * */
    private void selectAll() {
        System.out.println("\n*** 전체 도서목록 조회 ***\n");
        List<BookDTO> books = bookService.getBookList();

        System.out.println("총 " + books.size() + "권 입니다");
        for (BookDTO book : books) {
            System.out.println(book);
        }
    }

    /**
     * 2. 도서 상세 조회(도서 번호)
     *
     * @throws InputMismatchException
     */
    private void selectBookNumber() throws InputMismatchException {
        System.out.print("\n*** 도서 상세 조회(도서 번호) ***\n");
        System.out.print("상세 조회할 도서 번호 입력 : ");
        int bookNumber = sc.nextInt();

        // 서비스 호출
        BookDTO book = bookService.selectBookNumber(bookNumber);

        if (book == null) {
            System.out.println("@@@ 일치하는 번호의 책이 없습니다. @@@");
            return;
        }

        System.out.println("책 번호: " + book.getNumber());
        System.out.println("책 제목: " + book.getTitle());
        System.out.println("책 저자: " + book.getAuthor());
        System.out.println("책 가격: " + book.getPrice() + "원");
    }

    /**
     * 3. 도서 추가
     */
    private void addBook() {
        System.out.print("\n*** 도서 추가 ***\n");

        System.out.print("책 제목 입력 : ");
        String title = sc.nextLine();

        System.out.print("책 저자 입력 : ");
        String author = sc.nextLine();

        System.out.print("책 가격 입력 : ");
        int price = sc.nextInt();
        sc.nextLine();

        // BookDTO 객체 생성 및 값 대입
        BookDTO book = new BookDTO();
        book.setTitle(title);
        book.setAuthor(author);
        book.setPrice(price);

        // 서비스 호출
        int bookNumber = bookService.addBook(book);

        if (bookNumber == -1) {
            System.out.println("@@@ 책 추가에 실패했습니다. @@@");
            return;
        }

        System.out.println(bookNumber + "번 책이 추가 되었습니다.");
    }


    /**
     * 4. 도서 수정
     */
    private void updateBook() {
        System.out.println("\n*** 도서 수정 ***\n");

        // 1. 책 번호로 수정할 책이 있는지 검색
        //  -> 없으면 메서드 종료
        System.out.print("수정할 도서 번호 입력 : ");
        int bookNumber = sc.nextInt();
        sc.nextLine();                                                                                                      //  입력 버퍼 개행 문자 제거

        BookDTO book = bookService.selectBookNumber(bookNumber);                                                            //  1. 서비스 호출

        if (book == null) {
            System.out.println("@@@ 일치하는 번호의 책이 없습니다. @@@");
            return;
        }

        System.out.print("수정할 책 제목 : ");                                                                                //  2. 해당 책의 제목 수정
        String updateTitle = sc.nextLine();

        System.out.print("수정할 책 저자 : ");                                                                                //  3. 해당 책의 저자 수정
        String updateAuthor = sc.nextLine();

        System.out.print("수정할 책 가격 : ");                                                                                //  4. 해당 책의 가격 수정
        int updatePrice = sc.nextInt();
        sc.nextLine();

        book.setTitle(updateTitle);
        book.setAuthor(updateAuthor);
        book.setPrice(updatePrice);

        System.out.println("*** 책 정보가 수정 되었습니다. ***");

    }

    /**
     * 5. 도서 제거
     */
    private void deleteBook() {
        System.out.print("\n*** 도서 제거 ***\n");

        System.out.print("제거할 도서 번호 입력 : ");
        int bookNumber = sc.nextInt();
        sc.nextLine();

        // 서비스 호출
        BookDTO deletedBook = bookService.deleteBook(bookNumber);

        if (deletedBook == null) {
            System.out.println("@@@ 일치하는 번호의 책이 없습니다. @@@");
            return;
        }

        System.out.println(deletedBook.getTitle() + "이/가 제거 되었습니다.");

    }

    /**
     * 6. 도서 검색
     */
    private void searchBook() {
        System.out.print("\n*** 도서 검색(제목 부분 일치 검색) ***\n");

        System.out.print("검색할 책 제목 입력 : ");
        String keyword = sc.nextLine();

        // 서비스 호출
        List<BookDTO> searchBookList = bookService.searchBook(keyword);

        if (searchBookList == null || searchBookList.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }

        for (BookDTO book : searchBookList) {
            System.out.println(book);
        }
    }

    /**
     * 7. 도서 정렬 (원본은 유지하고 싶다!)
     */
    private void sortBookList() {
        System.out.print("\n*** 도서 정렬 목록 조회 ***\n");

        System.out.println("1. 도서명 오름차순");
        System.out.println("2. 가격 오름차순");
        int sortingNumber = sc.nextInt();
        sc.nextLine();

        // 서비스 구현
        List<BookDTO> books = bookService.sortBookList(sortingNumber);

        for (BookDTO book : books) {
            System.out.println(book);
        }
    }

    /**
     * 8. 가격 범위 조회
     */
    private void findByPriceRange() {
        System.out.println("\n*** 가격 범위 도서 목록 조회 ***\n");

        System.out.print("최소 범위 가격을 입력하세요 : ");
        int minPrice = sc.nextInt();

        System.out.print("최대 범위 가격을 입력하세요 : ");
        int maxPrice = sc.nextInt();

        int min = Math.min(minPrice, maxPrice);
        int max = Math.max(minPrice, maxPrice);

        List<BookDTO> books = bookService.findByPriceRange(min, max);

        System.out.println("최소 금액 " + min + "원 과 최대 금액 " + max + "원 사이 금액대의 도서는 " + books.size() + "권 입니다.");
        for (BookDTO book : books) {
            System.out.println(book);
        }
    }

    /*
     *  10. 가격 총 합 조회
     * */
    private void getTotalPrice() {
        System.out.println("\n*** 가격 총 합 조회 ***\n");

        int totalPrice = bookService.getTotalPrice();

        DecimalFormat df = new DecimalFormat("###,###");
        String totalPriceStr = df.format(totalPrice);

        System.out.println("전체 도서 금액의 총 합은 : " + totalPriceStr + "원 입니다.");

    }

    /*
     *   11. 가격 평균 조회
     * */
    private void getAveragePrice() {
        System.out.println("\n*** 평균 가격 조회 ***\n");

        double averagePrice = bookService.getAveragePrice();

        DecimalFormat df = new DecimalFormat("###,###");
        String averagePriceStr = df.format(averagePrice);

        System.out.println("전체 도서 금액의 평균은 : " + averagePriceStr + "원 입니다.");

    }

    /*
     *   12. 최대 가격 조회
     * */
    private void getMaxPriceBook() {
        System.out.println("\n*** 최대 가격 조회 ***\n");

        BookDTO maxPriceBook = bookService.getMaxPriceBook();

        DecimalFormat df = new DecimalFormat("###,###");
        String maxPriceStr = df.format(maxPriceBook.getPrice());

        System.out.println("전체 도서 금액 중 최대 금액은 : " + maxPriceStr + "원 입니다.");
    }


    /*
     *   13. 최소 가격 조회
     * */
    private void getMinPriceBook() {
        System.out.println("\n*** 최소 가격 조회 ***\n");

        BookDTO minPriceBook = bookService.getMinPriceBook();

        DecimalFormat df = new DecimalFormat("###,###");
        String minPriceStr = df.format(minPriceBook.getPrice());

        System.out.println("전체 도서 금액 중 최대 금액은 : " + minPriceStr + "원 입니다.");
    }

}
