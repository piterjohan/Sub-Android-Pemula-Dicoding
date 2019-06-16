package com.example.firstapplication.Controller;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.firstapplication.DetailsAnime;
import com.example.firstapplication.Helper.CustomOnItemClickListener;
import com.example.firstapplication.R;
import com.example.firstapplication.Model.Anime;

import java.util.ArrayList;

public class ListAnimeAdapter extends RecyclerView.Adapter<ListAnimeAdapter.ViewDataAnime> {
    //variabel
    private Context context;
    private ArrayList<Anime> listAnimeDatas;

    //setter & getter
    public ArrayList<Anime> getListAnimeDatas() {
        return listAnimeDatas;
    }

    public void setListAnimeDatas(ArrayList<Anime> listAnimeDatas) {
        this.listAnimeDatas = listAnimeDatas;
    }
    //construct
    public ListAnimeAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewDataAnime onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list_anime, viewGroup, false);
        return new ViewDataAnime(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewDataAnime holder, int position) {
        holder.tvName.setText(getListAnimeDatas().get(position).getName());
        holder.tvDesc.setText(getListAnimeDatas().get(position).getDescription());

        //photo use  library glide
        Glide.with(context)
                .load(getListAnimeDatas().get(position).getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        //btn for check the item
        holder.btnDetails.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallBack() {
            @Override
            public void DataClick(View view, int position) {
                Toast.makeText(context, "Details Anime Yang Anda Tekan: "+ getListAnimeDatas().get(position).getName(), Toast.LENGTH_SHORT).show();
                Intent intent   = new Intent(context,DetailsAnime.class);
                intent.putExtra(DetailsAnime.EXTRA_KEY, getListAnimeDatas().get(position));

                context.startActivity(intent);
            }
        }));
    }

    @Override
    public int getItemCount() {
        //return Arraylist
        return getListAnimeDatas().size();
    }

    public class ViewDataAnime extends RecyclerView.ViewHolder {
        //View Dek
        TextView tvName;
        TextView tvDesc;
        ImageView imgPhoto;
        Button btnDetails;

        public ViewDataAnime(@NonNull View itemView) {
            super(itemView);
            //binding
            tvName      = itemView.findViewById(R.id.tv_item_name);
            tvDesc      = itemView.findViewById(R.id.tv_item_description);
            imgPhoto    = itemView.findViewById(R.id.img_item_photo);
            btnDetails  = itemView.findViewById(R.id.btn_details);
        }
    }
}
