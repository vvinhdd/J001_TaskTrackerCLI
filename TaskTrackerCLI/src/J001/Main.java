package J001;

import java.util.ArrayList;
import java.util.Scanner;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Date;

public class Main {
	
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<Tasks> T = new ArrayList<Tasks>();
	
	public static void AddTask() {
		System.out.print("Add task: ");
        String task = scanner.nextLine();
        Tasks newTask = new Tasks("001",task,0);
        T.add(newTask);
        System.out.println("----------");
	}
	
	public static void SeeAllTask() {
		System.out.println("----------");
        System.out.println("Number of tasks: " + T.size());
        System.out.println("----------");
        if(!T.isEmpty()) {
        	for(int i=0; i<T.size(); i++) {
        		System.out.println("Task-"+ i + ": " + T.get(i).toString());
        	}
        }else {
        	System.out.println("No task assgin.");
        }
        System.out.println("----------");
	}
	
	public static void main(String[] args) {
		System.out.println("Hello there");
		System.out.println("Welcome to the Task Tracker");
		System.out.println("----------");
		
		int stop = 0;
		
		while (stop == 0) {
			System.out.println("Choose an option:");
	        System.out.println("1. Add task.		2. Update task.");
	        System.out.println("3. Delete task.		4. See all task.");
	        System.out.println("5. Exit Program.");
	        System.out.println("----------");
			System.out.print("Your option: ");
			
			int option = scanner.nextInt();
			scanner.nextLine();
				
			switch (option) {
		        case 1:
		        	AddTask();
		            break;
		
		        case 2:
		            System.out.println("Update task.");
		            break;
		
		        case 3:
		            System.out.println("Delete task.");
		            break;
		            
		        case 4:
		        	SeeAllTask();
		            break;
		            
		        case 5:
		        	System.out.println("----------");
		        	System.out.println("---Close Program---");
		            stop = 1; //escape while
		            break;
		
		        default:
		            System.out.println("Invalid option!");
		            break;
		    }
			//break;
		}
		System.out.println("---Goodbye sir---");
		System.out.println("----------");
		scanner.close();
	}
	
}
