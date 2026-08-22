public class Main{
    public static void main(String[] args){

        ProjectManager manager = new ProjectManager();

        Project project1 = new Project(1, "DevHub", "C_Drive", "Java");

        manager.addProject(project1);

        System.out.println(manager.getProjects());

        System.out.println(manager.findById(1));

        System.out.println(manager.findById(10));

        System.out.println(manager.findByName("DevHub"));

        Project project2 = new Project(2, "Pacman", "D_Drive", "Python");

        manager.addProject(project2);

        System.out.println(manager.getProjects());

        manager.deleteProject(2);

        System.out.println(manager.getProjects());

        System.out.println(manager.findById(1).getStatus());

        manager.modifyProjectStatus(1, ProjectStatus.COMPLETED);

        System.out.println(manager.findById(1).getStatus());

        manager.pinProject(1);

        System.out.println(manager.getProjects());
    }

}