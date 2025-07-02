package Buoi7;

public class XuLyChuoi {
    public static void main(String[] args) {
        String name1 = "Viet long";
        String name2 = "Le Nguyen";
        // cat chuoi
        System.out.println(name1.substring(2));
        System.out.println(name2.substring(0,2)); // lay cac chu cat

        System.out.println(name1);
        // ghep chuoi

        System.out.println(name1 + " " + name2 );
        // chuyen kieu in hoa thuong
        String name3 = " viet long ";
        System.out.println(name3.toUpperCase());
        // xoa ki tu khoang trang 2 dau
        System.out.println(name3.trim());
        // do dai chuoi

        System.out.println("do dai chuoi " + name2.length());
        // tim kiem ki tu
        System.out.println(name1.charAt(2));
        // vi tri cua ki tu
        System.out.println(name1.indexOf("lon"));
        // so sanh chuoi + so sanh chua
        String name4 ="Test Automation";
        String name5 = "Test Automation";
        System.out.println(name4.equals(name5));
        // So sanh chua'
        System.out.println(name5.contains("Automation"));

        // so sanh bo qua hoa thuong
        System.out.println(name4.equalsIgnoreCase(name5));
    }
}
