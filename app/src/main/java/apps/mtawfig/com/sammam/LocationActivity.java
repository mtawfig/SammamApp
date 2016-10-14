package apps.mtawfig.com.sammam;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class LocationActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        // Get bundle object at appropriate place in your code
        Bundle extras = getIntent().getExtras();

        // Extract data using passed keys
        String type = extras.getString("type");

        Toast.makeText(LocationActivity.this, type, Toast.LENGTH_SHORT).show();
    }
}
