package J001;

public class Tasks {
	
	private String taskID;
	private String taskDescription;
	private int taskStatus; // 0-in progress, 1-not done, 2-done
	private int createdAt; //can xu ly loai datetime
	private int updateAt; //can xu ly loai datetime
	
	
	
	public Tasks() {
		
	}
	
	public Tasks(String taskID, String taskDescription, int taskStatus) {
		this.taskID = taskID;
		this.taskDescription = taskDescription;
		this.taskStatus = taskStatus;
		
		
	}

	@Override
	public String toString() {
		return "Tasks [taskID=" + taskID + ", taskDescription=" + taskDescription + ", taskStatus=" + taskStatus
				+ ", createdAt=" + createdAt + ", updateAt=" + updateAt + "]";
	}
	
}
