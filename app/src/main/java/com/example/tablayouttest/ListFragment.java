package com.example.tablayouttest;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class ListFragment extends Fragment {
    private RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        recyclerView = (RecyclerView) inflater.inflate(R.layout.list_fragment, container, false);
        return recyclerView;
    }


}
