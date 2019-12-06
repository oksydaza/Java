public class LoginGenerator {

    public static String[] toLowerCase(String[] studentNames){
        String[] studentNamesLowerCase = new String[studentNames.length];

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
        }
        return names_and_surnames;
    }    

    public static String[] trimString(String[] studentNames){
        String[] trimmed_students_names = new String[studentNames.length];

        for(int i = 0, j = 0; i < studentNames.length; i = i + 2, j = j + 2){
            trimmed_students_names[j] = studentNames[i].substring(0, 2);
            trimmed_students_names[j + 1] = studentNames[i + 1].substring(0, 3);
        }

        return trimmed_students_names;
    }

    public static String[] joinStings(String[] studentNames){
        String[] joined_students_names = new String[studentNames.length / 2];

        for(int i = 0, j = 0; i < studentNames.length; i = i + 2, j = j + 1){
            joined_students_names[j] = studentNames[i + 1] + studentNames[i];
        }

        return joined_students_names;
    }
    
    public static String[] appendDomain(String[] studentNames){
        String[] append_students_names = new String[studentNames.length];

        for(int i = 0; i < studentNames.length; i = i + 1){
            append_students_names[i] = studentNames[i] +"@student.agh.edu.pl";
        }
        return append_students_names;
    }
    public static void main(String[] args) {

        String[] studentNames = { "Budynek Piotr", 
                                  "Chalupa Krystyna", 
                                  "Wiezowiec Jan",
                                  "Szkieletor Andrzej",
                                  "Domek Marianna" };
    
    
    String[] lowerCaseStudentNames = toLowerCase(studentNames);
    String[] splitedStudentNames = split(lowerCaseStudentNames);
    String[] trimmed_students_names = trimString(splitedStudentNames);
    String[] joined_students_names = joinStings(trimmed_students_names);
    String[] append_students_names = appendDomain(joined_students_names);

    for (String name_item : append_students_names){
        System.out.println(name_item);
    }
    }
}


