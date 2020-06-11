import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertTrue;

public class SILab2Test {
    @Test
    void everyBranchTest(){
        RuntimeException ex;

        ex = assertThrows(RuntimeException.class, () -> SILab2.function(null));
        assertTrue(ex.getMessage().contains("Username ok"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.function());
        assertTrue(ex.getMessage().contains("Username not ok"));
    }

    @Test
    void multipleConditionsTest(){
        RuntimeException ex;
       // (user.getUsername()==null || allUsers.contains(user.getUsername())
        //T||X
        //F||T
        //F||F
        ex = assertThrows(RuntimeException.class,
                () -> SILab2.function(null, 5d));
        assertTrue(ex.getMessage().contains("Username is not ok"));

        ex = assertThrows(RuntimeException.class,
                () ->SILab2.function(Collections.getUsername(), 5d));
        assertTrue(ex.getMessage().contains("Username is not ok"));

        assertEquals(5d, SILab2.functions(createList(2d, 3d), 1d));

    }





}



