package katas;

import model.BoxArt;
import model.MovieList;
import org.junit.Assert;
import org.junit.Test;
import util.DataUtil;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class Kata7Test {

    @Test
    public void testExecute() {
        Assert.assertThat(Kata7.execute().size(), equalTo(4));

    }
}
