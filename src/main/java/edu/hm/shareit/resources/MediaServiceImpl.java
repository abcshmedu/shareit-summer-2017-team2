package edu.hm.shareit.resources;

/**
 * Created by MatHe on 26.04.2017.
 */
public class MediaServiceImpl implements MediaService {
    @Override
    public MediaServiceResult addBook(Book book) {
        return null;
    }

    @Override
    public MediaServiceResult addDisk(Disc disc) {
        return null;
    }

    @Override
    public Medium[] getBooks() {
        return new Medium[0];
    }

    @Override
    public Medium[] getDiscs() {
        return new Medium[0];
    }

    @Override
    public MediaServiceResult updateBook(Book book) {
        return null;
    }

    @Override
    public MediaServiceResult updateDisc(Disc disc) {
        return null;
    }
}
