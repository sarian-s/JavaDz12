public class FilmManager {
    private Film[] filmList = new Film[0];
    private int limit;

    public FilmManager() {
        this.limit = 5;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public Film[] findLast() {
        int l = limit;
        if (l > filmList.length) {
            l = filmList.length;
        }
        Film[] tmp = new Film[l];
        for (int i = 0; i < l; i++) {
            tmp[i] = filmList[filmList.length - 1 - i];
        }
        return tmp;
    }

    public void add(Film film) {
        Film[] tmp = new Film[filmList.length + 1];
        for (int i = 0; i < filmList.length; i++) {
            tmp[i] = filmList[i];
        }
        tmp[tmp.length - 1] = film;
        filmList = tmp;
    }

    public Film[] findAll() {
        return filmList;
    }
}
