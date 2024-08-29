import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    // randomオブジェクトの初期化
    Random rand = new Random();
    // Scannerオブジェクトの初期化
    Scanner scanner = new Scanner(System.in);

    // 計算パターン一覧
    CustomFunction calc1 = (a, b, c) -> {
        System.out.printf("%d + %d + %d = ", a, b, c);
        return a + b + c;
    };
    CustomFunction calc2 = (a, b, c) -> {
        System.out.printf("%d + %d - %d = ", a, b, c);
        return a + b - c;
    };
    CustomFunction calc3 = (a, b, c) -> {
        System.out.printf("%d - %d + %d = ", a, b, c);
        return a - b + c;
    };
    CustomFunction calc4 = (a, b, c) -> {
        System.out.printf("%d - %d - %d = ", a, b, c);
        return a - b - c;
    };
    
    // 計算パターン配列
    CustomFunction funcArray [] = new CustomFunction[] {calc1, calc2, calc3, calc4};

    // 正解後に次の問題を出題するか判定するためのフラグ。初期値はtrue
    boolean isNext = true;

    do {

        int calcNumber = rand.nextInt(funcArray.length);
        
        // 100~999までの値をa,b,cに代入
        int a = rand.nextInt(900) + 100;
        int b = rand.nextInt(900) + 100;
        int c = rand.nextInt(900) + 100;
        
        // 計算を行う
        int correct = funcArray[calcNumber].apply(a, b, c);
        // 解答の入力を受け付け
        int answer = scanner.nextInt();

        if (correct == answer) {
            System.out.println("正解です！次の問題に挑戦しますか？ (yes：1, no:0)");
            int judge = scanner.nextInt();
            if(judge == 0){
                isNext = false;
            }
        } else {
            System.out.println("不正解です");
        }

    } while(isNext);

    System.out.println("プログラムを終了します");
    scanner.close();
    }
}

// オリジナル関数インターフェース
@FunctionalInterface
interface CustomFunction {
    // 3個のInteger型の引数と1つのInteger型の戻り値を返す
        public abstract Integer apply(Integer a, Integer b, Integer c);
}

