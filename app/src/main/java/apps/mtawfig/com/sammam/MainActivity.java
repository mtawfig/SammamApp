package apps.mtawfig.com.sammam;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends Activity implements View.OnClickListener {

    private LinearLayout fridge,electronics,ac,electric,bath,smith,paint,
            ceramic,cars,mechanic,cooker,iron,butcher,computer,carpenter,
            cotton,sitting,health,chef,digging,furniture,washing,haircut,
            grdener,others;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private void getAction()
    {
        fridge = (LinearLayout) findViewById(R.id.fridge);
        fridge.setOnClickListener(this);

        electronics = (LinearLayout) findViewById(R.id.electronics);
        electronics.setOnClickListener(this);

        ac = (LinearLayout) findViewById(R.id.ac);
        ac.setOnClickListener(this);

        electric = (LinearLayout) findViewById(R.id.electric);
        electric.setOnClickListener(this);

        bath = (LinearLayout) findViewById(R.id.bath);
        bath.setOnClickListener(this);

        smith = (LinearLayout) findViewById(R.id.smith);
        smith.setOnClickListener(this);

        //
        paint = (LinearLayout) findViewById(R.id.paint);
        paint.setOnClickListener(this);

        ceramic = (LinearLayout) findViewById(R.id.ceramic);
        ceramic.setOnClickListener(this);

        cars = (LinearLayout) findViewById(R.id.cars);
        cars.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            
        }
    }
}
