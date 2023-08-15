package com.example.m3group59l2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {

    int count = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btn_minus = requireActivity().findViewById(R.id.btn_minus);
        Button btn_plus = requireActivity().findViewById(R.id.btn_plus);
        TextView textView = requireActivity().findViewById(R.id.text_view);

        btn_plus.setOnClickListener(View -> {
            count++;
            textView.setText(String.valueOf(count));
        });
        btn_minus.setOnClickListener(View -> {
            count--;
            textView.setText(String.valueOf(count));
        });
    }
}