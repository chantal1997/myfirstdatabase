package activity.mobileappdevelopment.edu.database;

/**
 * Created by ENVY 15 on 10/24/2017.
 */

public class Details {
    //private variables
    int _cid;
    String _cname;

    public Details(){}
    public Details(int id, String name){
        this._cid = id;
        this._cname = name;
    }
    public Details(String name){
        this._cname = name;
    }

    public int getCID() {
        return _cid;
    }

    public void setCID(int _cid) {
        this._cid = _cid;
    }

    public String getCName() {
        return _cname;
    }

    public void setCName(String _cname) {
        this._cname = _cname;
    }

}
