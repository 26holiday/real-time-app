import java.util.ArrayList;
import java.util.List;

public class Campus {
    private String name;
    private String address;
    private Directory directory;

    public Campus(String name, String address, Directory directory, ArrayList<Department> departments) {
        this.name = name;
        this.address = address;
        this.directory = directory;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Directory getDirectory() {
        return directory;
    }

    public void setDirectory(Directory directory) {
        this.directory = directory;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    ArrayList<Department> departments;
    public void addDepartment(Department department) {

    }
    public void removeDepartment(Department department){

    }
    public Department getDepartment() {


    }
}
