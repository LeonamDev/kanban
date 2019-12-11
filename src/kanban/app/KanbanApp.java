package kanban.app;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import kanban.model.Kanban;
import kanban.model.Task;

/**
 * @author leonam
 *
 */
public class KanbanApp {

	private static List<String> logger = new ArrayList<>();
	private static Set<Kanban> kanbans = new HashSet<Kanban>();
	private static Set<Task> tasks = new HashSet<Task>();

	public static void main(String[] args) {

		int choice = 0;
		Scanner scan = new Scanner(System.in);

		do {

			System.out.println("Command Options: ");
			System.out.println("1: Create Kanban");
			System.out.println("2: Create Task");
			System.out.println("3: Create User");
			System.out.println("4: List Kanbans");
			System.out.println("5: Show Log");
			System.out.println("0: Quit");

			choice = Integer.parseInt(scan.nextLine());

			switch (choice) {
			case 1:
				System.out.println("Please, input the new kanban name:");
				String kanbanName;
				kanbanName = scan.nextLine();
				Kanban kanban = new Kanban(kanbanName);
				kanbans.add(kanban);

				logger.add(LocalDate.now()+ "," + LocalTime.now()+ "," +kanbanName+ "," 
						+kanban.getState() + "," + "admin" + "," + "15612354512" );

				break;
			case 2:
				System.out.println("Please, input the kanban and the new task name:");
				String kanbanTask = scan.nextLine();
				String[] taskName = kanbanTask.split(" ");
				Task task = new Task(taskName[0], taskName[1]);
				tasks.add(task);

				logger.add(LocalDate.now()+ "," + LocalTime.now()+ "," +taskName[0]+ "," +taskName[1]+"," 
						+task.getState() + "," + "admin" + "," + "15612354512" );
				break;
			case 3:

				break;
			case 4:
				System.out.println("Showing kanbans:");
				kanbans.forEach(x -> { System.out.println(x.toString());});
				break;
			case 5:
				logger.forEach(System.out::println);
				break;
			}
			System.out.println("");
		} while (choice != 0);

	}

}
