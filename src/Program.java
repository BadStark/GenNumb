import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        int number1 = (int) (Math.random()*10);
        int number2 = (int) (Math.random()*10);
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println("Сколько будет " +number1+ " - " +number2+ "?");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (number1 - number2 == answer){
            System.out.println("Ты прав!");
                    } else {
            System.out.println("Твой ответ неверен");
            System.out.println( number1+ " - " +number2+ " = " +(number1-number2));
        }
    }

}
