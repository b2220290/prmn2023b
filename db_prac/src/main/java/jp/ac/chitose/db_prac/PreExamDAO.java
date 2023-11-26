package jp.ac.chitose.db_prac;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PreExamDAO { //データベースを利用するクラス
    private static final String URL = "jdbc:h2:~/h2db/db_prac;Mode=PostgreSQL;AUTO_SERVER=TRUE";
    private static final String USER_NAME = "b2220290";
    private static final String USER_PASS = "b2220290"; //データベースに接続

    public List<PreExam> selectPreExams(int lessThan) throws SQLException { //selsecPreExamsメゾット
        List<PreExam> returning = new ArrayList<>(); //戻り値:PreExamをリスト化
        String SQL = "select * from 学生情報 where 得点 >= ?"; //

        try (Connection conn = DriverManager.getConnection(URL, USER_NAME, USER_PASS);
             PreparedStatement stmt = conn.prepareStatement(SQL)) { //SQL文
            stmt.setInt(1, lessThan);
            ResultSet result = stmt.executeQuery(); //データベースの情報？？
            while (result.next()) {
                String col1 = result.getString("学生コード");
                String col2 = "null";
                String col3 = "null";
                int cor4 = result.getInt("得点");
                PreExam preExam = new PreExam(col1, col2, col3, cor4);
                returning.add(preExam); //結果に追加する
            }
        }
        return returning;
    }

    public int deletePreExam(String gakusekiCode) throws SQLException{ //学生コードからタプルの消去
        String sql="delete from 学生情報 where 学生コード = ?";
        int n=0;
        try(Connection conn=DriverManager.getConnection(URL,USER_NAME,USER_PASS);
            PreparedStatement stmt=conn.prepareStatement(sql)) {
                stmt.setString(1,gakusekiCode);
                n=stmt.executeUpdate();
        }
        return n;
    }
}