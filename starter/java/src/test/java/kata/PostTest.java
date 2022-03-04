package kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class PostTest {
    @Test
    void getPostContentTest() {
        Post post = new Post("Hello, World!");
        assertEquals("Hello, World!", post.getContent());
    }

    @Test
    void getPostTimestamp() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
        LocalDateTime timestamp = LocalDateTime.now();
        String currTime = dtf.format(timestamp);

        Post post = new Post("Hello, World!");
        assertEquals(currTime, post.getTime());
    }
}
