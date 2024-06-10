import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number: ");
        double num1 = sc.nextDouble();
        sc.nextLine();

        System.out.println("Input second number: ");
        double num2 = sc.nextDouble();
        sc.nextLine();

        System.out.println("What operation do you want to use?");
        String operation = sc.nextLine();

        if (operation.equals("sum")) {
            System.out.printf("Your answer is %f + %f = %f", num1, num2, num1 + num2);
//            System.out.println(operation.length());
        }else if (operation.equals("sub")){
            System.out.printf("%f-%f=%f", num1, num2, num1 - num2);
        }else if (operation.equals("mod")){
            System.out.printf("%f%f=%f", num1, num2, num1 % num2);
        }else if (operation.equals("div")){
            if (num2 == 0){
                System.out.println("Error! Can not divide by zero.");
            }else {
                System.out.printf("%f/%f =%f", num1, num2, num1 / num2);
            }
        }else if (operation.equals("mul")){
            System.out.printf("%f*%f =%f", num1, num2, num1 * num2 );
        }
        else{
            System.out.println("The operation "+ operation +" is not valid");
        }

    }
}

