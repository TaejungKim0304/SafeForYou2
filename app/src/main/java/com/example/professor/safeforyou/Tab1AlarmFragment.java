package com.example.professor.safeforyou;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by professor on 2017-05-17.
 */

public class Tab1AlarmFragment extends Fragment {
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tab1_alarm, container, false);

        return view;

    }
}
