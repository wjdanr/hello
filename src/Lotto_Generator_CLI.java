import java.util.Arrays;
import java.util.Random;

public class Lotto_Generator_CLI {

    public static void main(String[] args) {
        System.out.println("랜덤 번호 생성 및 당첨 확인");
        /*[설 명]
        * 1. 로또 번호는 총 6개 번호를 지정한다.
        * 2. 6개 일치 : 1등 /5개 일치 : 2등 /4개 일치 : 3등 / 3개 일치 : 4등 / 2개 일치 : 5등 / 그외 : 꽝 으로 정한다.
        * 3. Random 객체를 사용해서 난수 랜덤 정수값을 생성한다. (1 ~ 45 정수 까지 범위 지정)
        * 4. while(true) 사용해서 중복없는 랜덤 정수값 배열에 저장한다.
        * 5. fot 문을 사용해서 두배열 일치 값 개수를 확인하고 등수를 출력한다.
        * 6. 참고 사항 - 일반적으로 이중 for문을 사용해 간편히 랜덤 로또 번호를 저장할 수 있으나,
        *               while 문을 사용해서 작성해 본다.
        */
        //로또 당첨 정답 번호 배열입니다 (총 6개 정답번호가 저장되어있습니다.)
        int lotto[] = {1, 4 , 20, 24, 9, 28};
        System.out.print("로또 당첨 번호" + Arrays.toString(lotto));

        Random random = new Random();

        int num[] = new int[6];
        Arrays.fill(num,0);

        int idx = 0;
        while (true) {
            int zero = 0;
            for(int i=0; i< num.length; i++) {
                if(num[i] ==0) {
                    zero ++;
                }
            }
            if(zero <=0) {
                break;
            }
            else {
                int random_num = random.nextInt(45)+1;
                int check = 0;
                for(int k=0; k<num.length; k++) {
                    if(num[k] == random_num) {
                        check ++;
                    }
                }
                if(check <= 0) {
                    num[idx] =random_num;
                    idx ++;
                }
            }
        }
        System.out.println("사용자 로또 번호 :" +Arrays.toString(num));

        int count = 0;
        for(int j=0; j< lotto.length; j++) {
            for(int h=0; h<num.length; h++) {
                if(lotto[j] ==  num[h]) {
                    count ++;
                }
            }
        }
        System.out.println("맞힌 개수 :" +count);

        if(count == 6) {
            System.out.println("등수 : "+"1등 입니다");
        }
        else if(count == 5) {
            System.out.println("등수 : "+"2등 입니다");
        }
        else if(count == 4) {
            System.out.println("등수 : "+"3등 입니다");
        }
        else if(count == 3) {
            System.out.println("등수 : "+"4등 입니다");
        }
        else if(count == 2) {
            System.out.println("등수 : "+"5등 입니다");
        }
        else {
            System.out.println("등수 : "+"꽝... 입니다");
        }
    }
}