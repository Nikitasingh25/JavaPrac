import java.util.*;

public class Calculator {
    static double calculator(int op1, int op2, char op) {
        double op3 = 0;
        if (op == '+') {
            op3 = op1 + op2;
            System.out.println(op1 + op2);

        }

        if (op == '-') {
            op3 = op1 + op2;
            System.out.println(op1 - op2);

        }
        return op3;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the operand  1 =");
        int op1 = input.nextInt();
        System.out.println("Enter the operand 2=");
        int op2 = input.nextInt();
        System.out.println("Enter the operator=");
        char op = input.next().charAt(0);
        calculator(op1, op2, op);
    }
}
