package test.For;

public class gugudan {
    /*public static void main(String[] args) {
        for(int i=2; i<=9; i++){
            System.out.print("["+i+"단]\t"); // \t 칸 간격 벌림
        }
        System.out.println();
        for(int i=1; i<=9; i++){
            for(int j=2; j<=9; j++){
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }System.out.println();
        }
    }
*/
    public static void main(String[] args) {
        for(int i=2; i<=9; i++) {
            System.out.print("["+i+"단]\t");
        }
        System.out.println();
        for(int i=1; i<=9; i++) {
            for(int j=2; j<=9; j++){
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }System.out.println();
        }
    }
}

//  for문을 이용하여 세로방향으로 구구단을 출력

//  풀이
//  1. 구구단은 j*i의 구성을 갖는다.
//   이때 단을 세로로 배치한다면 가로방향은 단이 변하고 곱하는 값은 일정하다.
//   (ex : 2*1  3*1  ..  9*1
//         2*2  3*2  ..  9*2
//         ..   ..   ..   ..
//         2*9  3*9  ..  9*9)
//2. i값을 기준으로 단수에 해당하는 j가 2~9까지 반복 된다.
//3. 즉, i에 해당되는 for문을 정의하고 그 내부에 단수에 해당하는 j의 for문을 정의한다.

