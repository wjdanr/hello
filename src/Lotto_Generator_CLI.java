import java.util.Random;
import java.util.Scanner;


public class Lotto_Generator_CLI {
    public static void main(String[] args) {

        int menu = 0;
        boolean running = true;

        int lottos[][]= null;

        while(running) {
            menu = inputMenu(menu);

            switch (menu) {

                case 1:
                    lottos = createLottsAuto(lottos);

                    break;
                case 2:
                    lottos = createLottosMenual();

                    break;
                case 3:
                    printLottos(lottos);
                    break;
                case 4:
                    running = false;
                default:
                    System.out.println("1~4사이의 숫자를 입력하세요");
            }
        }
    }



    private static int[][] printLottos(int[][] lottos) {
            return lottos;
    }
    private static int[][] createLottosMenual() {
            return null;
    }
    static int[][] createLottsAuto(int[][] lotto) {
           Scanner scan = new Scanner(System.in);
           Random ra = new Random(45);
           System.out.println("몇개를 출력하시겠습니까?");
                  System.out.println("입력");
                  int count = scan.nextInt();
                  lotto = new int[count][6];
                  for(int j =0; j<count; j++) {
                      System.out.printf("&d번째 로또번호입니다." ,j+1);
                      for(int i =0; i<6; i++) {
                          lotto[j][i] = ra.nextInt(45)+1;
                          System.out.printf("%d",lotto[j][i]);
                      }
                      System.out.println();
                  }
                  return lotto;
    }

    static int inputMenu(int menu) {
    Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("1.Lotto번호 자동 생성");
        System.out.println("2.Lotto번호 수동 생성");
        System.out.println("3.Lotto번호 확인 하기");
        System.out.println("4.Lotto 프로그램 종료");
        System.out.println("입력>");
        menu = scan.nextInt();

        return menu;

    }
}