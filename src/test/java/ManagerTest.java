import org.example.Afishaforfilms.NameOfFilm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    Manager film = new Manager();
    private NameOfFilm film1 = new NameOfFilm("Бладшот");
    private NameOfFilm film2 = new NameOfFilm("Вперёд");
    private NameOfFilm film3 = new NameOfFilm("Белград");
    private NameOfFilm film4 = new NameOfFilm("Джентельмены");
    private NameOfFilm film5 = new NameOfFilm("Человек-невидимка");
    private NameOfFilm film6 = new NameOfFilm("Тролли");

    private NameOfFilm film7 = new NameOfFilm("Сверхъестественное");

    @Test

    public void shouldAddMovie() {
        film.add(film1);
        film.add(film2);

        NameOfFilm[] expected = {film1, film2};
        NameOfFilm[] actual = film.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldNullMovie() {
        NameOfFilm[] expected = {};
        NameOfFilm[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimit() {
        film.add(film1);
        film.add(film2);
        film.add(film3);
        film.add(film4);
        film.add(film5);
        film.add(film6);


        NameOfFilm[] expected = {film1, film2, film3, film4, film5, film6};
        NameOfFilm[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllOverLimit() {
        film.add(film1);
        film.add(film2);
        film.add(film3);
        film.add(film4);
        film.add(film5);
        film.add(film6);


        NameOfFilm[] expected = {film1, film2, film3, film4, film5, film6};
        NameOfFilm[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimit5() {

        film.add(film1);
        film.add(film2);
        film.add(film3);
        film.add(film4);
        film.add(film5);


        NameOfFilm[] expected = {film1, film2, film3, film4, film5};
        NameOfFilm[] actual = film.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastSThreeMovie() {
        film.add(film1);
        film.add(film2);
        film.add(film3);

        NameOfFilm[] expected = {film3, film2, film1};
        NameOfFilm[] actual = film.findLastFive();

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldLastFiveLimit() {
        film.add(film1);
        film.add(film2);
        film.add(film3);
        film.add(film4);
        film.add(film5);
        film.add(film6);

        NameOfFilm[] expected = {film6, film5, film4, film3, film2};
        NameOfFilm[] actual = film.findLastFive();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLastFiveLimit5() {
        Manager film = new Manager(5);

        film.add(film1);
        film.add(film2);
        film.add(film3);
        film.add(film4);
        film.add(film5);
        film.add(film6);
        film.add(film7);

        NameOfFilm[] expected = {film7, film6, film5, film4, film3};
        NameOfFilm[] actual = film.findLastFive();

        Assertions.assertArrayEquals(expected, actual);

    }
}
