package Buoi5;

public class BaiToanDTBIf {
    public static void main(String[] args) {
        double dtb = 10;

        if (dtb > 10 || dtb < 0) {
            System.out.println("not valid");
        } else {
            // Determine the grade category
            if (dtb > 8) {
                System.out.println("very good");
            } else if (dtb >= 6.5) {
                System.out.println("good");
            } else {
                System.out.println("weak");
            }
        }
    }
}
