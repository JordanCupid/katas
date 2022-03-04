package kata;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class User {
    private final String username;
    private Integer postCount;
    private JSONArray timeline;
    private final File userDir;
    private final String timelinePath;
    private final String wallPath;
    private final File tp;
    private final File wp;

    public User(String username){
        this.username = username;
        postCount = 0;
        timeline = new JSONArray();

        userDir = new File("." + File.separator + this.username);
        userDir.mkdirs();
        timelinePath = userDir.getAbsolutePath() + File.separator + "timeline.json";
        wallPath = userDir.getAbsolutePath() + File.separator + "wall.json";
        tp = new File(timelinePath);
        wp = new File(wallPath);

        try {
            tp.createNewFile();
            wp.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getUsername(){
        return username;
    }

    public Integer getPostCount(){
        return postCount;
    }

    public JSONArray getTimeline(){
        return timeline;
    }

    public void addPost(Post post){
        postCount += 1;
        JSONObject object = new JSONObject();
        object.put("author", getUsername());
        object.put("post id", getPostCount());
        object.put("body", post.getContent());
        object.put("time", post.getTime());
        addToTimeline(object);
    }

    public void addToTimeline(JSONObject post){
        timeline.put(post);
        FileWriter file;
        try {
            file = new FileWriter(tp);
            file.write(timeline.toString(4));
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
