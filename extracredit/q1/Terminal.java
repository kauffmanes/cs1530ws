import java.util.*;

public abstract class Terminal {
	protected Shuttle shuttle;
	public abstract void update();
}

class Terminal1 extends Terminal {
	public Terminal1(Shuttle shuttle) {
		this.shuttle = shuttle;
		this.shuttle.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Terminal 1: " + shuttle.getState());
	}
}

class Terminal2 extends Terminal {
	public Terminal2(Shuttle shuttle) {
		this.shuttle = shuttle;
		this.shuttle.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Terminal 2: " + shuttle.getState());
	}
}

class Terminal3 extends Terminal {
	public Terminal3(Shuttle shuttle) {
		this.shuttle = shuttle;
		this.shuttle.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Terminal 3: " + shuttle.getState());
	}
}

class Terminal4 extends Terminal {
	public Terminal4(Shuttle shuttle) {
		this.shuttle = shuttle;
		this.shuttle.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Terminal 4: " + shuttle.getState());
	}
}