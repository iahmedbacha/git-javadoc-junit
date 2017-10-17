import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorHelperTest {
    @Test
    void tri() {
        int[] tab = {1,4,6,3,0,20,10};
        int[] expected = {0,1,3,4,6,10,20};
        assertArrayEquals(expected,VectorHelper.tri(tab));
    }

}