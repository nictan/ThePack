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

	private String TaskName = "";
	private int TaskID = -1;
	private int Priority = -1;
	private String TaskCategory = "";
	private Date StartDateTime;
	private Date EndDateTime;
	private Boolean HasStarted = false;
	
	/**
	 * 
	 */
	public TaskObject() {
		// Default Initializer
		StartDateTime = CommonObject.DefaultDateSetting();
		EndDateTime = CommonObject.DefaultDateSetting();
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

	public Boolean setStartDateTime(Date startDateTime) {
		if (startDateTime.after(getEndDateTime()))
		{
			return false;
		}
		
		if (startDateTime.before(CommonObject.TodayDate()))
		{
			setHasStarted(true);
		}

		StartDateTime = startDateTime;
		return true;
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
