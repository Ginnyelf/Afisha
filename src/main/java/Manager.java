import org.example.Afishaforfilms.NameOfFilm;

public class Manager {
    private int countNameOfFilms = 5;
    private NameOfFilm[] films = new NameOfFilm[0];

    public Manager(int countNameOfFilms) {
        this.countNameOfFilms = countNameOfFilms;
    }

    public Manager() {
    }

    public void add(NameOfFilm film) {
        int length = films.length + 1;
        NameOfFilm[] tmp = new NameOfFilm[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public NameOfFilm[] findLastFive() {

        int resultLength = films.length;
        if (resultLength >= countNameOfFilms) {
            resultLength = countNameOfFilms;
        } else {
            resultLength = films.length;
        }
        NameOfFilm[] result = new NameOfFilm[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public NameOfFilm[] findAll() {
        return films;
    }
}