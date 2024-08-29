import java.util.Scanner;

public class PrintAsterisk{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //ユーザーから縦の入力をもらう
        System.out.print("縦に何個表示しますか？：");
        int high = scanner.nextInt();

        //ユーザーから縦の入力をもらう
        System.out.print("横に何個表示しますか？：");
        int weight = scanner.nextInt();

        //*で四角をつくる
        for(int i = 0; i < high; i++){
            for(int j = 0; j < weight; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}