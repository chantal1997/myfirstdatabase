package activity.mobileappdevelopment.edu.database;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHandler db = new DatabaseHandler(this);

        //CONTACTS TABLE
        Log.d("Insert:", "Inserting..");
        db.addContact(new Contact("chantal", "200009991"));
        db.addContact(new Contact("Anita", "433322334"));
        db.addContact(new Contact("thomas", "3333999911"));
        db.addContact(new Contact("Ernest", "6665554444"));

        //COURSES TABLE
        Log.d("Insert:", "Inserting..");
        db.addCourses(new Details("dog"));
        db.addCourses(new Details("cat"));
        db.addCourses(new Details("lion"));
        db.addCourses(new Details("jaguar"));
        db.addCourses(new Details("panther"));


        //Reading all Contacts
        Log.d("Reading:", "Reading all contacts..");
        List<Contact> contact = db.getAllContacts();

        for (Contact cn : contact) {
            String log = "Id: " + cn.getID() + ",FName:" + cn.getFname() + ",LName:" + cn.getLname();
            // Writing Contacts to log
            Log.d("Name:", log);
        }

        //Reading all Details
        Log.d("Reading:", "Reading all courses..");
        List<Details> courses = db.getAllCourses();

        for (Details cs : courses){
            String log = "CID: "+cs.getCID()+",CName:"+cs.getCName();
            // Writing Contacts to log
            Log.d("Name:", log);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
