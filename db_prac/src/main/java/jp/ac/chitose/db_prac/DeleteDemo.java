package jp.ac.chitose.db_prac;

import java.sql.SQLException;
import java.util.Scanner;

public class DeleteDemo { //データベースを利用するクラス
    public static void main(String[] args) {
        System.out.println("中間テストの点数を削除する学生コードは？:");
        Scanner scan=new Scanner(System.in);
        String gakusekiCode=scan.nextLine(); //標準入力

        try {
            PreExamDAO dao=new PreExamDAO();
            int n=dao.deletePreExam(gakusekiCode);
            System.out.println(n);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
