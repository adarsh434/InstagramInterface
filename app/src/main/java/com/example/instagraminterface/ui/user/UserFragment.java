package com.example.instagraminterface.ui.user;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.instagraminterface.R;
import com.example.instagraminterface.databinding.FragmentDashboardBinding;
import com.example.instagraminterface.databinding.FragmentUserBinding;
import com.example.instagraminterface.ui.search.SearchViewModel;


public class UserFragment extends Fragment {

    private UserViewModel userViewModel;
    private FragmentUserBinding binding;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        userViewModel = new ViewModelProvider(this).get(UserViewModel.class);


        binding = FragmentUserBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final TextView textView = binding.user;
        userViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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