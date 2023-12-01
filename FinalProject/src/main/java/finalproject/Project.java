package finalproject;

import java.util.Date;
import java.util.List;

class Project {
    private int id;
    private String name;
    private Date startDate;
    private Date endDate;
    private float cost;
    private List<Material> materials;
    private List<Employee> assignedEmployees;
    private String status;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public float getCost() {
        return cost;
    }

    public void addMaterial(Material mat) {
        // Implementation to add material to the project
    }

    public void removeMaterial(Material mat) {
        // Implementation to remove material from the project
    }

    public void assignEmployee(Employee emp) {
        // Implementation to assign an employee to the project
    }

    public void completeProject() {
        // Implementation to mark the project as completed
    }

    public String getStatus() {
        return status;
    }
}
// Other classes like Client, Invoice, Admin, Contract, TimeManagement can be implemented similarly