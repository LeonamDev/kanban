package kanban.model;
import kanban.enums.TaskState;;

/**
 * @author leonam
 *
 */
public class Task {
	
	private String name;
	private String kanban;
	private TaskState state;
	
	/**
	 * @param name
	 * @param state
	 */
	public Task(String name, String kanban) {
		super();
		this.name = name.trim();
		this.kanban = kanban.trim();
		this.state = TaskState.TO_DO;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the state
	 */
	public TaskState getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(TaskState state) {
		this.state = state;
	}
	

}
