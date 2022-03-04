package kata;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    private final String createdAt;
    private String content;

    public Post(String content){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");
        LocalDateTime timestamp = LocalDateTime.now();
        createdAt = dtf.format(timestamp);
        this.content = content;
    }

    public String getContent(){
        return content;
    }
    public String getTime(){ return createdAt; }
}