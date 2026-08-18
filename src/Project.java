import java.time.LocalDateTime;

public class Project {
    private int id;
    private String name;
    private String path;
    private String language;
    private LocalDateTime createdAt;
    private ProjectStatus status;
    private boolean pinned;


    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getPath(){
        return this.path;
    }

    public String getLanguage(){
        return this.language;
    }

    public LocalDateTime getCreatedAt(){
        return this.createdAt;
    }

    public ProjectStatus getStatus(){
        return this.status;
    }

    public boolean isPinned(){
        return this.pinned;
    }

    public Project(int id, String name, String path, String language){
        this.id = id;
        this.name = name;
        this.path = path;
        this.language = language;
        this.createdAt = LocalDateTime.now();
        this.status = ProjectStatus.ACTIVE;
        this.pinned = False;
    }
}