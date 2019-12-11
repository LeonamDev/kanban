package kanban.domain;

public enum Commands {
	
	KANBAN_COMMAND_NOT_EXIST,
	KANBAN_HELP, 
	KANBAN_CREATE,
	KANBAN_EXCLUDE,
	KANBAN_LIST,
	KANBAN_TASK_CREATE,
	KANBAN_TASK_EDIT,
	KANBAN_TASK_EXCLUDE,
	KANBAN_USER_CREATE,
	KANBAN_USER_EDIT,
	KANBAN_USER_LIST;
	
	
	public static Commands select(String[] args) {
        if (args == null || args.length == 0) {
            return KANBAN_COMMAND_NOT_EXIST;
        }
        if (args[0].equals("--help")) {
            return KANBAN_HELP;
        }
        
        if (args[0].equals("--adm") && args[1].equals("--kanban-create")) {
            return KANBAN_CREATE;
        }
        if (args[0].equals("--adm") && args[1].equals("--kanban-exclude")) {
            return KANBAN_EXCLUDE;
        }
        if (args[0].equals("--adm") && args[1].equals("--kanban-list")) {
            return KANBAN_LIST;
        }
        
        if (args[0].equals("--kanban") && args[2].equals("--user-create") && args[4].equals("--cpf")) {
            return KANBAN_USER_CREATE;
        }
        if (args[0].equals("--kanban") && args[2].equals("--user-change") && args[4].equals("--cpf")) {
            return KANBAN_USER_EDIT;
        }
        if (args[0].equals("--kanban") && args[2].equals("--user-list") && args[3].equals("--cpf"))  {
            return KANBAN_USER_LIST;
        }
        
        if (args[0].equals("--kanban") && args[2].equals("--task-create") && args[4].equals("--cpf")) {
            return KANBAN_TASK_CREATE;
        }
        if (args[0].equals("--kanban") && args[2].equals("--task-change") && args[4].equals("--cpf")) {
            return KANBAN_TASK_EDIT;
        }
      
        return KANBAN_COMMAND_NOT_EXIST;
    }

}
