import java.util.Random;
public class Random{ //Make sure to name it with the same word which you'll use for compiling.For eg- here I'll compile it using javac Random.java
    public static void main(String[]args){ //It is java mandatory entry point,telling the JVM exactly where to start a standalone application
        Random random = new Random();// Because we need to generate a random number
        int number;
        number = random.nextInt(1,10);//Here random numbers from 1-10 will be included and not 1-11
        System.out.print(number);//print the number
        }
}