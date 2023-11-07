package lecture02;

import java.util.Scanner;

public class prac2_2 {
    public static void main(String[] args) {
        String name_1="千歳花子";
        int num_1=2110000;
        Scanner scan=new Scanner(System.in);
        Login log=new Login(name_1,num_1);

        System.out.println("名前を入力してください");
        String name_2=scan.next();
        System.out.println("学籍番号を入力してください");
        int num_2=scan.nextInt();
        log.message(name_2,num_2);

/*
        String mes=log.message(name_2,num_2);
        message.mes();

 */


    }
}
