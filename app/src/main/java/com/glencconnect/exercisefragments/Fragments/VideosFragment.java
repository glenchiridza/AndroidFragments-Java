package com.glencconnect.exercisefragments.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.glencconnect.exercisefragments.Adapters.ChatAdapter;
import com.glencconnect.exercisefragments.Model.Chat;
import com.glencconnect.exercisefragments.R;

import java.util.ArrayList;
import java.util.List;

public class VideosFragment extends Fragment {
    private RecyclerView recyclerView;
    private ChatAdapter chatAdapter;
    private List<Chat> chatList;

    public VideosFragment(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.videos_fragment,container,false);

        recyclerView = view.findViewById(R.id.recycler_videos);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setStackFromEnd(true);
        linearLayoutManager.setReverseLayout(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        chatList = new ArrayList<>();
        chatAdapter = new ChatAdapter(chatList,getActivity());
        recyclerView.setAdapter(chatAdapter);

        return view;
    }
}
