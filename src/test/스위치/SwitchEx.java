//  switch 문은 if 문으로 모두 대체할 수 있고 if문이 조건문 중 대표적으로 사용된다.
//  switch 문의 장점은 비교 하고자 하는 조건이 많을 경우 사용하면 보기에 편한 경우가 있다.

//  switch ~ case문
//  switch 정의
//  switch (변수) {
//  case 값: // 변수와 값이 일치하면 해당 case 실행문을 작동시킨다.
//  실행문;
//  break;  //  break는 조건에 해당하는 실행문을 작동시키고 switch문을 종료하기 위해 사용된다.
//  default //  변수와 값이 불일치하면 default 실행문을 작동시킨다.
//  실행문;
//  break;
//  }


//  switch문을 작성할 때 case는 여러 개가 나와도 상관없다. break라는 것은 보조제어문 중 하나이다.
//  위에 설명한 것처럼 조건에 해당하는 실행문만 실행시키고 종료시키기 위해서 사용된다.

package test.스위치;

public class SwitchEx {
    public static void main(String[] args) {
        int n = 2;
        switch (n) {
            case 1:
                System.out.println("1");
                break;

            case 2:
                System.out.println("2");
//                break;

            case 3:
                System.out.println("3");
                break;

            default:
                System.out.println("4이상");

        }
    }
}

//  소스 코드에서 case 2의 break를 주석 처리한다.
//  결과는 case 2 와 case 3 의 실행문이 모두 출력된다.
//  위에서 설명하였듯이 break는 조건에 해당되는 내용만 실행하고 조건문을 빠져나가게 해준다.
//  다르게 말하면 break가 없다면 조건과 일치하는 부분부터 break를 만나거나 종료되기 전까지 실행이 된다.
