package JavaStudyDate.day17.music;

import java.io.Serializable;
import java.util.List;

public class Artist implements Serializable {
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

}
