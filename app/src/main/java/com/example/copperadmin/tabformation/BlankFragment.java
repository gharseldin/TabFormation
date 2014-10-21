package com.example.copperadmin.tabformation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.copperadmin.tabformation.R;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 *
 */
public class BlankFragment extends Fragment {

    private static final String POSITION = "position";

    public static BlankFragment newInstance(int i){

        Bundle args = new Bundle();
        args.putInt(POSITION, i);

        BlankFragment fragment = new BlankFragment();
        fragment.setArguments(args);

        return fragment;
    }
    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);

        if(getArguments()!=null) {
                int i = getArguments().getInt(POSITION);
                TextView textView = (TextView) v.findViewById(R.id.blank_test_textView);
                textView.setText("This is page number" + i);
        }
            return v;
    }


}
