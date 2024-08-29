import java.util.*;

public class NumberCopy2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("5つの整数を入力してください。");

        //カウントするはいれちゅを作る
        int cnt = 1;

        //５つの整数に入れていく
        int[] numA = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.print("整数" + cnt + "：");
            numA[i] = scanner.nextInt();
            cnt++;
        }


        System.out.println("配列numAからnumBにコピー");


        System.out.println("配列numAの内容");

        System.out.println("--------------");

        for(int i = 0; i < 5; i++){
            System.out.println("num[" + i + "]" + "=" + numA[i]);
            cnt++;
        }
        
        System.out.println();

        //numAをnumBにコピーしていく
        int[] numB = new int[5];

        System.out.println("配列numBの内容");

        System.out.println("--------------");

        for(int i = 0; i < 5; i++){
            numB[i] = numA[4 - i];
            System.out.println("num[" + i + "]" + "=" + numB[i]);
        }
    }
}

