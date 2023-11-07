package lecture02;

public class Toroku {
    String[][] joho(){
        String[][] zizen=new String[2][5]; //zizen[i][j]
        for (int j=0;j<5;j++){
            zizen[0][j]="B200100"+j; //i=0:学籍
            zizen[1][j]="abcd"+j; //i=1:パスワード
        }
        return zizen;

    }
}
