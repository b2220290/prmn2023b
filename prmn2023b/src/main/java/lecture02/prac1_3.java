package lecture02;

import java.util.Scanner;

public class prac1_3 {
    public static void main(String[] args) {
        System.out.println("学籍番号を入力してください");

        Scanner scan=new Scanner(System.in); //入力準備
        String seki=scan.next();

        Sansyo sansyo=new Sansyo(); //Sanyoインスタンス化
        int j=sansyo.gakuseki(seki); //学籍
        //j使いたくない

        System.out.println("パスワードを入力してください");
        String pass=scan.next();
        sansyo.passward(j,pass); //パスワード

    }
}
