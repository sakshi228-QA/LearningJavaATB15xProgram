package ex_08_TypeCasting;

public class Lab010_TypeCasting_Widening {
    public static void main(String[] args) {
        byte b=10;
        int a =b; //widening .. implicit
        int a1= (int)b; //widening .. explicit
    }
}
