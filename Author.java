import java.util.HashMap;

public class Author {
    String name;
    String bio;

    public Author(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }
    public String getName(){
        return name;
    }

    public String getBio(){
        return bio;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setBio(String bio){
        this.bio = bio;
    }

}
