package com.slavce.tabsapplication;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    String position;
    TextView tvTitle;

    public FirstFragment() {
        // Required empty public constructor
    }


    public static FirstFragment newInstance(String position) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString("EXTRA_POSITION", position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
           position = getArguments().getString("EXTRA_POSITION");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        tvTitle = view.findViewById(R.id.tvTitle);

        tvTitle.setText(position);

        super.onViewCreated(view, savedInstanceState);
    }
}