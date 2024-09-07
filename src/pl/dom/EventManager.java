package pl.dom;

import java.util.ArrayList;
import java.util.List;

public class EventManager {

	private List<EventListener> listOfSubs = new ArrayList<>();
	
	public void subscribe(EventListener event) {
		listOfSubs.add(event);
	}
	
	public void unsubscribe(EventListener event) {
		listOfSubs.remove(event);
	}
	
	public void notify(String data) {
		listOfSubs.forEach(listener -> listener.update(data));
	}
	
}
