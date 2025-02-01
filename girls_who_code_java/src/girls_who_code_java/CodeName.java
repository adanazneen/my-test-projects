package girls_who_code_java;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;//required for ArrayList generics
import java.util.Arrays;//required to parse split from array into List
import java.util.List;//required for List generics
import java.io.IOException;//required for I/O from file
import java.nio.file.Files;//required for I/O from file (new in Java 8)

public class CodeName {

	public static void main(String[] args) {
//		try {
//			//int x = 1/0;
//			//throw new Exception("Your octopus has fleas");
//			throw new NullPointerException("Sorry, your ability to be human is not humaning.");
//		}
//		catch (NullPointerException Ex){
//			System.out.println("You have triggered a special handler.");
//			System.out.println(Ex.getMessage());
//		}
//		catch (Exception E){
//			System.out.println(E.getMessage());
//		}
		
//		try {
//			openfile();
//		    } catch (FileNotFoundException e) {
//		      System.out.println("An error occurred.");
//		      e.printStackTrace();
//		    }
		File myObj = new File("/Users/anazneen/Documents/hello.txt");
	    if (myObj.exists()) {
	      System.out.println("File name: " + myObj.getName());
	      System.out.println("Absolute path: " + myObj.getAbsolutePath());
	      System.out.println("Writeable: " + myObj.canWrite());
	      System.out.println("Readable " + myObj.canRead());
	      System.out.println("File size in bytes " + myObj.length());
	    } else {
	      System.out.println("The file does not exist.");
	    }
	    
	    try {
			//run();
	    	openfile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void openfile() throws FileNotFoundException
	{
		 File myObj = new File("/Users/anazneen/eclipse-workspace/girls_who_code_java/src/girls_who_code_java/numbers.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      myReader.close();
	}

		private static void run() throws IOException {
				List<String> lines = Files.readAllLines(new File("/Users/anazneen/Documents/hello.txt").toPath());
				try{
					for(String line:lines){
						System.out.println(line);
					}
				}
				catch (Exception ex) {
					ex.printStackTrace();
				}
		}
	    
}
	

