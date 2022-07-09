package katas;

import model.Movie;
import util.DataUtil;

import java.util.List;

/*
    Goal: Retrieve the largest rating using reduce()
    DataSource: DataUtil.getMovies()
    Output: Double
*/
public class Kata5 {
    public static Double execute() {
        List<Movie> movies = DataUtil.getMovies();

        return movies.stream()
                .reduce((movie1, movie2) -> movie1.getRating() > movie2.getRating() ? movie1 : movie2)
                .map(Movie::getRating)
                .get();
    }
}
