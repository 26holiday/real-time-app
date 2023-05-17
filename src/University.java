import java.util.ArrayList;

public class University {
    String name;
    ArrayList<Campus> campuses;

    University(String name, ArrayList<Campus> campuses) {
        this.name = name;
        this.campuses = campuses;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Campus> getCampuses() {
        return campuses;
    }

    public void setCampuses(ArrayList<Campus> campuses) {
        this.campuses = campuses;
    }


    public void addCampus(Campus campus) {
        campuses.add(campus);
    }

    public void removeCampus(Campus campus) {
        campuses.remove(campus);
    }

    public ArrayList<Campus> getCampus() {
        return campuses;
    }



    
}
