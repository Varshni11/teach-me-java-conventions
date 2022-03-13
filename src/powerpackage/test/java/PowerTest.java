package powerpackage;



import org.junit.jupiter.api.Test;
public class PowerTest {

    @Test
    public void oneRaisedToOneIsOne() {

        assert PowerFinder.of(1,1) == 1;
    }

    @Test
    public void twoRaisedToOneIsTwo() {

        assert PowerFinder.of(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwoIsFour() {

        assert PowerFinder.of(2, 2) == 4;
    }

    @Test
    public void threeRaisedToTwoIsNine() {

        assert PowerFinder.of(3, 2) == 3*3;
    }
}
