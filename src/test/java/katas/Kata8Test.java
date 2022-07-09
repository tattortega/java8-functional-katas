package katas;

import com.codepoetics.protonpack.StreamUtils;
import model.Bookmark;
import model.Movie;
import org.junit.Assert;
import org.junit.Test;
import util.DataUtil;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class Kata8Test {

    @Test
    public void testExecute() {
        Assert.assertThat(Kata8.execute().size(), equalTo(3));

    }
}
