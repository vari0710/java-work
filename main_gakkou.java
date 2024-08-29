import java.util.Scanner;

public class main_gakkou {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 5x5のフィールドを初期化
        char[][] field = {
            { '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-' },
            { '-', '-', '-', '-', '-' },
        };

        // 地雷の位置を保持する二次元配列
        boolean[][] mines = new boolean[5][5];

        // 地雷の位置を設定
        mines[2][1] = true; // (1, 2)に地雷
        mines[0][0] = true; // (0, 0)に地雷
        mines[3][4] = true; // (4, 3)に地雷

        int cellsToClear = 25 - 3; // 地雷を除いたマスの数
        int clearedCells = 0; // クリアしたマスの数

        while (true) { // 無限ループを開始
            int X = scanner.nextInt(); // ユーザーからX座標を入力
            int Y = scanner.nextInt(); // ユーザーからY座標を入力

            // 入力の判定処理
            if (X < 0 || X > 4 || Y < 0 || Y > 4) {
                System.out.println("範囲外です");
                continue;
            }

            // 地雷のマスには'*'を設定
            if (mines[Y][X]) {
                field[Y][X] = '*';
            } else {
                // 周囲の地雷の数をカウント
                int mineCount = 0;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        int newY = Y + i;
                        int newX = X + j;
                        if (newY >= 0 && newY < 5 && newX >= 0 && newX < 5 && mines[newY][newX]) {
                            mineCount++;
                        }
                    }
                }
                // 既にクリア済みのマスを再度カウントしないようにする
                if (field[Y][X] == '-') {
                    clearedCells++;
                }
                field[Y][X] = (char) (mineCount + '0'); // 地雷の数を文字として設定
            }

            // フィールドの状態を出力
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(field[i][j]);
                }
                System.out.println();
            }
            System.out.println(); // フィールド全体の後に改行を追加

            // 全ての地雷以外のマスが選択された場合、ゲームをクリア
            if (clearedCells == cellsToClear) {
                System.out.println("ゲームクリア"); // クリアメッセージを表示
                break; // ループを抜けてプログラムを終了
            }

            // 地雷がある場合または特定の座標が入力された場合、ゲームを終了
            if (mines[Y][X]) {
                System.out.println("ゲーム終了"); // 終了メッセージを表示
                break; // ループを抜けてプログラムを終了
            }
        }
        scanner.close(); // Scannerを閉じてリソースを解放
    }
}