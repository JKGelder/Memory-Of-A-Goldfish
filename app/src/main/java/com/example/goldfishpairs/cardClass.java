package com.example.goldfishpairs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class cardClass {

    boolean showingBack;
    ImageView front;
    ImageView back;
    int id;


    public cardClass(boolean showingBack, ImageView front, ImageView back, int id) {
        this.showingBack = showingBack;
        this.front = front;
        this.back = back;
        this.id = id;
    }

    public boolean isShowingBack() {
        return showingBack;
    }

    public ImageView getFront() {
        return front;
    }

    public ImageView getBack() {
        return back;
    }

    public int id() {
        return id;
    }
}