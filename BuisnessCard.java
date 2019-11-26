import java.util.Scanner;
import java.lang.Math;

public class BuisnessCard {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name = "*"+"Magdalena";
        String surname = "Wlazloooooooooo000000000";
        int tel = 123456789;
        String city = "Krakow";

        // System.out.println("Proszę podaj imię");
        // String name = "*" + scanner.next();
        // System.out.println("Proszę podaj nazwisko");
        // String surname = scanner.next();
        // System.out.println("Proszę podaj numer telefonu");
        // int tel = scanner.nextInt();
        // System.out.println("Proszę podaj miasto");
        // String city = scanner.next();

        String firstLine = name + " " + surname;
        String secondLine = "*" + "tel: " + tel + " adres:" + city;
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
        String finalFirstLine = firstLineBuilder.toString();
        String finalSecondLine = secondLineBuilder.toString();
        // =================================
        // print upper stars
        for (int i = 0; i < secondLine.length() + 1; i++){
            System.out.print("*");
            }
        System.out.print("\n");
        System.out.println(finalFirstLine + "*");
        System.out.println(finalSecondLine + "*");
        // System.out.println(bottomLine);

        //print lower stars
        for (int i = 0; i < secondLine.length() + 1; i++){
            System.out.print("*");
            }
        System.out.println("\n");
    }
}    