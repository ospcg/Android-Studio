package com.example.ospcg.prueba1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
                                                    //implementamos la accion Click a la actividad
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //Declaramos las variables de los elementos creados en la interfaz
    TextView t1;
    EditText e1;
    Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //recibimos por medio de los ID los datos que se nos envian
        t1= (TextView) findViewById(R.id.tvdato);
        e1= (EditText) findViewById(R.id.etdato);
        b1= (Button) findViewById(R.id.btnenviar);
        //instanciamos al objeto boton b1 hacia la accion onclick
        b1.setOnClickListener(this);

        b2=(Button) findViewById(R.id.btnActivity);
        b2.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btnenviar:
                String dato= e1.getText().toString();
                t1.setText(dato);
                break;
            case R.id.btnActivity:
                String dato2=e1.getText().toString();
                //se crea objeto intent para instanciar la nueva actividad
                Intent intent= new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("DATO",dato2);
                //se da inicio a la nueva activity
                startActivity(intent);
                 break;
        }
    }
}
