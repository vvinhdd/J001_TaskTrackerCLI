package J001;

public class Tasks {
	
	private String taskID;
	private String taskDescription;
	private int taskStatus; // 0-in progress, 1-not done, 2-done
	private String taskName;
	private int createdAt; //can xu ly loai datetime
	private int updateAt; //can xu ly loai datetime
	
	
	
	public Tasks() {
		
	}
	
	public Tasks(String taskID, String taskName, int taskStatus) {
		this.taskID = taskID;
		this.taskName = taskName;
		this.taskStatus = taskStatus;
	}


}
