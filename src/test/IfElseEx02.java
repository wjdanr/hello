package test;

public class IfElseEx02 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 9;
        int max;
        if (a > b && a > c) {
            max = a;  // 위의 조건식이 true일때 실행
        } else {  // 위의 조건식이 false일때 실행
            if (b > c) {
                max = b; // 위의 조건식 true일때 실행
            } else {
                max = c; // 위의 조건식 false일때 실행
            }
        }
        System.out.println("max = " + max);
    }
}


//  if-else문 안에 또 다른 if-else문을 넣은 예제이다. 첫 번째 if문의 조건식이 참이라면 if문 안의 실행문을 시키고
//  if문이 종료될 것이고, false라면 else절이 실행되고 그 안의 if-else절의 조건식이 true인지 false인지를 확인해서 해당 실행문이 실행된다.
//  else if문
//  else if문을 이용하면 2개 이상의 조건식을 두고 흐름을 제어할 때 더 자유롭고 편리하게 코드를 작성할 수 있다.
//  if(조건식1){
//  실행문1;   //  조건식 1이 true일 떄 실행
//  }else if(조건식2){
//  실행문2;   //  조건식 1이 false이고 조건식 2가 true일때 실행
//  }else {
//  실행문3;   //조건식 1과 2가 false일때 실행
//}