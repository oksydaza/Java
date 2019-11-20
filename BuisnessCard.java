import java.util.Scanner;
import java.lang.Math;

public class BuisnessCard {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // String name = "*"+"Magdalena";
        System.out.println("Proszę podaj imię");
        String name = "*" + scanner.next();
       
        // String surname = "Wlazlo";
        System.out.println("Proszę podaj nazwisko");
        String surname = scanner.next();
        String firstLine = name + " " + surname;
        //int tel = 123456789;
        System.out.println("Proszę podaj numer telefonu");
        int tel = scanner.nextInt();
        //String city = "Krakow ";
        System.out.println("Proszę podaj miasto");
        String city = scanner.next();
        String bottomLine = "*" +tel+" adres:" + city;
        
        for (int i = 0; i < bottomLine.length() + 1; i++){
            System.out.print("*");
            }
        System.out.print("\n");
        
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(firstLine);

        System.out.println(name +" "+surname);
        int numberOfSpaces = Math.abs(bottomLine.length() - firstLine.length());
        
        if(firstLine.length() > bottomLine.length()) {
            for( int i = 0; i < numberOfSpaces; i++ ){
                stringBuilder.append("_");
            }
        }
        String finalString = stringBuilder.toString();

        System.out.print(finalString);
        System.out.println(bottomLine);

        for (int i = 0; i < bottomLine.length(); i++){
            System.out.print("*");
            }
        System.out.println("\n");
        
    }
   // int lineLenght = Math.max(firstLine, secondLine);

}    
