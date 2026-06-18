import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int[] deck = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 100; i++) {
            int rIdx = rd.nextInt(9);
            int temp = deck[0];
            deck[0] = deck[rIdx];
            deck[rIdx] = temp;
        }

        int[] com = {deck[0], deck[1], deck[2]};

        while (true) {
            System.out.print("정수 3개 입력: ");
            int[] user = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

            int strike = 0, ball = 0;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (com[i] == user[j]) {
                        int dummy = (i == j) ? strike++ : ball++;
                    }
                }
            }

            System.out.println("-> " + strike + ":S " + ball + ":B");
            if (strike == 3) {
                System.out.println("게임 종료!");
                break;
            }
        }
    }
}