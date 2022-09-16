import java.util.Random;
import java.util.Scanner;

public class ddd {
    public static void main(String[] args) {
	//주석추가
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int[] lotto = new int[6];
        for(int i =0; i<6; i++) {
            lotto[i] = random.nextInt(45)+1;
            for(int j =0; j<i; j++) {
                if(lotto[i] == lotto[j]){
                    i--;
                }
            }
            for(int j=0; j<6; j++) {
                if(lotto[i] < lotto[j]){
                    int temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] =temp;
                }
            }
        }

        EX:while (true) {
            System.out.println("lotto java 프로그램 ");
            System.out.println("1.자동입력");
            System.out.println("2.수동입력");
            System.out.println("3.번호확인");
            System.out.println("4.로또종료");
            int menu = scan.nextInt();

            switch (menu) {
                case 1:
                    //자동
                    lotto=genAuto(lotto,new Random());
                    break;
                case 2:
                    //수동
                    lotto=genMeunal(lotto);
                    break;
                case 3:
                    //확인
                    printLotto(lotto);
                    break;
                case 4:
                    System.out.println("로또종료");
                    break EX;
            }
        }
    }
    public static int[] genAuto(int[] lotto,Random random) {

        System.out.print("자동입력");
        createLotto(lotto,random);
        deduplLotto(lotto,random);
        sortLotto(lotto);
        return lotto;
    }

    public static int[] genMeunal(int[] lotto) {
        Scanner scan = new Scanner(System.in);
        System.out.println("6개의 로또번호를 입력해주세요");
        for(int i =0; i<6; i++) {
            lotto[i]=scan.nextInt();
        }
        return lotto;
    }

    public static void deduplLotto(int[] lotto, Random random) {
        for(int i =0; i<6; i++) {
            lotto[i] = random.nextInt(45) +1;
            for(int j =0; j<1; j++) {
                if(lotto[i] == lotto[j]) {
                    i--;
                }
            }
        }
    }

    public static void createLotto(int[] lotto, Random random) {
        for(int i=0; i<6; i++)
        lotto[i] = random.nextInt(45) +1;

    }

    public static void sortLotto(int[] lotto) {
        for (int i =0; i <5; i++) {
            for (int j =0; j<5-i; j++) {
                if (lotto[j] > lotto[j+1]) {
                    int temp = lotto[j+1];
                    lotto[j+1] =lotto[j];
                    lotto[j] =temp;
                }

            }
        }
    }

    public static void printLotto(int[] lotto) {
        for(int i =0; i<6; i++)
        System.out.printf("%d",lotto[i]);
        //System.out.println("  ");
    }
}
