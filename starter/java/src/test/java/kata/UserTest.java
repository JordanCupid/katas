package kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void getUsernameTest() {
        User jordan = new User("Jordan");
        assertEquals("Jordan", jordan.getUsername());
    }

    @Test
    void verifyTimelineNotEmptyTest() {
        User sean = new User("Sean");
        sean.addPost(new Post("Hello, World!"));
        assertNotNull(sean.getTimeline());
    }

    @Test
    void getPostCountTest() {
        User brian = new User("Brian");
        brian.addPost(new Post("Post count should be 1 now"));
        brian.addPost(new Post("Post count should be 2 now"));
        brian.addPost(new Post("Post count should be 3 now"));
        assertEquals(brian.getPostCount(), 3);
    }
}
