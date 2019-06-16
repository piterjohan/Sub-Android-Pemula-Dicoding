package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.firstapplication.Model.Anime;

public class DetailsAnime extends AppCompatActivity {

    //variabel
    public static final String EXTRA_KEY = "extra_key";
    private ImageView animesImages;
    private TextView animesTitle;
    private TextView  animesDescrition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_anime);

       //binding
        animesImages        = findViewById(R.id.img_detail_animes);
        animesTitle         = findViewById(R.id.txt_titleanimes);
        animesDescrition    = findViewById(R.id.txt_descriptionanimes);

        //get data
        Anime dataanimes   = getIntent().getParcelableExtra(EXTRA_KEY);
        Glide
                .with(this)
                .load(dataanimes.getPhoto())
                .into(animesImages);
        animesTitle.setText(dataanimes.getName());
        animesDescrition.setText(dataanimes.getDescription());
    }
}
