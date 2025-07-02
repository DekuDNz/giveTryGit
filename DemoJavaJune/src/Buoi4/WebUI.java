package Buoi4;

public class WebUI {

    public static String url = "facebook.com";
    public static String email = "vietlong@Gmail.com";
    public static String password = "1234565";
    public static void openUrl(String url){
        System.out.println(url);
    }

    public static void clickElement(String elementName){
        System.out.println("Click element : " + elementName);
    }
    public static void setText(String text){
        System.out.println("Set text : " + text);
    }

    public static String getElement(String elementName){
        return "viet long";
    }

    public static void main(String[] args) {
        openUrl(url);
        setText(email);
        setText(password);

    }
}
