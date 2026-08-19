public class Main{
    public static void main(String[] args){
        Project project1 = new Project(1, "PacMan", "C:\\Users\\Ashut\\IdeaProjects", "Java");

        System.out.println(project1.getId());
        System.out.println(project1.getName());
        System.out.println(project1.getPath());
        System.out.println(project1.getLanguage());
        System.out.println(project1.getCreatedAt());
        System.out.println(project1.getStatus());

    }
}