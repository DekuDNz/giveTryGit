package Buoi4;

public class DemoToanTu1 {
public double sum;
public double result;


// hàm không  trả về
    public void cong2so(){
        int a = 5;
        int b= 10;
        sum = a + b;
        System.out.println(sum);
    }

    public void loginCRM(){
        System.out.println("login page");
        System.out.println("go to dash board");
        System.out.println("click on payment");
        System.out.println("successfully");
    }

    // Hàm có tham số . ko return
    public void sum2No(int no1,int no2){

        int sum = no1 + no2 ;
        System.out.println(sum);
    }
// Hàm có static nhưng trả về ;

    static int returnsum(int a,int b){
         int res = a + b;
         return res;
    }
    // Hàm có tham số return ;
    public int mutiply(int a ,int b){
        int res = a * b;
        return res;
    }

// hàm có trả về kết qu
  public  double nhan2so(){
        int a = 5;
        int b = 10;
        result = a * b ;
        return result;
    }


    public static void main(String[] args) {
     DemoToanTu1 callToanTu = new DemoToanTu1();
     callToanTu.cong2so();

        System.out.println(callToanTu.nhan2so() + 10);

        callToanTu.loginCRM();


      int res = callToanTu.mutiply(4,3);
        System.out.println(res);

        int x = returnsum(2,3);
        System.out.println(x);
    }


}
