package gamerszvidx.twoscreens;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void stuurBericht(View v)
    {
        Intent intent = new Intent(this,tweedeactivity.class);
        EditText etbericht = (EditText) findViewById(R.id.et_bericht);
        String tekst = etbericht.getText().toString();
        intent.putExtra("BERICHT",tekst);
        startActivity(intent);

    }
}
