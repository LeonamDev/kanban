package kanban.model;

import kanban.util.CPFValidator;

/**
 * @author leonam
 *
 */
public class User {

	private String name;
	private String cpf;
	private String task;
	private boolean cpfCheck;
	/**
	 * @param name
	 * @param cpf
	 */
	

	
	public User(String task, String name, String cpf) {
		
		this.task = task.trim();
		this.name = name.trim();
		
		if (CPFValidator.isCPF(cpf) == true) {
			this.cpf = cpf.trim();
			cpfCheck = true;
		} else {
			System.err.println("Error, Invalid CPF!");
			cpfCheck = false;
		}
		

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
	 * @return the cpfCheck
	 */
	public boolean getcpfCheck() {
		return cpfCheck;
	}

	/**
	 * @return the task
	 */
	private String getTask() {
		return task;
	}

	/**
	 * @param task the task to set
	 */
	private void setTask(String task) {
		this.task = task;
	}

	/**
	 * @param cpf the cpf to set
	 */
	private void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	

}
