import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lotto1 {

    public static void main(String[] args){
        int[] numbers = new int[6];
        Random gen = new Random();

        for(int i = 0; i<6; i++){
            numbers[i] = gen.nextInt(45)+1; // ����
            for(int j = 0; j<i; j++){
                if(numbers[i] == numbers[j]){
                    i = i-1;
                    break;
                }
            }
        }


        // ���� ����
        byte t = 0;

        for(int i = 0; i<numbers.length -1 ; i++){
            for(int j = i +1; j< numbers.length; j++){
                if(numbers[i] > numbers[j]){
                    t = (byte)numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = t;
                }
            }
        }

        String dang = "";

        for(int a = 0; a<6; a++){
            if(numbers[a]<10){
                dang = dang + "0"+numbers[a] ;
            }else{
                dang = dang +numbers[a] ;
            }


        }

        // ���� ��÷ ��ȣ �ؽ�Ʈ�� ���� �о ��ȣ ��

        BufferedReader br = null;
        InputStreamReader isr = null;
        FileInputStream fis = null;
        File file = new File("dang.txt");
        String temp = "";
        int succ = 0;

        try {


            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis, "UTF-8");
            br = new BufferedReader(isr);

            while( (temp = br.readLine()) != null) {

                if(temp.length() > 12)
                    temp = temp.substring(0,11);

                if(temp.equals(dang)){
                    succ++;
                }

            }

            if(succ == 0){
                System.out.printf("=*= %d,%d,%d,%d,%d-------%d =*=",numbers[0],numbers[1],
                        numbers[2],numbers[3],numbers[4],numbers[5]);
            }


        } catch (Exception e) {
            System.out.println(e);
        } finally {

            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}