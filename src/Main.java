public class Main {
    public static void main(String[] args) {
        //task1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
        //task2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();
        //task3
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println();

        //task4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();
        //task5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();
        //task6
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
        System.out.println();
        //task7
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
        System.out.println();
        //task8
        int money = 29000;
        int accumulation = 0;
        for (int i = 1; i <= 12; i++) {
            accumulation = money + accumulation;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + accumulation + " рублей");
        }
        System.out.println();
        //task9
        int money1 = 29000;
        int accumulation2 = 0;
        for (int i = 1; i <= 12; i++) {
            accumulation2 = accumulation2 + accumulation2/100;
            accumulation2 = accumulation2 + money1;
            System.out.println("Месяц " + i + ",сумма накоплений равна " + accumulation2 + " рублей");
        }
        System.out.println();
        //task10
        int multiplicationTable = 2;
        int result;
        for (int i = 1; i <= 10; i++) {
            result = multiplicationTable * i;
            System.out.println(multiplicationTable + " * " +  i +  " = " + result);
        }

    }
}