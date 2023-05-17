import java.util.ArrayList;

public class Lab {
    String labStaffIncharge;
    boolean hasProjector;
    ArrayList<Computer> computers;

    public Lab(String labStaffIncharge, boolean hasProjector, ArrayList<Computer> computers) {
        this.labStaffIncharge = labStaffIncharge;
        this.hasProjector = hasProjector;
        this.computers = computers;
    }

    public String getLabStaffIncharge() {
        return labStaffIncharge;
    }

    public void setLabStaffIncharge(String labStaffIncharge) {
        this.labStaffIncharge = labStaffIncharge;
    }

    public boolean isHasProjector() {
        return hasProjector;
    }

    public void setHasProjector(boolean hasProjector) {
        this.hasProjector = hasProjector;
    }

    public ArrayList<Computer> getComputers() {
        return computers;
    }

    public void setComputers(ArrayList<Computer> computers) {
        this.computers = computers;
    }


    public void addComputer()
    {

    }
    public void removeComputer(Computer computer)
    {

    }

    public Computer getComputer(int ComputerID)
    {

    }
    {

    }
}
