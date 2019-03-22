package hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите код доступа");
        int login = scan.nextInt();
        int[] table1 = new int[5];
        int[] table2 = new int[8];
        int[] table3 = new int[10];
        if (login == 11) {
            int admin;
            System.out.println("Вы вошли, как администратор");
        } else if (login == 22) {
            System.out.println("Вы вошли, как doc1");
            System.out.println("Для просмотра записей введите 1");
            int doc1 = scan.nextInt();
            for (int i = 0; i < table1.length; i++) {
                System.out.println("Ваши записи " + i);
            }
        } else if (login == 33) {
            System.out.println("Вы вошли, как doc2");
            System.out.println("Для просмотра записей введите 1");
            int doc2 = scan.nextInt();
            for (int i = 0; i < table2.length; i++) {
                System.out.println("Ваши записи " + i);
            }
        } else if (login == 44) {
            System.out.println("Вы вошли, как doc3");
            System.out.println("Для просмотра записей введите 1");
            int doc3 = scan.nextInt();
            for (int i = 0; i < table3.length; i++) {
                System.out.println("Ваши записи " + i);
            }
        }
            if (login == 55) {
                System.out.println("Вы вошли, как главный врач");
                System.out.println("Для просмотра записей doc1 введите 1");
                System.out.println("Для просмотра записей doc2 введите 2");
                System.out.println("Для просмотра записей doc3 введите 3");
                int cheif = scan.nextInt();
                if(cheif==1){
                    System.out.println("Записи doc1"+table1);
                } else if(cheif==2){
                    System.out.println("Записи doc2"+table2);
                } else if(cheif==3){
                    System.out.println("Записи doc3"+table3);
                }
            }
            System.out.println("Введите код повторно");
    }
}
