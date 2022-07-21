package mementoDesignPattern;

import java.util.ArrayList;

// originator
public class PlayList {
	
	ArrayList<Video> videos = new ArrayList<>();
	
	public void addVideo(Video video) {
		videos.add(video);
	}
	
	
	public ArrayList<Video> getVideos() {
		return (ArrayList<Video>) videos.clone();
	}

	public PlayListMemento save() {
		
		return new PlayListMemento(getVideos());
	}
	
	public void undo(PlayListMemento playListMemento) {
		videos = playListMemento.getVideos();
	}
	
	
	@Override
	public String toString() {
		return "PlayList {" +
				"videos=" + videos +
				'}';
	}



	static class PlayListMemento{
		
		ArrayList<Video> videos;
		
		public  PlayListMemento(ArrayList<Video> videos) {
			this.videos = videos;
		}
		
		private ArrayList<Video> getVideos(){
			return videos;
		}
	}
	

}
