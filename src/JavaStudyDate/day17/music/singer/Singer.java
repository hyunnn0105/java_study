package JavaStudyDate.day17.music.singer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Singer {
    private String singer;
    private List<String> musicTitle;

    public Singer(){}

    // musictitle - 저장!!
    public Singer(String singer, List<String> musicTitle) {
        this.singer = singer;
        this.musicTitle = musicTitle;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public List<String> getMusicTitle() {
        return musicTitle;
    }

    public void setMusicTitle(List<String> musicTitle) {
        this.musicTitle = musicTitle;
    }

    /*
        private String name; // 가수명
        private List<String> songs; // 노래목록

        public Artist(String name, List<String> songs) {
            this.name = name;
            this.songs = songs;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<String> getSongs() {
            return songs;
        }

        public void setSongs(List<String> songs) {
            this.songs = songs;
        }

     */

}
