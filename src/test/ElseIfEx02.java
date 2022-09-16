package test;

public class ElseIfEx02 {
    public static void main(String[] args) {
        int a =25, b =15, c =30, d =20;
        int min;
        if ( a< b && a < c && a < d) {  // 조건식1
            min = a;    // 조건식 1이 true 면 실행
        }else if ( b < c && b < d) {    // 조건식2
            min = b;    // 조건식 1이 false면서 조건식 2가 true면 실행
        }else if (c < d) {  // 조건식3
            min = c;    // 조건식 1, 2가 false면서 조건식 3이 true면 실행
        }else {
            min = d;    // 조건식 1, 2, 3 모두 false일떄 실행
        }
        System.out.println(min);    // 결과 출력
    }
}
