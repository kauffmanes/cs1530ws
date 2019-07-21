public class AirportShuttleDemo {

	public static void main(String[] args) {
		
		// make the one shuttle
		Shuttle shuttle = new Shuttle();

		// make new terminals and give them the shuttle to watch
		new Terminal1(shuttle);
		new Terminal2(shuttle);
		new Terminal3(shuttle);
		new Terminal4(shuttle);

		shuttle.setState("Shuttle moving to terminal 1!");
		shuttle.setState("Shuttle arriving at terminal 1!");
		shuttle.setState("Shuttle stopped at terminal 1!");

		shuttle.setState("Shuttle moving to terminal 2!");
		shuttle.setState("Shuttle arriving at terminal 2!");
		shuttle.setState("Shuttle stopped at terminal 2!");

		shuttle.setState("Shuttle moving to terminal 3!");
		shuttle.setState("Shuttle arriving at terminal 3!");
		shuttle.setState("Shuttle stopped at terminal 3!");
		shuttle.setState("Shuttle broke down at terminal 3!");

		shuttle.setState("Shuttle moving to terminal 4!");
		shuttle.setState("Shuttle arriving at terminal 4!");
		shuttle.setState("Shuttle stopped at terminal 4!");
	}
}