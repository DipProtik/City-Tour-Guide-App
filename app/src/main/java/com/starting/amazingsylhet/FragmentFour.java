package com.starting.amazingsylhet;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Protik on 11/20/2017.
 */

public class FragmentFour extends Fragment {

    View v4;
    Button b4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v4 = inflater.inflate(R.layout.fragment_four_layout , container, false);

        b4 = (Button) v4.findViewById(R.id.buttonfour);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.visitsylhet.com/places-to-visit/jaflong"));
                startActivity(browser_intent);
            }
        });

        return v4;
    }
}
