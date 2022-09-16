import java.util.Scanner;

public class Lotto_test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scan = new Scanner(System.in);

        int[] lotto = new int[7];    //로또 당첨 번호

        //당첨번호 랜덤으로 받기
        for(int i=0; i<7; i++){
            lotto[i] = (int)(Math.random()*45)+1;
            for(int j=0; j<i; j++){
                if(lotto[i] == lotto[j]){
                    i--;
                    break;
                }
            }
        }

        //구매할 로또 개수
        System.out.print("로또를 몇개 구매하시겠습니까? : ");
        int number = scan.nextInt();


        //당첨번호 출력
        System.out.print("현재 당첨번호는 ");
        for(int i=0; i<6; i++){
            System.out.print(lotto[i] + ",");
        }
        System.out.println(" 보너스 번호는 " + lotto[6] + "입니다.");

        System.out.println();

        int[] mylotto = new int[7];    //구매한 로또번호

        for(int k=0; k<number; k++){

            int count = 0;    //일치하는 번호 개수

            //구매한 랜덤번호
            for(int w=0; w<7; w++){
                mylotto[w] = (int)(Math.random()*45)+1;
                for(int p=0; p<w; p++){
                    if(mylotto[w] == mylotto[p]){
                        w--;
                        break;
                    }
                }
            }


            System.out.print("구매하신 추첨번호는 ");
            for(int z=0; z<6; z++){
                System.out.print(mylotto[z] + ",");
            }
            System.out.print(" 보너스 번호는 " + mylotto[6]);


            //당첨번호와 일치하는 숫자가 있으면 count 증가
            for(int i=0; i<7; i++){
                for(int j=0; j<7; j++){
                    if(lotto[i] == mylotto[j]){
                        count++;
                    }
                }
            }

            switch(count){
                case 7:
                    System.out.println(".. 1등이다!! 아싸 오늘 저녁은 치킨이닭!!");
                    break;
                case 6:
                    System.out.println(".. 2등이다!!" + "일치하는 번호는 " + count + "개 입니다.");
                    break;
                case 5:
                    System.out.println(".. 3등이다!!" + "일치하는 번호는 " + count + "개 입니다.");
                    break;
                case 4:
                    System.out.println(".. 4등이다!!" + "일치하는 번호는 " + count + "개 입니다.");
                    break;
                case 3:
                    System.out.println(".. 5등이다!!" + "일치하는 번호는 " + count + "개 입니다.");
                    break;
                default :
                    System.out.println("입니다. " + "일치하는 번호는 " + count + "개 입니다.");
                    break;
            }

            //1등 당첨되면 count 종료
            if(count == 7){
                break;
            }

        }

    }

}
