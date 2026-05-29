package com.example.appfragment.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.appfragment.fragments.DivisionFragment;
import com.example.appfragment.fragments.MultiplicacionFragment;
import com.example.appfragment.fragments.RestaFragment;
import com.example.appfragment.fragments.SumaFragment;

public class DashboardPagerAdapter extends FragmentStateAdapter {
    public DashboardPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        //En este punto se hace necesario el BACKEND (JAVA) de cada fragmento
        switch (position){
            case 0: return new SumaFragment();
            case 1: return new RestaFragment();
            case 2: return new MultiplicacionFragment();
            default: return new DivisionFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
