package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.firstapplication.Controller.ListAnimeAdapter;
import com.example.firstapplication.Model.Anime;
import com.example.firstapplication.Model.AnimeData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Variabel
    private RecyclerView rvCategory;
    final String STATE_LIST  = "state_list";
    //add animedata
    private ArrayList<Anime> listDatasAnime = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory  = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        //get animedata & saved bandle
        if (savedInstanceState == null){
        listDatasAnime.addAll(AnimeData.animeListData());
        showRecyclerList();
        }else {
            ArrayList<Anime> stateList = savedInstanceState.getParcelableArrayList(STATE_LIST);
            listDatasAnime.addAll(stateList);
            showRecyclerList();
        }
    }

    //void
    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListAnimeAdapter listanimeAdapter = new ListAnimeAdapter(this);
        listanimeAdapter.setListAnimeDatas(listDatasAnime);
        rvCategory.setAdapter(listanimeAdapter);
    }

    //bundle

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelableArrayList(STATE_LIST,listDatasAnime);
    }
}
