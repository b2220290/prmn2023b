package jp.ac.chitose.db_prac;


public class PreExam { //学生情報クラス："テーブルからの検索結果を格納するインスタンス"を作成するクラス
    private String gakusekiCode; //学籍番号
    private String familyName; //氏
    private String firstName; //名
    private int point; //得点

    public PreExam(String gakusekiCode, String familyName, String firstName, int point) { //コンストラクタ
        this.gakusekiCode = gakusekiCode;
        this.familyName = familyName;
        this.firstName = firstName;
        this.point = point;
    }

    public void print(){
        System.out.println(gakusekiCode +"さんは"+ point +"点");
    }
}