package J001;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Main {
	
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<Tasks> T = new ArrayList<Tasks>();
	
	public static void AddTask() {
		//Input Task description
		System.out.print("Add task: ");
        String task = scanner.nextLine();
        
        Tasks newTask = new Tasks( T.size(), task, 0);
        T.add(newTask);
        System.out.println("----------");
	}
	
	public static void DeleteTask(int deleteID) {
		try {
			T.remove(deleteID);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Can Delete Task: taskID do not exist.");
		}
		updateIDinArray();
	}
	
	public static void UpdateTask(int taskID, String taskDescription) {
		try {
			T.get(taskID).setTaskDescription(taskDescription);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Can Update Task: taskID do not exist");
		}
	}
	
	public static void UpdateTaskStatus(int taskID, int taskStatus) {
		try {
			T.get(taskID).setTaskStatus(taskStatus);
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Can Update Task: taskID do not exist");
		}
	}
	
	public static void updateIDinArray() { //Idea: Use Stack or Queue we can remove this part
		for(int i=0; i<T.size(); i++) {
			T.get(i).setTaskID(i);
		}
	}
	
	
	public static void main(String[] args) {
		
		AddTask();
		AddTask();
		AddTask();
		AddTask();
		for(int i=0; i<T.size();i++) {
			System.out.println("Tasks: " + T.get(i).toString());
		}
		System.out.println("-------------");
		DeleteTask(5);
		UpdateTask(5, "Hello world");
		//System.out.println("Delete in ID: 5");
		System.out.println("-------------");
		for(int i=0; i<T.size();i++) {
			System.out.println("Tasks: " + T.get(i).toString());
		}
		
		scanner.close();
	}
	
}
