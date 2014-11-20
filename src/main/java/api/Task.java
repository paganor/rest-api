package api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name="task")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="task_id")
	private int id;
	
	@Column(name="task_name")
	private String taskName;
	
	@Column(name="task_description")
	private String taskDescription;
	
	@Column(name="task_status")
	private int taskStatus;
	
	// getters and setters
	public int getTaskId() {
		return id;
	}
	
	public void setTaskId(int taskId) {
		this.id = taskId;
	}
	
	public String getTaskName() {
		return taskName;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public String getTaskDescription() {
		return taskDescription;
	}
	
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	
	public int getTaskStatus() {
		return taskStatus;
	}
	
	public void setTaskStatus(int taskStatus) {
		this.taskStatus = taskStatus;
	}
}
