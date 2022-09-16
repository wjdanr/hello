package test.스위치;

import java.util.Scanner;

public class SwitchMenu1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int menu = 0;
        System.out.println("## 메뉴 선택 ##" + "\n[1] 구매자 [2] 판매자" + "\n## 메뉴를 선택하세요: ");
        menu = scan.nextInt();

        switch (menu) {
            case 1:
                System.out.println("환영합니다! 구매자로 로그인하셨습니다.");
                break;
            case 2:
                System.out.println("환영합니다! 판매자로 로그인하셧습니다.");
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
    }
}
