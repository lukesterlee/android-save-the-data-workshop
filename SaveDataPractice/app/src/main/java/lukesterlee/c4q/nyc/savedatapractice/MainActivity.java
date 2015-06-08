package lukesterlee.c4q.nyc.savedatapractice;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;



public class MainActivity extends ActionBarActivity {

    // TODO : STEP 1 - initialize 6 more widgets (from activity_main.xml) variables
    EditText editTextFirstName;




    // TODO : STEP 3 - create keys for SharedPreferences
    public static final String FIRST_NAME_KEY = "first";


    // TODO : STEP 4 - create a key for SharedPreferences file name.


    SharedPreferences mSharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO : STEP 5 - get SharedPreferences with file name key and private mode.


        initializeViews();

        restoreDataFromSharedPreferences();

        setUpListener();

    }




    // TODO : STEP 2 - initialize all the views.
    private void initializeViews() {
        editTextFirstName = (EditText) findViewById(R.id.editText_firstName);

    }

    // TODO : STEP 6 - save the data (first name, last name, email address) into SharedPreferences.
    private void saveDataToSharedPreferences() {

    }

    // TODO : STEP 8 - restore data from SharedPreferences
    private void restoreDataFromSharedPreferences() {

    }

    // TODO : STEP 7 - set up a listener for the submit button. When the button is clicked, save the data into SharedPreferences.
    private void setUpListener() {

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
