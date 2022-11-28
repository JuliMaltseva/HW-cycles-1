public class Main {
    public static void main(String[] args) {

        //Домашнее задание 1
        System.out.println("Домашнее задание 1");
        //Задача 1
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Задача 2
        System.out.println("Задача 2");
        for (int j = 10; j >= 1; j--) {
            System.out.println(j);
        }

        //Задача 3
        System.out.println("Задача 3");
        for (int x = 0; x <= 17; x=x+2) {
            System.out.println(x);
        }

        //Задача 4
        System.out.println("Задача 4");
        for (int q = 10; q >= -10; q--) {
            System.out.println(q);
        }

        //Домашнее задание 2
        System.out.println("Домашнее задание 2");
        //Задача 1
        System.out.println("Задача 1");
        for (int y = 1904; y <= 2096; y = y + 4) {
            System.out.println(y + " год является високосным.");
        }

        //Задача 2
        System.out.println("Задача 2");
        for (int n = 7; n <= 98; n = n + 7){
            System.out.println(n);
        }

        //Задача 3
        System.out.println("Задача 3");
        for (int m = 1; m <= 512; m = m * 2){
            System.out.println(m);
        }

        //Домашнее задание 3
        System.out.println("Домашнее задание 3");
        //Задача 1
        System.out.println("Задача 1");
        int saving = 29000;
        int totalSav = 0;
        for (int a = 0; a <= 12; a++){
            totalSav = totalSav + saving;
            System.out.println("Месяц " + a + " сумма накоплений равна " + totalSav + " рублей.");
        }

        //Задача 2
        System.out.println("Задача 2");
        int deposit = 29000;
        int totalDep = 0;
        for (int b = 0; b <= 12; b++){
            totalDep = totalDep + totalDep / 100;
            totalDep = totalDep + deposit;
            System.out.println("Месяц " + b + " сумма накоплений равна " + totalDep + " рублей.");
        }
    }
}