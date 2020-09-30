package com.glencconnect.exercisefragments.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.glencconnect.exercisefragments.Adapters.ChatAdapter;
import com.glencconnect.exercisefragments.Model.Chat;
import com.glencconnect.exercisefragments.R;

import java.util.ArrayList;
import java.util.List;

public class ConnectionsFragment extends Fragment {

    public ConnectionsFragment(){}

    private RecyclerView recyclerView;
    private List<Chat> chatList;
    private ChatAdapter chatAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.connections_fragment,container,false);

        recyclerView=(RecyclerView) view.findViewById(R.id.recycler_connections);
        recyclerView.setHasFixedSize(true);

//        StaggeredGridLayoutManager staggeredGridLayoutManager= new StaggeredGridLayoutManager(getContext(),getActivity().or);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(getContext(),2);
        gridLayoutManager.setReverseLayout(true);

        recyclerView.setLayoutManager(gridLayoutManager);
        chatList= new ArrayList<>();
        chatAdapter = new ChatAdapter(chatList,getActivity());

        recyclerView.setAdapter(chatAdapter);

        return view;

    }
}
