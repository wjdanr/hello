import java.util.Scanner;

public class MainActivity {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        System.out.println("[사용자로부터 두정수 값 입력 받은 후 합계 계산]");

        //사용자가 입력한 정수값을 저장하기위한 변수를 선언
        int a = 0;
        int b = 0;
        int c = 0;

        //사용자로부터 키보드 입력을 받기 위해 Scanner 객체 생성
        Scanner scan = new Scanner(System.in);

        //사용자로부터 첫번째 정수값을 입력
        System.out.println("첫번째 값 :");
        a = scan.nextInt();

        //사용자로부터 두번째 정수값을 입력
        System.out.println("두번째 값 :");
        b = scan.nextInt();

        //사용자로부터 세번째 정수값을 입력
        System.out.println("세번째 값 :");
        c = scan.nextInt();

        //입력한 정수값을 사용해 합계를 계산
        System.out.println("합계 :" + (a + b + c));
        //입력한 정수값을 사용해 빼기를 계산
        System.out.println("합계 :" + (a - b - c));
        //입력한 정수값을 사용해 곱하기 계산
        System.out.println("합계 :" + (a * b * c));
        //입력한 정수값을 사용해 나누기 계산
        System.out.println("합계 :" + (a / b / c));
    } //메인 종료
} // 클래스 종료


// -Scanner 객체를 선언해 사용자로부터 키보드 입력을 받는다
// -입력받은 값을 위해 선언한 one, two 변수에 각각 저장을 시킴
// -연산자 +를 사용해 one, two 변수 합계를 계산
