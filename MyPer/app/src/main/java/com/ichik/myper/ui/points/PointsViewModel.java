package com.ichik.myper.ui.points;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PointsViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public PointsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Points fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

