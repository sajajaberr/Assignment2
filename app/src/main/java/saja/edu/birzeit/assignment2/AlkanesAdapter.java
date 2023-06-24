package saja.edu.birzeit.assignment2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AlkanesAdapter extends RecyclerView.Adapter<AlkanesAdapter.ViewHolder>{

    Alkanes[] alkanes;


    Activity activity;
    public AlkanesAdapter(Alkanes[] alkanes, Activity activity) {
        this.alkanes = alkanes;
        this.activity = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_alkanes,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Alkanes alkanesList = alkanes[position];
        holder.name.setText(alkanesList.getName());
        holder.data.setText(alkanesList.getData());
        holder.image.setImageResource(alkanesList.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, alkanesList.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return alkanes.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name;
        TextView data;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.imageview);
            name = itemView.findViewById(R.id.nametxt);
            data = itemView.findViewById(R.id.datatxt);
        }
    }
}
