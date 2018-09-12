package example.code.lastfm.albumDetail;

import example.code.lastfm.BasePresenter;
import example.code.lastfm.BaseView;
import example.code.lastfm.model.Album;

public interface AlbumDetailContract {

    interface Presenter extends BasePresenter {
    }

    interface View extends BaseView<Presenter> {
        void setAlbum(String image, String name, String artist);
    }
}
