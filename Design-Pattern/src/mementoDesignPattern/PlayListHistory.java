package mementoDesignPattern;

import java.util.Stack;

public class PlayListHistory {
	
	Stack<PlayList.PlayListMemento> history = new Stack<>();
	
	public void save(PlayList playList) {
		history.push(playList.save());
	}
	
	public void undo(PlayList playList) {
		if(!history.isEmpty()) 
			playList.undo(history.pop());
		else {
			System.out.println("Con not undo");
		}
	}

}
