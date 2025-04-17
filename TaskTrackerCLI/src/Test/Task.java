package Test;

public class Task {
    public int taskID;
    public String taskDescription;
    public int taskStatus;
    public String createdAt;
    public String updateAt;

    public Task(int taskID, String taskDescription, int taskStatus, String createdAt, String updateAt) {
        this.taskID = taskID;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskID=" + taskID +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskStatus=" + taskStatus +
                ", createdAt='" + createdAt + '\'' +
                ", updateAt='" + updateAt + '\'' +
                '}';
    }
}

