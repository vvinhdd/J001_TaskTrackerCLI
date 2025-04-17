package J001;

import java.util.Scanner;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		//JsonUtils dataWork = new JsonUtils;
		JsonUtils.dataCheck();
		//firstLoad();
		
		
//		try( FileWriter file = new FileWriter("output.json", true) ){// true = append mode
//			//file.write(json+"\n");
//			//file.write(json2);
//			System.out.println("Đã ghi file Json thành công");
//		} catch (IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
		
		
		scanner.close();
	}
	
}
