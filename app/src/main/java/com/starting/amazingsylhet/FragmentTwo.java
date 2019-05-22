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
 * Created by Protik on 11/16/2017.
 */

public class FragmentTwo extends Fragment {

    View v2;
    Button b2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v2 = inflater.inflate(R.layout.fragment_two_layout , container, false);

        b2 = (Button) v2.findViewById(R.id.buttonthree);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.visitsylhet.com/places-to-visit/pangthumai"));
                startActivity(browser_intent);
            }
        });

        return v2;
    }
}
