import java.util.Scanner;

public class BinarySearch{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("検索するデータを入力");

        // 検索するデータを受け取る
        int receive = scanner.nextInt();

        // 格納する配列を作る
        int[][] Binary_array = new int[10][10];


        // 配列を出力する
        for(int i = 0; i < 10; i++){
            System.out.print("[ " + i + " ]");
        }

        System.out.println();
        
        for(int i = 0; i < 10; i++){

                for(int j = 0; j < j + 10; j++){

                    Binary_array[i][j] = j;
                    
                }
                
            System.out.print("| " + i * 10 + " |");
        }

            System.out.println("start!");

            // 繰り返す回数
            int cnt = 1;

            // 探索区間の先頭のインデックス
            int low = 0;

            // 探索区間の末尾のインデックス
            int high = Binary_array.length - 1;


            // 探索を3回繰り返す
            for(int i = 0; i < 3; i++){

                System.out.println(cnt + "回目：");
                cnt++; // 繰り返す回数を加算する

                // 真ん中の値
                int mid = low + (high - low) / 2;

                // receiveとmidの値がちがう
                if(receive != mid){

                    // 中央より右側を探索する
                    if(receive < mid){
                        high = mid + 1;

                        System.out.println("!=" + Binary_array[mid].length);
                        

                    }else{ 
                        //中央より左側を探索する
                        low = mid - 1;

                        System.out.println("!=" + Binary_array[mid].length);
                    }

                    // Lを出力
                while (0 < low) {
                    System.out.print("L" + "   ");
                    break;
                }

                // Hを出力
                while (0 < high) {
                    System.out.print("H" + "   ");
                    break;
                }

                for(int a = 0; a < 10; a++){

                    System.out.print("[ " + a + " ]");
        
                        for(int j = 0; j < 10; j++){
        
                            Binary_array[a][j] = j; 
                        }
        
                    System.out.print("| " + Binary_array[a].length + " |");
                    
                }

                // Mを出力
                while (0 < high) {
                    System.out.print("M" + "   ");
                    break;
                }

            // midとreceiveが一緒
            }else{

            

                // Lを出力
                while (0 < low) {
                    System.out.print("L" + "   ");
                    break;
                }

                // Hを出力
                while (0 < high) {
                    System.out.print("H" + "   ");
                    break;
                }

                for(int a = 0; a < 10; a++){

                    System.out.print("[ " + a + " ]");
        
                        for(int j = 0; j < 10; j++){
        
                            Binary_array[a][j] = j; 
                        }
        
                    System.out.print("| " + Binary_array[a].length + " |");
                    
                }

                // Mを出力
                while (0 < high) {
                    System.out.print("M" + "   ");
                    break;
                }

          }

            if(i == 3 && receive == mid){
                System.out.println("要素番号" + Binary_array[mid] + "で発見しました");
            }else{
                System.out.println("見つかりませんでした");
            }

        }

        
    }
} 