package Buoi6;

public class DemoArray2 {
    public static void main(String[] args) {
        int number2[] = {2,3,4,5,6,7,8,9};
        // update array
        number2[2] = 100;
        System.out.println("check length : " + number2.length);
        for(int number : number2){
            System.out.println(number);
        }
        /// example 2 :
        String dataCustomer[] = {"Long","Viet","Nguyen"};
        // way 1

        for(String customer: dataCustomer){
            if(customer.equals("123")){
                System.out.println("Co nguoi can tim");
                break;
            }else{
                System.out.println("khong co");
                break;
            }
        }

        //way 2
        for(int i = 0 ; i < dataCustomer.length; i ++){
            if(dataCustomer[i].equals("Long")){
                System.out.println("co nguoi can tim cho for");
                break;
            }else {
                System.out.println("khong co nguoi can tim cho for");
            break;

            }
        }

    }
}
