package q1;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner s1= new Scanner(System.in);
	Playlist p= new Playlist();
	System.out.println("Enter song deatils");
	for(int i=1;i<=4;i++) {
		System.out.println("Song"+i);
		System.out.println("Movie name:");
		String movie=s1.next();
		System.out.println("Song name:");
		String song=s1.next();
		p.addSong(new Song(movie,song));
	}
	s1.close();
	for(Song s:p.songs) {
		s.play();
	}
}
}
