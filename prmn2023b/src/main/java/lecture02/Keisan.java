package lecture02;

public class Keisan {
    int kasan(int[] num){
        int sum=0;
        for (int x:num){
            sum+=x;
        }
        return sum;
    }

    void kurabe(int sum){
        if (sum <= 49){
            System.out.println("small");
        }else if (sum <100){
            System.out.println("big");
        }else {
            System.out.println("great!!");
        }
    }
}
