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

public class FragmentSix extends Fragment {

    View v6;
    Button b6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v6 = inflater.inflate(R.layout.fragment_six_layout , container, false);

        b6 = (Button) v6.findViewById(R.id.buttonsix);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.visitsylhet.com/places-to-visit/khadimnagar-rainforest"));
                startActivity(browser_intent);
            }
        });

        return v6;
    }
}
