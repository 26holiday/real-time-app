
public class Director {
    Employee directorDetails;

    public Director(Employee directorDetails) {
        this.directorDetails = directorDetails;
    }

    public Employee getDirectorDetails() {
        return directorDetails;
    }


    public void setDirectorDetails(Employee directorDetails) {
        this.directorDetails = directorDetails;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
