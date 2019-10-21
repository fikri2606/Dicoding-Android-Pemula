package com.example.gunungdiindonesia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;



import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvGunung;
    private ArrayList<Gunung> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvGunung = findViewById(R.id.rv_gunung);
        rvGunung.setHasFixedSize(true);


        list.addAll(DataGunung.getListData());
        showRecyclerList();


    }

    private void showRecyclerList() {
        rvGunung.setLayoutManager(new LinearLayoutManager(this));
        CardViewGunung cardViewGunung = new CardViewGunung(this
        );
        cardViewGunung.setCardGunung(list);
        rvGunung.setAdapter(cardViewGunung);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profil, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_profil:
                Intent moveIntent = new Intent(MainActivity.this, Profil.class);
                startActivity(moveIntent);

                break;
        }
    }
}
