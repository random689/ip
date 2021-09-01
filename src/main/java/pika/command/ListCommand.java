package pika.command;

import pika.ui.Storage;
import pika.ui.TaskList;
import pika.ui.Ui;

public class ListCommand extends Command { //ListCommand to handle the showing of list

    /**
     * Constructor for the ListCommand Class
     */
    public ListCommand() {
        super(true);
    }

    /**
     * Executes the ListCommand to print the list to the user via the Ui
     *
     * @param taskList The current list of tasks
     * @param ui       The current Ui
     * @param storage  The current storage class to handle the txt file
     */
    @Override
    public String execute(TaskList taskList, Ui ui, Storage storage) {
        return Ui.printList(taskList);
    }
}