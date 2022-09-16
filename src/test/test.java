package test;

public class test {
    public static void main(String[] args) {
        /*변수란?
        변수(Variable)는 메모리상에 데이터를 저장하는 기억공간을 의미한다. 쉽게 말하면 어떠한 값(숫자, 문자열 등)을 담는 그릇이라고 할 수 있다.
        또한 프로그램에 의해 값이 수시로 변경이 되어 변수라는 이름을 갖게 되었고 하나의 값만 저장이 가능하며 제일 마지막에 값이 저장된다.
        변수의 선언과 할당 변수를 선언한다는 것은 변수를 지금부터 사용하겠다고 정의하는 것이다. 변수의 선언 방법은 아래와 같다.
        "자료형(data type) 변수명;" 을 써주면 된다.(자료형(data type)은 다음 포스트에서 다룰 예정이다.)
        이렇게 선언된 변수에 데이터 값을 대입하는 것을 할당한다고 하며 예제를 통해 확인해보자.
        */
        //  1. 정수형
        int i;  // 정수형 변수 i 선언
        i = 10; //  변수 i에 정수값 10 할당
        System.out.println(i+10);   // 20출력
        i = 20; //  변수 i의 정수값 변경(10-->20)
        System.out.println(i+10);   //  30출력
        //  2. 실수형
        double d;   //  실수형 변수 d 선언
        d = 10.5;   //  변수 d에 정수값 10.5 할당
        System.out.println(d+1.5);  //  12.0 출력
        //  3. 문자열
        String s;   //  문자열 변수 s 선언
        s="Hello";  //  변수 s에 문자열 Hello 할당
        System.out.println(s+" Java!");  //  Hello Java! 출력

    /*    변수명 명명 규칙
        1. 영문자(A~Z, a~z)와 숫자(0~9)와 언더바(_)의 조합으로 만든다.
        2. 첫글자는 영문자나 언더바로 시작하여야 한다.
        3. 변수명은 대/소문자를 구별한다. 즉 int a와 int A는 다른 변수이다.
        4. JAVA(자바)에서 사용하는 예약어는 변수명으로 선언이 불가하다.
           * int, char, if, else, for, new, break, return 등
        5. 필수는 아니지만 변수가 어떤 값을 저장하고 있는지 쉽게 알 수 있도록 의미 있는 변수명을 지어주는게 좋다.
    */


        int j =100; //  int i; i=100; 과 동일한 의미 / 한번에 선언과 값 할당이 가능
        System.out.println(j+30);
        System.out.println(j+30*20);
        System.out.println(j+30*50+50);
        System.out.println(j+30/5);
        System.out.println(j+30/5*10);
        System.out.println(j+30*5/10);
    }

}
    /* 변수의 사용 이유
    변수를 사용하는 이유는 코드의 재활용성을 높여 수정을 용이하게 해준다.
    즉, 중복된 데이터 값이 들어가야 하는 부분을 변수로 정의하고 코드를 작성해주면 수정이 필요할때 변수만 수정해주면 되기 때문이다.
     */