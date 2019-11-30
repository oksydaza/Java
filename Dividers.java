import java.util.Scanner;

public class Dividers{

    public static int readNumber(){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }

    public static Boolean checkDivider(int a, int b){
        if (a % b == 0){
            return true;
        }
        else
            return false;
    }
    public static int[] findDividers(int number){
        int[] result = new int[(number / 2) + 1];
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
        for(int i = 1; i < dividers.length; i++) {
            if (dividers[i] != 0){
                System.out.println(dividers[i]); 
            }

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