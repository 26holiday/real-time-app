import java.util.ArrayList;
import java.util.List;

public class Campus {
    String name;
    String address;
    Director director;
    ArrayList<Department> departments;


    public Campus(String name, String address, Director director, ArrayList<Department> departments) {
        this.name = name;
        this.address = address;
        this.director = director;
        this.departments = departments;
    }



    public void addDepartment(Department department) {

    }
    public void removeDepartment(Department department){

    }
    public Department getDepartment() {
        return null;

    }
}
