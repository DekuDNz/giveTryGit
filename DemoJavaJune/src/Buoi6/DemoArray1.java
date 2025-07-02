package Buoi6;

public class DemoArray1 {
    public static void main(String[] args) {
        //datatype <name array>[] = new datatype[size];
        //example : 1
        int number[] = new int[3];
        number[0] = 123;
        number[1]= 124;
        number[2]= 153;
        // dung for advance example 1
        for(int numbera : number){
            System.out.println(numbera);
        }
        // dung for example 1
        for(int i = 0 ; i < number.length;i++){
            System.out.println(number[i]);
        }
    }
}
