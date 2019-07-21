import java.util.ArrayList;
import java.util.List;

public class Shuttle {

	// holds the list of terminals
	private List<Terminal> terminals = new ArrayList<Terminal>();
	private String state;

	/**
	 * Returns the state of the shuttle at a given time
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the state of the shuttle at a given time
	 */
	public void setState(String state) {
		this.state = state;
		notifyAllTerminals();
	}

	/**
	 * Adds a terminal to the list of observers
	 */
	public void attach(Terminal terminal) {
		terminals.add(terminal);
	}

	/**
	 * Sends a status update to every listener
	 */
	public void notifyAllTerminals() {
		for (Terminal terminal : terminals) {
			terminal.update();
		}
	}

}
