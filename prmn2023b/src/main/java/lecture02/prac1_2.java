package lecture02;

import java.util.Scanner;

public class prac1_2 {
    public static void main(String[] args) {
        int[] num=new int[5];
        Scanner scan=new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.print("数字"+ i +"つ目");
            num[i]=scan.nextInt();
            System.out.print("");
        }

        Keisan kesan=new Keisan();
        int sum = kesan.kasan(num);
        System.out.println("合計値：" + sum);
        kesan.kurabe(sum);
    }
}
