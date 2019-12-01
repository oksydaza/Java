public class LoginGenerator {

    // change that function to return new array with lower case names
    public static String[] toLowerCase(String[] studentNames){
        String[] studentNamesLowerCase = new String[studentNames.length];
        for (String full_name : studentNames){
            System.out.println(full_name.toLowerCase());
        }
        for (int i = 0; i < studentNames.length; i++){
            studentNamesLowerCase[i] = studentNames[i].toLowerCase
        }
    }

        return studentNamesLowerCase;
    public static void main(String[] args) {

        String[] studentNames = { "Budynek Piotr", 
                                  "Chalupa Krystyna", 
                                  "Wiezowiec Jan",
                                  "Szkieletor Andrzej",
                                  "Domek Marianna" };
    
    System.out.println(studentNames);
    toLowerCase(studentNames);

    }
}



//public String toLowerCase()
//split(String regex, int limit)


