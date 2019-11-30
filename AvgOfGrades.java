import java.util.Scanner;

public class AvgOfGrades {

    public static double average(int[] marks) {
        int sum = 0;
        for(int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum/(double)marks.length;
    }

    public static void max(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max)
            max = numbers[i];
        } 
        System.out.println("Najwysza ocena to: " + max);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Prosze podaj calkowita liczbe ocen");
        int numberOfGrades = scanner.nextInt();

        int[] grades = new int[numberOfGrades];

        for (int i = 0; i < numberOfGrades; i++ ) {
            System.out.println("Podaj ocene...");
            grades[i]= scanner.nextInt();
        } 
        scanner.close();

        System.out.println("\nOceny:");
        for(int i = 0; i < numberOfGrades; i++) {
            System.out.println(grades[i]);
        }
        
        double countedAvg = average(grades);
        System.out.println("Srednia ocen wynosi: " + countedAvg); 
        max(grades);
        }

}





