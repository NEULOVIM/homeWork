package lesson3.Additionaly;

import java.util.Scanner;

public class ADD2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите сумму вклада");
        float sum = sc.nextFloat();

        System.out.println("Введите количество месяцев");
        float math = sc.nextInt();


        float sumFinish = (sum * 7 / 100);    // число + %, за 1 месяц.

        int i = 0;
        for (; i < math; i++)
        {
        }

        float finish = sumFinish * i + sum;
        System.out.println(finish);

//        Почему сначала цикл не отработает а потом не прочтёт то что за циклом?
    }
}