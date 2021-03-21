package HM3Bolshova;

import java.util.Random;
import java.util.Scanner;

public class task1 {

    public static void randomNumber(int num){
        if(num == 1){
            loop();
        }
    }

    public static void loop(){

        Random random = new Random();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 0 до 9");
        int number = random.nextInt(9);

        for (int i = 0; i < 3; i++ ) {


            int x = Integer.parseInt(sc.nextLine());

            if (number != x) {

                if (x < number) {
                    System.out.println("больше");
                } else {
                    System.out.println("меньше");
                }

            } else {

                System.out.println("Ура! Победа! " + number);
                System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
                int num = Integer.parseInt(sc.nextLine());
                randomNumber(num);
            }

        }

        System.out.println("Загаданный номер был: " + number);
        System.out.println("«Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        int num = Integer.parseInt(sc.nextLine());
        randomNumber(num);

    }

    public static void main(String[] args) {
        randomNumber(1);
    }

}