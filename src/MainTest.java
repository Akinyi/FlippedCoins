

import org.junit.Assert;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;


public class MainTest {
    Main main = new Main();
    int[] A = {29, 1,0, 0,1,0,1, 101, 1, 0, 0};
    @org.junit.Test
    public void main() {

    }

    @org.junit.Test
    public void headCount() {
        int heads = main.headCount(A);
        assertThat(5, is(equalTo(heads)));
    }

    @org.junit.Test
    public void trueNumberOfHeadsAndTails() {
        int N = main.trueNumberOfHeadsAndTails(A);
        assertThat(9, is(equalTo(N)));
    }
}