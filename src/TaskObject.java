/**
 * 
 */

/**
 * @author Nicholas
 *
 */
public class TaskObject {

	private String TaskName;
	private int TaskID;
	private int Priority;
	
	/**
	 * 
	 */
	public TaskObject() {
		// Default Initializer
		setTaskName("");
		setPriority(0);
		setTaskID(0);
	}

	// ***** Get / Set for Task Name
	public String getTaskName() {
		return TaskName;
	}


	public void setTaskName(String taskName) {
		TaskName = taskName;
	}
	// *****

	// ***** Get / Set for Priority
	public int getPriority() {
		return Priority;
	}

	public void setPriority(int priority) {
		Priority = priority;
	}
	// *****

	// ***** Get / Set for Task ID
	public int getTaskID() {
		return TaskID;
	}

	public void setTaskID(int taskID) {
		TaskID = taskID;
	}
	// *****
}
