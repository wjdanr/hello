package test.스위치;

public class SwitchEx02 {
    public static void main(String[] args) {
        int score =100;
        switch (score/10) {     // 조건=8
            case 10:
                System.out.println("A+학점");
                break;
            case 9:
                System.out.println("A학점");
                break;
            case 8: //  깂 일치
                System.out.println("B학점");  // 실행
                break;
            case 7:
                System.out.println("C학점");
                break;
            case 6:
                System.out.println("D학점");
                break;
            default:
                System.out.println("F학점");
                break;
        }
    }
}


//  소스 코드에서 눈 여겨볼 내용은 int형 변수 score를 10으로 나눈 것이다.
//  일반적으로 계산하면 8.5라는 값이 나오지만 자료형이 int형이므로 소숫점이 버려졌고 case 8이 실행된다.
