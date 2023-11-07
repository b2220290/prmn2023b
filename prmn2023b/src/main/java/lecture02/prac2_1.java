package lecture02;

import java.util.Scanner;

public class prac2_1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("名前を入力してください");
        String name=scan.next();
        System.out.println("学籍番号を入力してください");
        int number=scan.nextInt();

        System.out.println("氏名："+ name +",学籍番号："+number);
    }
}
