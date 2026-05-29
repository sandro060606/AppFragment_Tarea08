package com.example.appfragment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.appfragment.R;

public class SumaFragment extends Fragment {

    //Constructor
    public SumaFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Asociar el fragment con el XML
        return inflater.inflate(R.layout.fragment_suma, container, false);
    }

}
