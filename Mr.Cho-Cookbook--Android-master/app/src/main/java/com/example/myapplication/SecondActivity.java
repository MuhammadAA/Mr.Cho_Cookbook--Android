package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.Arrays;


public class SecondActivity extends AppCompatActivity {

    private ListView mainRecipeList;
    private ArrayAdapter<String> listAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        mainRecipeList = findViewById(R.id.recipeList);

        String[] recipes = new String[] {"Boba Tea", "Chicken Shawarma", "Potato Wedges", "Chocolate Cake", "Nachos", "Baked Potato", "French Toast", "Croissant","Cookies n' Cream Milkshake", "Gelato"};
        ArrayList<String> recipesList = new ArrayList<>();
        recipesList.addAll(Arrays.asList(recipes));

        listAdapter = new ArrayAdapter<String>(this, R.layout.simple_row, recipesList);

        listAdapter.add("Cola");

        mainRecipeList.setAdapter(listAdapter);

        mainRecipeList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                openNewActivity(position);
            }
        });
    }

    public void openNewActivity(int Position){
        if(Position == 0){
            Intent intent = new Intent(this, Boba_tea_r.class);
            startActivity(intent);
        }
        else if(Position == 1){
            Intent intent = new Intent(this, shawarma.class);
            startActivity(intent);
        }
        else if(Position == 2){
            Intent intent = new Intent(this, wedges_r.class);
            startActivity(intent);
        }
        else if(Position == 3){
            Intent intent = new Intent(this, chocolate_cake_r.class);
            startActivity(intent);
        }
        else if(Position == 4){
            Intent intent = new Intent(this,nachos_r.class);
            startActivity(intent);
        }
        else if(Position == 5){
            Intent intent = new Intent(this, baked_potato.class);
            startActivity(intent);
        }
        else if(Position == 6){
            Intent intent = new Intent(this, french_toast.class);
            startActivity(intent);
        }
        else if (Position == 7){
            Intent intent = new Intent(this, crossant.class);
            startActivity(intent);
        }
        else if(Position == 8){
            Intent intent = new Intent(this, cookies_n_creme_r.class);
            startActivity(intent);
        }
        else if(Position == 9){
            Intent intent = new Intent(this, gelato_r.class);
            startActivity(intent);
        }
        else if(Position == 10){
            Intent intent = new Intent(this, cola.class);
            startActivity(intent);
        }

    }
}
