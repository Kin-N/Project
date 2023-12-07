package finalproject;
class Project {
    private int id;
    private String name;
    private Date startDate;
    private Date endDate;
    private float cost;
    private List<Material> materials;

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
        materials.add(mat);
    }

    public void removeMaterial(Material mat) {
        materials.remove(mat);
    }
}
