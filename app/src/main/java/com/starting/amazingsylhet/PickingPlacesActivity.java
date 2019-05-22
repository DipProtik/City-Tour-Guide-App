package com.starting.amazingsylhet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlacePicker;

public class PickingPlacesActivity extends AppCompatActivity {

    int PLACE_PICKER_REQUEST = 1;
    TextView tv1,tv2,tv3,tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picking_places);

        tv1 = (TextView) findViewById(R.id.textView8);
        tv2 = (TextView) findViewById(R.id.textView9);
        tv3 = (TextView) findViewById(R.id.textView10);
        tv4 = (TextView) findViewById(R.id.textView11);


    }

    public void hellosympho(View view){

        Toast.makeText(getApplicationContext(),"Wait a while..",Toast.LENGTH_LONG).show();

        PlacePicker.IntentBuilder builder = new PlacePicker.IntentBuilder();
        try {
            startActivityForResult(builder.build(PickingPlacesActivity.this),PLACE_PICKER_REQUEST);
        }catch (GooglePlayServicesRepairableException e){
            e.printStackTrace();
        }catch (GooglePlayServicesNotAvailableException e){
            e.printStackTrace();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){

        if(requestCode == PLACE_PICKER_REQUEST){
            if(resultCode == RESULT_OK){

                Place place = PlacePicker.getPlace(PickingPlacesActivity.this, data);
                tv2.setText(place.getAddress());
                tv3.setText(place.getPhoneNumber());
                tv1.setText(place.getName());
//                tv3.setText((CharSequence) place.getWebsiteUri());
//                tv4.setText((CharSequence) place.getPlaceTypes().toString());
                tv4.setText((CharSequence)place.getWebsiteUri().toString());
            }
        }
    }
}
