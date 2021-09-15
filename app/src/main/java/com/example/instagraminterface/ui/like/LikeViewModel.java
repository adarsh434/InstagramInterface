package com.example.instagraminterface.ui.like;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LikeViewModel extends ViewModel {
    private MutableLiveData<String> like;

    public LikeViewModel() {
        like = new MutableLiveData<>();
        like.setValue("This is Like fragment");
    }

    public LiveData<String> getText() {
        return like;
    }
}
