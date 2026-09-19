package main.java.week7.assignment_problems;

import java.util.Arrays;

class Playlist {

    private final String[] songs; // Private array[cite: 7]
    private int songCount;

    public Playlist(int maxSongs) {
        this.songs = new String[maxSongs];
        this.songCount = 0;
    }

    public void addSong(String title) {
        if (songCount < songs.length) {
            songs[songCount] = title;
            songCount++;
        }
    }

    public String[] getSongs() {
        return Arrays.copyOf(songs, songCount); // Returns safe array copy[cite: 7]
    }

    public int getSongCount() {
        return songCount; // Read-only song count[cite: 7]
    }
}

public class PlaylistMain {

    public static void main(String[] args) {
        Playlist p = new Playlist(10);
        p.addSong("Song A");
        p.addSong("Song B");

        String[] copy = p.getSongs();
        copy[0] = "Hacked"; // Does not affect internal playlist[cite: 7]

        System.out.println("p.getSongs()[0] is still \"" + p.getSongs()[0] + "\"");
    }
}
