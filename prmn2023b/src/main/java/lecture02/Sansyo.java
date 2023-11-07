package lecture02;

public class Sansyo {
    Toroku toroku=new Toroku();
    String[][] zizen=toroku.joho(); //登録済み情報準備用

    int gakuseki(String seki){ //学籍参照メゾット
        for (int j=0;j<5;j++) {
            if (seki.equals(zizen[0][j])) {
                return j; //一致した学籍の座標
            }
        }

/*      //こっちで行きたい
        for (String gaku:zizen[0]) {
            if (seki.equals(gaku)) {
                return;
            }
        }
 */
        System.out.println("error!!"); //一致しなかった場合
        System.exit(0);
        return 0;
    }

    void passward(int j,String pass){ //パスワード参照メゾット
            if (pass.equals(zizen[1][j])) {
                System.out.println("ログイン完了");
                return;
            }

/*      //学籍とパスワードをくくれてない
        for (String ward:zizen[1]) {
            if (pass.equals(ward)) {
                System.out.println("ログイン完了");
                return;
            }
        }
 */
        System.out.println("不正なアクセス"); //一致しなかった場合
        System.exit(0);
        return;
    }




}
