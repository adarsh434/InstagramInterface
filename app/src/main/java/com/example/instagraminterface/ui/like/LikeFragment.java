package com.example.instagraminterface.ui.like;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.instagraminterface.databinding.FragmentLikeBinding;

public class LikeFragment extends Fragment {

    private LikeViewModel likeViewModel;
    private FragmentLikeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        likeViewModel = new ViewModelProvider(this).get(LikeViewModel.class);

        binding = FragmentLikeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.like;
        likeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}