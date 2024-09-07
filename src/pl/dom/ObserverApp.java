package pl.dom;

public class ObserverApp {

	public static void main(String[] args) {
		Editor editor = new Editor();
		
		CreateListener createListener = new CreateListener();
		editor.event.subscribe(createListener);
		
		CreateEventListener createEventListener = new CreateEventListener();
		editor.event.subscribe(createEventListener);
		
		editor.createData();
//		editor.createEvent();
		
		System.out.println("poooo");
	}

}
