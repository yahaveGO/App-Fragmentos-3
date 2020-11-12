package com.example.appfragmentos3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteraction{
    private Persona persona;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.contenedor, new BlankFragment()).commit();
    }
    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    */
    @Override
    public void visualizar(String name){
        Toast.makeText(this, "Saludo "+name+" desde la actividad Principal", Toast.LENGTH_SHORT).show();
    }


    public void getPersona(Persona persona){
        this.persona = persona;
        Toast.makeText(getApplicationContext(), persona.toString(), Toast.LENGTH_SHORT).show();
    }
}

