package SE150124.se1.se1_150124;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private EditText usu,pas;
    private TextView Veri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usu=(EditText)findViewById(R.id.TxtUser);
        pas=(EditText)findViewById(R.id.TxtPass);
        Veri=(TextView)findViewById(R.id.Ver);
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

        //Este método se ejecutará cuando se presione el botón
        public void Valida(View view) {
            String valor1=usu.getText().toString();
            String valor2=pas.getText().toString();

                String Veri=String.valueOf("Usuario Correcto");


        }


    }
