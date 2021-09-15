package com.example.instagraminterface.ui.user;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UserViewModel extends ViewModel {
    private MutableLiveData<String> user;

    public UserViewModel() {
        user = new MutableLiveData<>();
        user.setValue("This is User fragment");
    }
    public LiveData<String> getText() {
        return user;
    }
}
