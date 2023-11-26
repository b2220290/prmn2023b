package jp.ac.chitose.db_prac;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
public class SelectDemo {
    public static void main(String[] args) {
        System.out.println("点数を入力してください:");
        Scanner scan=new Scanner(System.in);
        int lessThan=Integer.valueOf(scan.nextLine()); //標準入力

        try {
            PreExamDAO dao=new PreExamDAO();
            List<PreExam> preExams=dao.selectPreExams(lessThan); //戻り値：条件を満たした
            for (PreExam preExam:preExams){
                preExam.print();
            }
        }catch (SQLException e){ //これ何？
            e.printStackTrace();
        }
    }
}
