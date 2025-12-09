import java.util.Random;
public class Random{ //Make sure to name it with the same word which you'll use for compiling.For eg- here I'll compile it using javac Random.java
    public static void main(String[]args){ //It is java mandatory entry point,telling the JVM exactly where to start a standalone application
        Random random = new Random();// Because we need to generate a random number
        int number;
        //int number1;(number1, number2, number3 are when you wish to print 3 random numbers)
        //int number2;
        //int number3;
        number = random.nextInt(1,10);//Here random numbers from 1-10 will be included and not 1-11
        //number1 = random.nextInt(1,10);
        //number2 = random.nextInt(1,10);
        //number3 = random.nextInt(1,10);
        
        System.out.print(number);//print the number
        //System.out.println(number1); 
        //System.out.println(number2);
        //System.out.println(number3);
        }

}

