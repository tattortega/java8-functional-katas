package katas;

import org.junit.Assert;
import org.junit.Test;
import util.DataUtil;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class Kata11Test {

    @Test
    public void testExecute() {
        Assert.assertThat(Kata11.execute().size(), equalTo(2));
    }
}
