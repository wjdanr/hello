package test.팩토리얼계산;

import java.util.Scanner;

public class Factorial {
/*
    public static void main(String[] args) {
        System.out.println("팩토리얼 계산을 위한 정수값 입력");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fac = 1;    //  초기값 설정
        for(int i = num; i > 0; i--) {
            fac = fac * i;
        }
        System.out.println(num + "! =" + fac);
    }
}
*/
public static void main(String[] args) {
    // 무한 루프를 이용하여 계산기 만들기
    // 첫 번째 수에 999를 입력하면 프로그램 종료
    Scanner scan = new Scanner(System.in);

    int x = 0;
    int y = 0;
    String z = "";

    while (true) {
        System.out.print("계산할 첫 번째 수를 입력: ");
        x = scan.nextInt();

        if (x == 999) {
            System.out.print("프로그램을 종료합니다.");
            return;
        } else {

            System.out.print("계산할 두 번째 수를 입력: ");
            y = scan.nextInt();

            System.out.print("계산할 연산자를 입력(+ - * /):");
            z = scan.next();

            switch (z) {
                case "+":
                    System.out.println(x + y);
                    break;
                case "-":
                    System.out.println(x - y);
                    break;
                case "*":
                    System.out.println(x * y);
                    break;
                case "/":
                    System.out.println(x / y);
                    break;
                default:
                    System.out.println("잘못된 연산자입니다.");
            }
        }
    }
}
}
