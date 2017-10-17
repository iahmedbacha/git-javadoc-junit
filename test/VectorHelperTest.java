import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VectorHelperTest {
    @Test
    void tri() {
        int[] tab = {1,4,6,3,0,20,10};
        int[] expected = {0,1,3,4,6,10,20};
        assertArrayEquals(expected,VectorHelper.tri(tab));
    }

    @Test
    void somme() throws DifferentLengthException {
        int[] tab1 = {1,4,6,3,0,20,10};
        int[] tab2 = {2,5,2,1,8,0,1};
        int[] expected = {3,9,8,4,8,20,11};
        assertArrayEquals(expected,VectorHelper.somme(tab1,tab2));
    }

}