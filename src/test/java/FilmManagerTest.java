import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    Film film1 = new Film("дом в деревне");
    Film film2 = new Film("дом в деревне 2");
    Film film3 = new Film("дом в деревне 3");
    Film film4 = new Film("дом в деревне 4");
    Film film5 = new Film("дом в деревне 5");
    Film film6 = new Film("дом в деревне 6");
    Film film7 = new Film("дом в деревне 7");

    @Test
    public void test () {
        FilmManager manager = new FilmManager();
        manager.add(film1);
        manager.add(film2);
        Film[] expected = {film1, film2};
        Film[] actual = manager.findAll();
        Assertions.assertArrayEquals(new Film[]{film1, film2}, actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
     public void test1 (){
        FilmManager manager = new FilmManager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        Film[] expected = {film7, film6, film5, film4, film3};
        Film[] actual =manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void test2 (){
        FilmManager manager = new FilmManager();
        manager.add(film1);
        manager.add(film2);

        Film[] expected = {film2, film1};
        Film[] actual =manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void test3 (){
        FilmManager manager = new FilmManager(3);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        Film[] expected = {film7, film6, film5};
        Film[] actual =manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

}
