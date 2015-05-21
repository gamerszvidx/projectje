package gamerszvidx.twoscreens;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class tweedeactivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tweedeactivity);
        Intent intent = getIntent(); // this is just for example purpose
        Bundle b = intent.getExtras();
        EditText text = (EditText) findViewById(R.id.text);
        String tekst = (String) b.get("BERICHT");
        text.setText(tekst);
    }

}
