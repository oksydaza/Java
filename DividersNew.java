import java.util.Scanner;

public class DividersNew{

    public static int readNumber(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }

    public static Boolean checkDivider(int a, int b){
        return (a % b == 0);
    }
    public static int[] findDividers(int number){
        int number_of_dividers = 0;
        for(int i = 1; i < number + 1; i++){
            if (checkDivider(number, i)){
                number_of_dividers++;
            }
        }
        int[] result = new int[number_of_dividers];
        int found = 0;
       
        for(int i = 1; i < number + 1; i++){
            if (checkDivider(number, i)){
                result[found] = i;
                found++;
            }
        }
        return result;
    }
    
    public static void printDividers(int[] dividers){
            for(int number : dividers){
                System.out.println(number); 
            } 
            }
            
public static void main(String[] args){
        System.out.println("Podaj liczbe naturalna:");
        int number = readNumber();
        int[] result = findDividers(number);
        System.out.println("Dzielniki to: ");
        printDividers(result);
    }
}
