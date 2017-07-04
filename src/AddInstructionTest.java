import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by aspanu on 2017-07-03.
 */

public class AddInstructionTest {

    @Test
    public void testAddInstructionConstructor() {
        AddInstruction ai = new AddInstruction(1L, 3L);
        assertEquals(ai.getLeft().longValue(), 1L);
        assertEquals(ai.getRight().longValue(), 3L);
    }

    @Test
    public void testEqualAddInstruction() {
        AddInstruction aiEqual = new AddInstruction(4L, 4L);
        assertTrue(aiEqual.getLeft() == 4L);
        assertTrue(aiEqual.getRight() == 4L);
    }

}