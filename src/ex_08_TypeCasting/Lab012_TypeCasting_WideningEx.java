package ex_08_TypeCasting;

public class Lab012_TypeCasting_WideningEx {
    public static void main(String[] args) {
        int course=100;
        float GST=18.45f;

        //Implicit narrowing - not allowed
        //int total= course + GST;
        //Explicit narrowing - allowed but we will loose decimal
        int total1=course +(int)GST;
        System.out.println(total1); //118

        //Implicit widening
        float total2= course + GST;
        System.out.println((total2)); //118.45
        //Explicit widening
        float total3= (float)course + GST;
        System.out.println(total3);  //118.45
    }
}
