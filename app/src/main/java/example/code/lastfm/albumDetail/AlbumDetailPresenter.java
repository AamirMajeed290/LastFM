package example.code.lastfm.albumDetail;

import android.support.annotation.NonNull;

import example.code.lastfm.model.Album;

public class AlbumDetailPresenter implements AlbumDetailContract.Presenter {

    private AlbumDetailContract.View view;

    public AlbumDetailPresenter(@NonNull AlbumDetailContract.View view) {
        this.view = view;
        view.setPresenter(this);
    }

    @Override
    public void start() {

    }

}
