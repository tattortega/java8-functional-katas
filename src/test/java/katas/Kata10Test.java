package katas;

import org.junit.Assert;
import org.junit.Test;
import util.DataUtil;

import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class Kata10Test {

    @Test
    public void testExecute() {
        Assert.assertThat(Kata10.execute().size(), equalTo(2));

    }
}
