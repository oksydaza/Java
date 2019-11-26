import java.util.Scanner;
import java.lang.Math;

public class BuisnessCard {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę podaj imię");
        String name = "*" + scanner.next();
        System.out.println("Proszę podaj nazwisko");
        String surname = scanner.next();
        System.out.println("Proszę podaj numer telefonu");
        int tel = scanner.nextInt();
        System.out.println("Proszę podaj miasto");
        String city = scanner.next();
        scanner.close();

        String firstLine = name + " " + surname;
        String secondLine = "*" + "tel: " + tel + " adres:" + city;
        int maxLineLength = (firstLine.length() > secondLine.length()) ? firstLine.length() : secondLine.length();
        StringBuilder firstLineBuilder = new StringBuilder();
        StringBuilder secondLineBuilder = new StringBuilder();
        firstLineBuilder.append(firstLine);
        secondLineBuilder.append(secondLine);
        int numberOfSpaces = Math.abs(secondLine.length() - firstLine.length());
        
        if(firstLine.length() < secondLine.length()) {
            for( int i = 0; i < numberOfSpaces; i++ ){
                firstLineBuilder.append(" ");
            }
        }
        if(firstLine.length() > secondLine.length()) {
            for( int i = 0; i < numberOfSpaces; i++ ){
                secondLineBuilder.append(" ");
            }
        }
        String finalFirstLine = firstLineBuilder.toString();
        String finalSecondLine = secondLineBuilder.toString();
        
        for (int i = 0; i < maxLineLength + 1; i++){
            System.out.print("*");
            }
        System.out.print("\n");
        System.out.println(finalFirstLine + "*");
        System.out.println(finalSecondLine + "*");

        for (int i = 0; i < maxLineLength + 1; i++){
            System.out.print("*");
        }  
        System.out.println("\n");
    }
}    