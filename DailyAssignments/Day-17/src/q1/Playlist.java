package q1;

import java.util.*;

public class Playlist {
	public List<Song> songs=new ArrayList<>();
	public void addSong(Song song) {
		boolean present=false;
		for(Song s: songs) {
			if(s.equals(song)) {
				present=true;
				System.out.println("Song is already added in the playlist");
			}
		}
		if(!present) {
			System.out.println("Song added to the playlist successfully");
			songs.add(song);
		}
	} 
	
}
