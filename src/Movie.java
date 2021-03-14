public class Movie {

    public static final int CHILDRENS = 2;

    public static final int REGULAR = 0;

    public static final int NEW_RELEASE = 1;

    private String _title;

    private int _princeCode;


    public Movie(String _title, int _princeCode) {
        this._title = _title;
        this._princeCode = _princeCode;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public int getPrinceCode() {
        return _princeCode;
    }

    public void setPrinceCode(int _princeCode) {
        this._princeCode = _princeCode;
    }
}
