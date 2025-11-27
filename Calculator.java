import java.util.Scanner; //importing Scanner will help us to take the input
public class Calculator{ //Keep The class name same as file name(for eg- Calculator.java)
    public static void main(String[] args){ //No idea why but always remember(psvm)
        Scanner scanner = new Scanner(System.in);
        double n1; //this will be our first number
        double n2; //this willbe second number
        char operator; //this is for what kind of calculation we want to perform
        double result = 0; 

        System.out.print("Enter the first number ");
        n1 = scanner.nextDouble();

        System.out.print("Enter the Second number ");
        n2 = scanner.nextDouble();

        System.out.print("Enter the Operator(+ , - , * , /) ");
        operator = scanner.next().charAt(0);

        System.out.print("The result will be:- ");
        switch(operator){
            case '+' -> result = n1 + n2;
            case '-' -> result = n1 - n2;
            case '*' -> result = n1*n2;
            case '/' -> result = n1/n2;

        }
        System.out.println(result);

        scanner.close();
    }
}
