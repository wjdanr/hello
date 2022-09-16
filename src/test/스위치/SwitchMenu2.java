package test.스위치;

import java.util.Scanner;

public class SwitchMenu2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String id = "";
        int menu = 0;

        System.out.println("## 로그인(admin) 혹은 임의 아이디 ##");
        System.out.println("# 로그인 아이디: ");
        id = scan.next();

        if (id.equals("admin")) {
            System.out.print("관리자 로그인!!");
            System.out.println("## 메뉴를 선택하세요 ##");
            System.out.println("1. 입력");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 조회");
            System.out.print("# 메뉴 선택: ");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("관리자 1번 선택함!!");
                    break;
                case 2:
                    System.out.println("관리자 2번 선택함!!");
                    break;
                case 3:
                    System.out.println("관리자 3번 선택함!!");
                    break;
                case 4:
                    System.out.println("관리자 4번 선택함!!");
                    break;
                default:
                    System.out.println("잘못된 숫자입니다.");
            }
        } else {
            System.out.print(id + " 로그인!!");
            System.out.println("## 메뉴를 선택하세요 ##");
            System.out.println("1. 입력");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 조회");
            System.out.print("# 메뉴 선택: ");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println(id + " 1번 선택함!!");
                    break;
                case 2:
                    System.out.println(id + " 2번 선택함!!");
                    break;
                case 3:
                    System.out.println(id + " 3번 선택함!!");
                    break;
                case 4:
                    System.out.println(id + " 4번 선택함!!");
                    break;
                default:
                    System.out.println("잘못된 숫자입니다.");
            }
        }

        System.out.println("## 메뉴를 선택하세요 ##");
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 삭제");
        System.out.println("4. 조회");
        System.out.println("1. 입력");
        menu = scan.nextInt();

    }

}
