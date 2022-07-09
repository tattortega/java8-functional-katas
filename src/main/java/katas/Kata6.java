package katas;

import model.BoxArt;
import model.Movie;
import util.DataUtil;

import java.util.Collection;
import java.util.List;

/*
    Goal: Retrieve the url of the largest boxart using map() and reduce()
    DataSource: DataUtil.getMovieLists()
    Output: String
*/
public class Kata6 {
    public static String execute() {
        List<Movie> movies = DataUtil.getMovies();

        return movies.stream()
                .map(Movie::getBoxarts)
                .flatMap(Collection::stream)
                .reduce((box1, box2) -> box1.getWidth() > box2.getWidth() ? box1 : box2)
                .map(BoxArt::getUrl)
                .get();
    }
}
