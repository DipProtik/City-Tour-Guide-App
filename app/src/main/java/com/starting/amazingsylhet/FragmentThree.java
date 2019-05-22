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

public class FragmentThree extends Fragment {

    View v3;
    Button b3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v3 = inflater.inflate(R.layout.fragment_three_layout , container, false);

        b3 = (Button) v3.findViewById(R.id.buttonthree);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.visitsylhet.com/places-to-visit/luvachora"));
                startActivity(browser_intent);
            }
        });

        return v3;
    }
}
