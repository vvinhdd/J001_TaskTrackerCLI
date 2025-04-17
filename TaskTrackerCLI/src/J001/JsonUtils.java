package J001;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonUtils {
	public static String filePath = "data.json";
	public static File file = new File(filePath);
	
	public static void dataCheck() { //Create file data.json if it not exist. If exist, load data.
		if(!file.exists()) {	
			try {
				boolean created = file.createNewFile();
				if(created) {
					System.out.println("Create Data Successfully: " + filePath);
				}	
			}catch (IOException e) {
				System.out.println("Erorr create file: " + e.getMessage());
			}
		} else { 
			System.out.println("Data findable. Start reading data. ");
			try {
                String content = new String(Files.readAllBytes(Paths.get(filePath)));
                System.out.println("Nội dung file: \n" + content);
            } catch (IOException e) {
                System.out.println("Lỗi khi đọc file: " + e.getMessage());
            }
		}
	}
}
