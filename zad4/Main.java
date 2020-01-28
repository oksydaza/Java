import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String args[]) throws Exception {
		// printFilesSimple("C:\\");
//		printFilesDetails("C:\\");
		printFiles("C:\\", ".sys");
		//printTree("C:\\");
	}
 
	public static void printFilesSimple(String path) {
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
			System.out.println(file.getName());
		}
	}
	

	public static void printFilesDetails(String path) throws Exception {
		File folder = new File(path);

//		File file = new File("c:\\hiberfil.sys");
//		BasicFileAttributes attrs;
//		attrs = Files.readAttributes(file, BasicFileAttributes.class);
//		BasicFileAttributes attr;
//		System.out.print(attr.size());


		 File[] listOfFiles = folder.listFiles();

		 for (File file : listOfFiles) {
		 	// System.out.print(file.getName());
		 	Path file_path = Paths.get(file.getPath());
             BasicFileAttributes attrs = Files.readAttributes(file_path, BasicFileAttributes.class);
             DateFormat df = new SimpleDateFormat("yyyy/MM/dd mm:ss");
			if (attrs.isDirectory()) {
				System.out.printf("%-30.30s  %-30.30s %-30.30s%n", 	file.getName(), "\t\tDIR", df.format(attrs.creationTime().toMillis())); }
			else {
				System.out.printf("%-30.30s  %-30.30s %-30.30s%n", 	file.getName(),"\t\t" + attrs.size(), df.format(attrs.creationTime().toMillis()));
			}	
            }
        
		}
		
	
	
	public static void printFiles(String path, String extensionFilter) {
		FilenameFilter filter = new FilenameFilter() {
	        public boolean accept(File directory, String fileName) {
	            return fileName.endsWith(extensionFilter);
	        }
		};
		File folder = new File(path);
		File[] listOfFiles = folder.listFiles(filter);

		for (File file : listOfFiles) {
			System.out.println(file.getName());
		}
	}

	public static void printTree(String path) {
		// to be implemented
		// Example
		// dirname
		// dirname/file1
		// dirname/file2
		// dirname/dirname1
		// dirname/dirname1/file1
		// dirname/dirname1/file2
		// dirname/dirname2/file1
	}

}
