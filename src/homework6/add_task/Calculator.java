package homework6.add_task;

public class Calculator {

    public static class Add{
        public Add(double num1, double num2){
            double result = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + result);
        }
    }

    public static class Sub{
        public Sub(double num1, double num2){
            double result = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + result);
        }
    }

    public static class Mult{
        public Mult(double num1, double num2){
            double result = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + result);
        }
    }

    public static class Div{
        public Div(double num1, double num2){
            if(num2 == 0) {
                System.out.println("На ноль делить нельзя!");
                return;
            }

            double result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + result);

        }
    }
}
