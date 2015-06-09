package lukesterlee.c4q.nyc.savedatapractice;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    // TODO : STEP 1 - initialize 6 more widgets (from activity_main.xml) variables
    EditText editTextFirstName;
    EditText editTextLastName;
    EditText editTextEmail;
    TextView textViewFirstName;
    TextView textViewLastName;
    TextView textViewEmail;
    Button buttonSubmit;




    // TODO : STEP 3 - create keys for SharedPreferences
    public static final String FIRST_NAME_KEY = "first";
    public static final String LAST_NAME_KEY = "last";
    public static final String EMAIL_KEY = "email";


    // TODO : STEP 4 - create a key for SharedPreferences file name.
    public static final String PREFERENCE_FILE = "save_data";


    SharedPreferences mSharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO : STEP 5 - get SharedPreferences with file name key and private mode.
        mSharedPreferences = getApplicationContext().getSharedPreferences(PREFERENCE_FILE, Context.MODE_PRIVATE);

        initializeViews();

        restoreDataFromSharedPreferences();

        setUpListener();

    }




    // TODO : STEP 2 - initialize all the views.
    private void initializeViews() {
        editTextFirstName = (EditText) findViewById(R.id.editText_firstName);
        editTextLastName = (EditText) findViewById(R.id.editText_lastName);
        editTextEmail = (EditText) findViewById(R.id.editText_email);
        textViewFirstName = (TextView) findViewById(R.id.textView_firstName);
        textViewLastName = (TextView) findViewById(R.id.textViewlastName);
        textViewEmail = (TextView) findViewById(R.id.textView_email);
        buttonSubmit = (Button) findViewById(R.id.button_submit);

    }

    // TODO : STEP 6 - save the data (first name, last name, email address) into SharedPreferences.
    private void saveDataToSharedPreferences() {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(FIRST_NAME_KEY, textViewFirstName.getText().toString());
        editor.putString(LAST_NAME_KEY, textViewLastName.getText().toString());
        editor.putString(EMAIL_KEY, textViewEmail.getText().toString());
        editor.commit();

    }

    // TODO : STEP 8 - restore data from SharedPreferences
    private void restoreDataFromSharedPreferences() {
        textViewFirstName.setText(mSharedPreferences.getString(FIRST_NAME_KEY, ""));
        textViewLastName.setText(mSharedPreferences.getString(LAST_NAME_KEY, ""));
        textViewEmail.setText(mSharedPreferences.getString(EMAIL_KEY, ""));
    }

    // TODO : STEP 7 - set up a listener for the submit button. When the button is clicked, save the data into SharedPreferences.
    private void setUpListener() {
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewFirstName.setText(editTextFirstName.getText());
                textViewLastName.setText(editTextLastName.getText());
                textViewEmail.setText(editTextEmail.getText());
                saveDataToSharedPreferences();
            }
        });
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
