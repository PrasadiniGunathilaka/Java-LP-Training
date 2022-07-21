package mementoDesignPattern;

public class Application {
	
	public static void main(String args[]) {
		
		PlayListHistory playListHistory = new PlayListHistory();
		PlayList playList = new PlayList();
		
		playList.addVideo(new Video("Harry potter"));
		playList.addVideo(new Video("moana"));
		
		playListHistory.save(playList);
		System.out.println(playList);
		
		
		playList.addVideo(new Video("Shrek"));
		playListHistory.save(playList);
		System.out.println(playList);
		
		playList.addVideo(new Video("Beauty and the beast"));
		playListHistory.save(playList);
		System.out.println(playList);
	
	
	}
}