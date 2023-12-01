package finalproject;
import java.util.*;

// Abstract class Employee
abstract class Employee {
    private int id;
    private String name;
    private Date dateOfBirth;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}

// Other classes such as ConstructionWorker, Builder, Contractor, Plumber, Electrician,
// Architect, Carpenter can be implemented similarly as per their attributes and methods.






