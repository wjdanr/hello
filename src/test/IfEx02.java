package test;

public class IfEx02 {
    public static void main(String[] args) {
        int a = 10;
        if(a%2==0) { //true
            System.out.println(a+"는 2의 배수"); //실행
            if(a%4==0) { //false
                System.out.println(a+"는 3의 배수");    //실행
            }
            if(a%6==0) { // false
                System.out.println(a+"는 4의 배수");

            }
        }
    }
}

//  첫 번째 if문이 true 값을 갖기 때문에 중괄호 안의 실행문들이 동작한다.
//  이때 if문 내부의 if절의 조건식이 true이면 실행되고 false면 해당 조건문이 실행되지 않는다.

//  if-else문
//  if문 만으로는 복잡한 내용을 처리하는 데는 한계가 있다. if만을 사용할 때는 true일 때만 실행된다.
//  false일때 다르게 실행시키기 위한 if-else문을 알아보자.

//  if(조건식){
//  실행문;    // 조건식이 true일 경우 실행
//  }else{
//  실행문;    // 조건식이 false일 경우 실행
//}