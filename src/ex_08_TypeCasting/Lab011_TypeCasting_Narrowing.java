package ex_08_TypeCasting;

public class Lab011_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val1=300;
//        byte b= val1; //implicit narrowing not possible in JVM

        //Explicit narrowing
        byte b =(byte)val1;
        System.out.println(b); //it will not store complete value it will store only whatever byte can store
    }
}
