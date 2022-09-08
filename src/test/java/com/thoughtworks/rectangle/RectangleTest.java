import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class RectangleTest
{

    @Test
    public void shouldReturnAreaWhenLengthAndBreathGiven()
    {
        Rectangle rect = new Rectangle(11.2,22.1);
        double expected = 11.2*22.1;

        double actual = rect.area();

        assertThat(actual,closeTo(expected,0.01));
    }

    @Test 
    public void shouldReturnPerimeterWhenLengthAndBreadthGiven()
    {
        Rectangle rect = new Rectangle(11.2,22.1);
        double expected = 2*(11.2+22.1);

        double actual = rect.perimeter();

        assertThat(actual,closeTo(expected,0.01));
    }
}
