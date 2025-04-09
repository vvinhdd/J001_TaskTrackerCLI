package J001;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tasks {
	
	private static DateFormat df = new SimpleDateFormat("MMM/dd/yyyy hh:mm a");
	private static Date date = new Date();
	
	private int taskID;
	private String taskDescription;
	private int taskStatus; // 0-not done, 1-in progress, 2-done
	private String createdAt; //can xu ly loai datetime
	private String updateAt; //can xu ly loai datetime
	
	public Tasks() {
		
	}
	
	public Tasks(int taskID, String taskDescription, int taskStatus) {
		this.taskID = taskID;
		this.taskDescription = taskDescription;
		this.taskStatus = taskStatus;
		this.createdAt = df.format(date); // create date
	}
	
	@Override
	public String toString() {
		return "Tasks [taskID=" + taskID + ", taskDescription=" + taskDescription + ", taskStatus=" + taskStatus
				+ ", createdAt=" + createdAt + ", updateAt=" + updateAt + "]";
	}

	public int getTaskID() {
		return taskID;
	}

	public void setTaskID(int taskID) {
		this.taskID = taskID;
	}
	
	public String getTaskDescription() {
		return taskDescription;
	}
	
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
		this.updateAt = df.format(date);
	}
	
	public int getTaskStatus() {
		return taskStatus;
	}
	
	public void setTaskStatus(int taskStatus) {
		this.taskStatus = taskStatus;
		this.updateAt = df.format(date);
	}
}
