import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = new Scanner(System.in).nextDouble();

        System.out.println("Введите второй вес: ");
        double second = new Scanner(System.in).nextDouble();

        System.out.println("Введите третий вес: ");
        double third = new Scanner(System.in).nextDouble();

       // double greatest = 0;
        //double average = 0;
        //double smallest = 0;
       if (first>second&&first>third) {
           System.out.println("Наибольший вес: " + first);
       } else if (second>first&&second>third){
           System.out.println("Наибольший вес: " + second);
       } else if (third>first&&third>second){
           System.out.println("Наибольший вес: " + third);
       }

        System.out.println("Средний вес: " + (first+second+third)/3);
       if (first<second&&first<third){
           System.out.println("Наименьший вес: " + first);
       } else if (second<first&&second<third){
           System.out.println("Наименьший вес: " + second);
       } else if (third<first&&third<second){
           System.out.println("Наименьший вес: " + third);
       }

    }
}
