package test;

public class ElseIfEx {
    public static void main(String[] args) {
        int age = 22;
        if(age>=20 && age<30){	// 조건식 1
            // 조건식 1이 true일 때 실행
            System.out.println("20대");
        }else if(age<20){	// 조건식 2
            // 조건식 1이 false이면서 조건식 2가 true일 때 실행
            System.out.println("10대 이하");
        }else{
            // 조건식 1과 2가 false일 때 실행
            System.out.println("30대 이상");
        }
    }
}
//  else if 절은 여러 번 정의할 수 있고, else절은 생략이 가능하다.
//  단 if문이 처음에 나오고 그다음에 else if문이 젤 마지막에 else문이 나와야 한다.