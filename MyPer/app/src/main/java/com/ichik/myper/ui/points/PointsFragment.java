package com.ichik.myper.ui.points;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.ichik.myper.R;

public class PointsFragment extends Fragment {

    private PointsViewModel pointsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pointsViewModel =
                ViewModelProviders.of(this).get(PointsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_points, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        pointsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
