import java.util.ArrayList;
import java.util.Iterator;

public class ProjectManager {

    private ArrayList<Project> projects;

    // Creates new array list to store projects.
    public ProjectManager(){
        projects = new ArrayList<>();
    }

    // Function to add projects in the list.
    public void addProject(Project project){
        projects.add(project);
    }

    // Function to get the whole project information.
    public ArrayList<Project> getProjects(){
        return projects;
    }

    // Function to find specific project by Id.
    public Project findById(int Id){
        for (Project project : projects ){
            if (project.getId() == Id){
                return project;
            }
        }
        return null;
    }

    // Function to find specific project by Name.
    public Project findByName(String Name){
        for (Project project : projects ){
            if (project.getName().equals(Name)){
                return project;
            }
        }
        return null;
    }

    // Function to remove a project from the list.
    public void deleteProject(int id){
        Project project = findById(id);

        if (project != null){
            projects.remove(project);
        }
    }

    // Function to modify name of the project.
    public void modifyProjectName(int id, String newName){
        Project project = findById(id);

        if (project != null){
            project.setName(newName);
        }

    }

    // Function to modify project status.
    public void modifyProjectStatus(int id, ProjectStatus status){
        Project project = findById(id);

        if (project != null){
            project.setStatus(status);
        }
    }

    // Function to pin a project.
    public void pinProject(int id){
        Project project = findById(id);

        if (project != null){
            project.setPinned(true);
        }
    }
}
