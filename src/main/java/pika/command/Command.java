package pika.command;

import java.io.IOException;

import pika.exception.PikaException;
import pika.ui.Storage;
import pika.ui.TaskList;
import pika.ui.Ui;

/**
 * Base Command Class for the other Command classes
 */
public class Command {
    private final boolean isRunning;

    /**
     * Constructor for the command class
     *
     * @param isRunning boolean to indicate if the bot still runs after this function
     */
    public Command(boolean isRunning) {
        this.isRunning = isRunning;
    }

    /**
     * Checks if the bot still runs after this command
     */
    public boolean isRunning() {
        return this.isRunning;
    }

    /**
     * Executes the command
     *
     * @param taskList The current list of tasks
     * @param ui       The current Ui
     * @param storage  The current storage class to handle the txt file
     * @throws IOException   if the filepath has any issues
     * @throws PikaException to handle any other input/format error
     */
    public String execute(TaskList taskList, Ui ui, Storage storage) throws IOException, PikaException {
        return "";
    }
}
