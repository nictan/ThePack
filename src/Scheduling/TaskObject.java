package Scheduling;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

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
	private String TaskCategory;
	private Date StartDateTime;
	private Date EndDateTime;
	private Boolean HasStarted = false;
	
	
	/**
	 * 
	 */
	public TaskObject() {
		// Default Initializer
		setTaskName("");
		setPriority(0);
		setTaskID(0);
		setHasStarted(false);;
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

	// ***** Get / Set for Task Category
	public String getTaskCategory() {
		return TaskCategory;
	}

	public void setTaskCategory(String taskCategory) {
		TaskCategory = taskCategory;
	}
	// *****

	// ***** Get / Set for Task Category
	public Date getStartDateTime() {
		return StartDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		StartDateTime = startDateTime;
		
		//if (StartDateTime.before(LocalDateTime.now()))
		{
			setHasStarted(true);
		}
	}
	// *****

	// ***** Get / Set for End Date Time
	public Date getEndDateTime() {
		return EndDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		EndDateTime = endDateTime;
	}
	// *****

	// ***** Get / Set for Started Flag
	private void setHasStarted(boolean started) {
		HasStarted = started;
	}
	
	private Boolean getHasStarted() {
		return HasStarted;
	}
	// *****
}
