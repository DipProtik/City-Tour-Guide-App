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

public class FragmentFive extends Fragment {

    View v5;
    Button b5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v5 = inflater.inflate(R.layout.fragment_five_layout , container, false);

        b5 = (Button) v5.findViewById(R.id.buttonfive);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.visitsylhet.com/places-to-visit/ratargul"));
                startActivity(browser_intent);
            }
        });

        return v5;
    }
}
