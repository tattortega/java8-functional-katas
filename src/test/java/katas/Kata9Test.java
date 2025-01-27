package katas;

import model.BoxArt;
import model.InterestingMoment;
import model.MovieList;
import org.junit.Assert;
import org.junit.Test;
import util.DataUtil;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class Kata9Test {

    @Test
    public void testExecute() {
        Assert.assertThat(Kata9.execute().size(), equalTo(4));
    }
}
