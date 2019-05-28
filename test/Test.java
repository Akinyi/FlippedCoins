package FlippedCoins;

import src.Main;
import org.junit.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class Test{

    @Test
    public void headCount() {
        int[] A = {29, 1,0, 0,1,0,1, 101};
        Main main = new Main;
        int heads = headCount(A);
        assertThat(3, is(equalTo(heads)));
    }
}

