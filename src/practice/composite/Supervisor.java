package practice.composite;

import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Faculty{
    private String name;
    private String deptName;

    private List<Faculty> myFacultyList;

    Supervisor(String name, String deptName) {
        this.name = name;
        this.deptName = deptName;

    }

    public void add (Faculty professor) {

    }

    public void remove(Faculty professor) {

    }

    public List<Faculty> getMyFaculty() {
        return myFacultyList;
    }

    @Override
    public String getDetails() {
        return (name + " is the  " + deptName);
    }
}
