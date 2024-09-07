package pl.dom;

public class Editor {

	public EventManager event = new EventManager();
	private String data = "dataTest";
	
	public void createData() {
		event.notify(data);
	}
	
	public void createEvent() {
		event.notify(data + data);
	}
	
}
