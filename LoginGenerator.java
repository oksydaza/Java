public class LoginGenerator {

    // change that function to return new array with lower case names
    public static String[] toLowerCase(String[] studentNames){
        String[] studentNamesLowerCase = new String[studentNames.length];
        for (String full_name : studentNames){
            System.out.println(full_name.toLowerCase());
        }
        for (int i = 0; i < studentNames.length; i++){
            studentNamesLowerCase[i] = studentNames[i].toLowerCase();
        }
        return studentNamesLowerCase;
    }

    public static String[] split(String[] studentNames){
        String[] studentNamesLowerCase = new String[studentNames.length];
        for (e tr){
            studentNamesLowerCase[i] = studentNames[i].split(" ");
        }
        for (String full_name : studentNamesLowerCase){
            System.out.println(full_name.toLowerCase());
        }
        return studentNamesLowerCase;
    }
// acha :) jestem laduje sie nie wiem czy to usmiech?:Dhahaah :*ok
// ale ja juz mam dosc ;) na dziosto sie zbieraj 
    public static void main(String[] args) {

        String[] studentNames = { "Budynek Piotr", 
                                  "Chalupa Krystyna", 
                                  "Wiezowiec Jan",
                                  "Szkieletor Andrzej",
                                  "Domek Marianna" };
    
    
    String[] lowerCaseStudentNames = toLowerCase(studentNames);
    String[] splitedStudentNames = split(lowerCaseStudentNames);

    
    System.out.println(studentNames);
    }
}



//public String toLowerCase()
//split(String regex, int limit)


