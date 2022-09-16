package test.자료형;

public class DataType {
    public static void main(String[] args) {
        // 1. 정수형
        byte b = 127;
        short s = 300;
        int i = 2000;
        long l = 20000;
        System.out.println("b=" + b);
        System.out.println("b=" + b + " s=" + s);
        System.out.println("b=" + b + " s=" + s + " i=" + i);
        System.out.println("b=" + b + " s=" + s + " i=" + i + " l=" + l);
        // 2. 실수형
        float f = (float) 3.1;
        double d = 42.1;
        System.out.println("f=" + f);
        System.out.println("f=" + f + " d=" + d);
        System.out.println();
        // 3. 문자형 : 문자를 나타낼 때는 ' ' 안에 값을 입력
        char c1 = 'a';
        char c2 = '가';
        System.out.println("c1=" + c1);
        System.out.println("c1=" + c1 + " c2=" + c2);
        // 4. 논리형
        boolean b1 = true;
        boolean b2 = false;
        System.out.println("b1=" + b1 + " b2=" + b2);
        // 5. 문자열(참조형) : 문자열을 입력할 때 " "에 값을 입력
        String s1 = "자바";

        System.out.println("s1=" + s1);
    }
}

