package Buoi5;

public class IfElse {


    public static void main(String[] args) {
        int age = 20;
        String address = "Can Tho";
        String header = "Login CMS Page";
        String gender = "Male";

        // so sanh bang trong chuoi  dung ham equals();
        // so sanh chua trong chuoi dung ham contains()
        if(age > 18 && address.equals("Can Tho") ){
            System.out.println("di nghia vu");
        };

        if(header.contains("Login")){
            System.out.println("login successful");
        }

    }
}
