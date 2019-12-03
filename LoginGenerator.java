public class LoginGenerator {

    // change that function to return new array with lower case names
    public static String[] toLowerCase(String[] studentNames){
        String[] studentNamesLowerCase = new String[studentNames.length];
        for (String full_name : studentNames){
            // System.out.println(full_name.toLowerCase());
        }
        for (int i = 0; i < studentNames.length; i++){
            studentNamesLowerCase[i] = studentNames[i].toLowerCase();
        }
        return studentNamesLowerCase;
    }

    public static String[] split(String[] studentNames){
        String[] names_and_surnames = new String[2 * studentNames.length];

        for(int i = 0, j = 0; i < studentNames.length; i = i + 1, j = j + 2){
            names_and_surnames[j] = studentNames[i].split(" ")[0];
            names_and_surnames[j + 1] = studentNames[i].split(" ")[1];
            // names_and_surnames[i] = studentNames[i].split(" ")[1];
        }
        return names_and_surnames;
    
    }
    public static void main(String[] args) {

        String[] studentNames = { "Budynek Piotr", 
                                  "Chalupa Krystyna", 
                                  "Wiezowiec Jan",
                                  "Szkieletor Andrzej",
                                  "Domek Marianna" };
    
    
    String[] lowerCaseStudentNames = toLowerCase(studentNames);
    String[] splitedStudentNames = split(lowerCaseStudentNames);

    for (String name_item : splitedStudentNames){
        System.out.println(name_item);
    }

    
    // System.out.println(studentNames);
    }
}


