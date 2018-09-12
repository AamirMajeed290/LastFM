package example.code.lastfm.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AlbumMatches {

    private List<Album> album = null;

    public List<Album> getAlbum() {
        return album;
    }

    public void setAlbum(List<Album> album) {
        this.album = album;
    }

}
