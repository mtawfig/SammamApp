package apps.mtawfig.com.sammam;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SelectLocalityActivity extends Activity {

    ListView list;
    String[] itemname ={
            "الخرطوم",
            "جبل أولياء",
            "بحري",
            "شرق النيل",
            "أمدرمان",
            "كرري",
            "أمبدة"
    };

    Integer[] imgid={
            R.drawable.listviewicon,
            R.drawable.listviewicon,
            R.drawable.listviewicon,
            R.drawable.listviewicon,
            R.drawable.listviewicon,
            R.drawable.listviewicon,
            R.drawable.listviewicon
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_locality);

        // Get bundle object at appropriate place in your code
        Bundle extras = getIntent().getExtras();

        // Extract data using passed keys
        String type = extras.getString("type");

        Toast.makeText(SelectLocalityActivity.this, type, Toast.LENGTH_SHORT).show();

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid);
        list=(ListView) findViewById(R.id.list);
        list.setAdapter((ListAdapter) adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // When clicked, show a toast with the TextView text
                Toast.makeText(getApplicationContext(), "You clicked! Boom!!! =)",
                        Toast.LENGTH_LONG).show();

            }
        });
    }


    /*@Override
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
    }*/
}
