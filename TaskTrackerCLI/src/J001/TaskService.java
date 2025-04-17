package J001;

import java.util.ArrayList;

public class TaskService {
	
	private static ArrayList<Tasks> T = new ArrayList<Tasks>();
	
	public void add(String Description) {
        Tasks newTask = new Tasks( T.size(), Description, 0);
        T.add(newTask);
        System.out.println("Add Task successfully.");
	}
	
	public void update(int taskID, String taskDescription) {
		try {
			T.get(taskID).setTaskDescription(taskDescription);
			System.out.println("Update Task successfully.");
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Can Update Task: taskID do not exist");
		}
	}
	
	public void delete(int deleteID) {
		try {
			T.remove(deleteID);
			System.out.println("Delete Task successfully.");
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Can Delete Task: taskID do not exist.");
		}
		updateIDinArray();
	}
	
	
	public void updateStatus(int taskID, int taskStatus) {
		try {
			T.get(taskID).setTaskStatus(taskStatus);
			System.out.println("Update Task Status successfully.");
		} catch(IndexOutOfBoundsException e) {
			System.out.println("Can Update Status of Task: taskID do not exist");
		}
	}
	
	public void updateIDinArray() { //Idea: Use Stack or Queue we can remove this part
		for(int i=0; i<T.size(); i++) {
			T.get(i).setTaskID(i);
		}
	}
	
	public void listAllTask() {
		for(int i=0; i<T.size();i++) {
			System.out.println("Tasks: " + T.get(i).toString());
		}
	}
	
	public void listAllTaskWithStatus(int status) {
		switch(status) {
			case 0: // task Not Done
				System.out.println("All task not done:");
				break;
			case 1: // task In progess
				System.out.println("All task in progess:");
				break;
			case 2: // task Done
				System.out.println("All task done:");
				break;
		}
		int numTask = 0;
		for(int i=0; i<T.size();i++) {
			if(T.get(i).getTaskStatus() == status) {
				System.out.println("Tasks: " + T.get(i).toString());
				numTask++;
			}
		}
		System.out.println("Number of tasks: " + numTask);
	}

}
