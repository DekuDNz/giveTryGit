package Buoi5;

public class SwitchCase {
    public static void main(String[] args) {

        // example 1
        int number = 30;
        switch (number){
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            default:
                System.out.println("can't not find 30");
        }
        //example 2

      String browser = "chrome";

        switch(browser){
            case "chrome" :
                System.out.println("run in chrome");
                break;
            case "google":
                System.out.println("run in google");
                break;
            default:
                System.out.println("can not run");
        }

    }
}
