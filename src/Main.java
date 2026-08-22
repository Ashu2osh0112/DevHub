import java.util.ArrayList;

public class Main{
    public static void main(String[] args){

        ArrayList<Project> projects = new ArrayList<>();

        Project project1 = new Project(1, "PacMan", "C:\\Users\\Ashut\\IdeaProjects", "Java");

        projects.add(project1);

        Project project2 = new Project(2, "DevHub", "C:\\Users\\Ashut\\IdeaProjects\\DevHub", "Java");

        projects.add(project2);

        Project project3 = new Project(3, "PyLib", "C:\\Users\\Ashut\\IdeaProjects\\DevHub", "Java");

        projects.add(project3);

        System.out.println(projects.size());

        for (Project project : projects) {
            System.out.println(project.getName());
        }

    }
}