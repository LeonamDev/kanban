package kanban.model;

import kanban.util.CPFValidator;

/**
 * @author leonam
 *
 */
public class User {

	private String name;
	private String cpf;

	/**
	 * @param name
	 * @param cpf
	 */
	public User(String name, String cpf) {
		super();
		this.name = name.trim();

		if (CPFValidator.isCPF(cpf) == true) {
			this.cpf = cpf;
		} else {
			System.err.println("Error, Invalid CPF!");
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
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

}
