package cn.edu.gdpt.xxgcx.topline170000hwh.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cn.edu.gdpt.xxgcx.topline170000hwh.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CountFragment extends Fragment {


    public CountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_count, container, false);
    }

}
