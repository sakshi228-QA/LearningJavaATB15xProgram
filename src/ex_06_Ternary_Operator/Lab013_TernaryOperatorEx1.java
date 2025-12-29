package ex_06_Ternary_Operator;

public class Lab013_TernaryOperatorEx1 {
    public static void main(String[] args) {
//        syntax
//        result = condition? expression1 : expression2;
        int age=9;
        String CanSakshiGoToGoa= age > 18 ? "Yes" : "No";
        System.out.println(CanSakshiGoToGoa);

      int num=11;
      String IsNumpositive= num > 0? "+ve" : "-ve";
        System.out.println(IsNumpositive);

        boolean result= num>10? true : false;
        System.out.println(result);
    }
}
