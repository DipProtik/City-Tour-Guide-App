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

public class FragmentOne extends Fragment {

    View v1;
    Button b1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v1 = inflater.inflate(R.layout.fragment_one_layout , container, false);

        b1 = (Button) v1.findViewById(R.id.buttonthree);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browser_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.visitsylhet.com/places-to-visit/bisnakandi"));
                startActivity(browser_intent);
            }
        });

        return v1;
    }
}
