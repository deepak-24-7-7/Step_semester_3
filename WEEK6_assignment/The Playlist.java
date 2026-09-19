import java.util.Arrays;

class Playlist {
    private String[] songs;
    private int count = 0;

    Playlist(int size) {
        songs = new String[size];
    }

    void addSong(String song) {
        if (count < songs.length)
            songs[count++] = song;
    }

    String[] getSongs() {
        return Arrays.copyOf(songs, count);
    }

    int getSongCount() {
        return count;
    }
}
