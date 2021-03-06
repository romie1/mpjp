package m1ex;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class S04Test {
    @Test
    void sumPositive() {
        long actual = S04.sum(1, 3);

        assertThat(actual, is(6L));
    }

    @Test
    void sumNegPos() {
        long actual = S04.sum(-3, 3);

        assertThat(actual, is(0L));
    }

    @Test
    void sumSingle() {
        long actual = S04.sum(1003, 1003);

        assertThat(actual, is(1003L));
    }

    @Test
    void sumEmpty() {
        long actual = S04.sum(1003, 1002);

        assertThat(actual, is(0L));
    }

    @Test
    void evenSumPositive() {
        long actual = S04.evenSum(1, 3);

        assertThat(actual, is(2L));
    }

    @Test
    void evenSumNegPos() {
        long actual = S04.evenSum(-3, 3);

        assertThat(actual, is(0L));
    }

    @Test
    void evenSumSingle() {
        long actual = S04.evenSum(1002, 1002);

        assertThat(actual, is(1002L));
    }

    @Test
    void evenSumEmpty() {
        long actual = S04.evenSum(1003, 1002);

        assertThat(actual, is(0L));
    }
    
    @Test
    void positiveSqrt() {
    	double actual = S04.sqrt(4);
    	double expected = 2.0;
    	assertThat(actual,  closeTo(expected, .0001));
    }

    @Test
    void factorialFour() {
        long actual = S04.factorial(4);

        assertThat(actual, is(24L));
    }

    @Test
    void factorialNegative() {
        long actual = S04.factorial(-4);

        assertThat(actual, is(0L));
    }

    @Test
    void fibonacci() {
        long actual = S04.fibonacci(5);
        assertThat(actual, is(5L));
    }

    @Test
    void multiplicationTableZero() {
        int[][] actual = S04.multiplicationTable(0);

        int[][] expected = {};
        assertThat(actual, is(expected));
    }

    @Test
    void multiplicationTableThree() {
        int[][] actual = S04.multiplicationTable(3);

        int[][] expected = { { 1, 2, 3 }, { 2, 4, 6 }, { 3, 6, 9 } };
        assertThat(actual, is(expected));
    }
}
