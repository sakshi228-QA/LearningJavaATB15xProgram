package ex_03_Variables_DataTypes;

public class Lab005_Char_Lityeral {
    public static void main(String[] args) {
        char c1 = 'A';
        // A to Z, a-z, !@#$%^&*()_+
        // char c = "A"; String - "" - bunch of chars.
        char c2 = 'B';

        System.out.println(c1+c2); //prints A+B= 131 i.e. 65+66 ASCII values of A and B
        System.out.println(c1); //prints A

        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

//        System.out.println("SakshiShubham");
//        System.out.println("Sakshi"+new_line+"Shubham");
//        System.out.println("Sakshi\nShubham");
          System.out.println("Sakshi"+tab_line+"Shubham");
//        System.out.println("Sakshi"+back_space+"Shubham");
//        System.out.println("Sakshi"+carriage_return+"Shubham");
    }

}

