package com.glencconnect.exercisefragments.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.glencconnect.exercisefragments.Model.Chat;
import com.glencconnect.exercisefragments.Model.Data;
import com.glencconnect.exercisefragments.R;

import java.util.ArrayList;
import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.myViewHolder> {

    private List<Chat> chatList;
    private Context context;

    public ChatAdapter(List<Chat> chatList, Context context) {
        this.chatList = chatList;
        this.context = context;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        holder.bindView(position);

    }

    @Override
    public int getItemCount() {
        return Data.name.length;
    }

    public class myViewHolder extends RecyclerView.ViewHolder{


        TextView name,surname,nickname;
        ImageView imageView;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name_id);
            imageView = itemView.findViewById(R.id.image_id);
            nickname = itemView.findViewById(R.id.nickname_id);
            surname = itemView.findViewById(R.id.surname_id);
        }

        public void bindView(int position){

            name.setText(Data.name[position]);
            surname.setText(Data.surname[position]);
            nickname.setText(Data.messageNick[position]);
            imageView.setImageResource(Data.images[position]);
        }

    }

}

