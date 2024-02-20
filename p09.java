package p0220;

interface Command{ 
	void execute();
}

class CommandProcess{
	public void Process(Command command) {
		command.execute();
	}
}

public class p09 {
	public static void main(String[] args) {
		CommandProcess cp = new CommandProcess();
		cp.Process(new Command() {
								public void execute() {
									System.out.println("인터페잇흐 excute실행");}
			}
		);
		cp.Process(new Command() {public void execute() { System.out.println("야호 집간다.");}});
		}
}
