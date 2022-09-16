import javax.swing.*;
import java.util.Arrays;

public class testLotto {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("로또 개수를 입력하세요");
        int ltn = Integer.parseInt(input);

        System.out.println("입력한 로또 수 :"+ ltn);
        for(int j =0; j< ltn; j++) {
            int[] lotto = lotto();
            int[] lotto2 = lotto_CP();
            int[] lotto3 = lotto_SP();
            Arrays.sort(lotto);
            Arrays.sort(lotto2);
            Arrays.sort(lotto3);
            System.out.println("첫번째 방식 :" + Arrays.toString(lotto));
            System.out.println("첫번째 방식 :" + Arrays.toString(lotto2));
            System.out.println("첫번째 방식 :" + Arrays.toString(lotto3));
            System.out.println("=======================================");

        }

    }
    //Lotto_SP
    private static int[] lotto_SP() {
        int[] lottoT = new int[45];
        int[] lotto = new int[6];
        for(int i =0; i<lottoT.length; i++) {
            lottoT[i] =i + 1;
        }
        int tmp =0;
        for(int i =0; i < lottoT.length; i++) {
            int j =(int) (Math.random()*45);
            tmp = lottoT[i];
            lottoT[i] =lottoT[j];
            lottoT[j] =tmp;
        }
        System.arraycopy(lottoT,0, lotto, 0, 6);
        return lotto;
    }
    //Lotto_CP
    private static int[] lotto_CP() {
        int[] lotto = new int[6];
        int[] lottoT = new int[45];
        for(int i =0; i < lottoT.length; i++) {
            lottoT[i] =i +1;
        }
        int length = lottoT.length;
        for(int i=0; i<lotto.length; i++) {
            int j =(int) (Math.random()*length);
            lotto[i] = lottoT[j];
            lottoT[j] = lottoT[length -1];
            length--;
        }
        return lotto;
    }
    //Lotto 이중 for문
    private static int[] lotto() {
        int[] Lotto = new int[6];
        for(int i=0; i<Lotto.length; i++) {
            Lotto[i] =(int) (Math.random() * 45) +1;
            for (int j =0; j<i; j++) {
                if(Lotto[i] == Lotto[j])
                    i--;
            }
        }
        return Lotto;
    }
}
