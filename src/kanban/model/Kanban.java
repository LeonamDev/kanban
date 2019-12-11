package kanban.model;

import java.util.HashSet;
import java.util.Set;

import kanban.enums.KanbanState;

/**
 * @author leonam
 *
 */
public class Kanban {
	
	private String name;
	private KanbanState state;
	Set<User> users = new HashSet<User>();
	Set<Task> tasks = new HashSet<Task>();
	

	/**
	 * @param name
	 * @param state
	 * @param users
	 * @param tasks
	 */
	public Kanban(String name, KanbanState state, Set<User> users, Set<Task> tasks) {
		super();
		this.name = name.trim();
		this.state = state;
		this.users = users;
		this.tasks = tasks;
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
		this.name = name.trim();
	}

	/**
	 * @return the state
	 */
	public KanbanState getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(KanbanState state) {
		this.state = state;
	}

	/**
	 * @return the users
	 */
	public Set<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(Set<User> users) {
		this.users = users;
	}

	/**
	 * @return the tasks
	 */
	public Set<Task> getTasks() {
		return tasks;
	}

	/**
	 * @param tasks the tasks to set
	 */
	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}

}
