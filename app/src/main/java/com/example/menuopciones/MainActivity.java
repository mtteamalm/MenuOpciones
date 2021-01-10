package com.example.menuopciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_new_averia:
                nuevaAveria();
                return true;
            case R.id.action_edit_averia:
                editarAveria();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void editarAveria() {
        Toast.makeText(this, "Has seleccionado Editar una nueva avería", Toast.LENGTH_LONG).show();
    }

    private void nuevaAveria() {
        Toast.makeText(this, "Has seleccionado dar de alta una nueva avería", Toast.LENGTH_LONG).show();
    }


}