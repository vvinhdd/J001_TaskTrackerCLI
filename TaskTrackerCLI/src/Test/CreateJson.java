package Test;

import java.io.FileWriter;
import java.io.IOException;

public class CreateJson {
	
	public static void main(String[] args) {
		String name = "Alice";
		int age = 25;
		boolean isStudent = true;

		String json = "{\n" +
		              "  \"name\": \"" + name + "\",\n" +
		              "  \"age\": " + age + ",\n" +
		              "  \"isStudent\": " + isStudent + "\n" +
		              "},";
		
		String name2 = "Alice2";
		int age2 = 25;
		boolean isStudent2 = true;
		
		String json2 = "{\n" +
	              "  \"name\": \"" + name2 + "\",\n" +
	              "  \"age\": " + age2 + ",\n" +
	              "  \"isStudent\": " + isStudent2 + "\n" +
	              "}";

		try( FileWriter file = new FileWriter("output.json", true) ){// true = append mode
			file.write(json+"\n");
			file.write(json2);
			System.out.println("Đã ghi file Json thành công");
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
