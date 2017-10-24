package activity.mobileappdevelopment.edu.database;


/**
 * Created by user on 10/19/17.
 */

public class Contact {
    //private variables
    int _id;
    String _fname;
    String _lname;

    public Contact(){}
    public Contact(int id, String fname, String lname){
        this._id = id;
        this._fname = fname;
        this._lname = lname;
    }
    public Contact(String fname, String lname){
        this._fname = fname;
        this._lname = lname;
    }

    public int getID() {
        return _id;
    }

    public void setID(int _id) {
        this._id = _id;
    }

    public String getFname() {
        return _fname;
    }

    public void setFname(String _fname) {
        this._fname = _fname;
    }

    public String getLname() {
        return _lname;
    }

    public void setLname(String _lname) {
        this._lname = _lname;
    }
}
