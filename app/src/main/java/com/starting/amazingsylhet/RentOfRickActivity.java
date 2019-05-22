package com.starting.amazingsylhet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class RentOfRickActivity extends AppCompatActivity {


    ListView listView;
    EditText edtx;
    List list = new ArrayList();
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rent_of_rick);

        edtx = (EditText) findViewById(R.id.edtOne);
        listView = (ListView) findViewById(R.id.lvOne);

        list.add("কোট পয়েন্ট-টিলাগড়->৩০");
        list.add("কোট পয়েন্ট-শিবগঞ্জ->২০");
        list.add("কোট পয়েন্ট-মিরাবাজার->১০");
        list.add("কোট পয়েন্ট-টিলাগড়->৩০");
        list.add("কোট পয়েন্ট-শেখঘাট->১০");
        list.add("কোট পয়েন্ট-রিকাবি বাজার->১৫");
        list.add("কোট পয়েন্ট-বাগবাড়ী->২০");
        list.add("কোট পয়েন্ট-কালীঘাট->১০");
        list.add("শিবগঞ্জ-পাঠানটুলা->৩৫");
        list.add("শিবগঞ্জ-মেডিকেল->৪০");
        list.add("শিবগঞ্জ-মদিনা মার্কেট->৪০");
        list.add("শিবগঞ্জ-আম্বরখানা->২০");
        list.add("জিন্দাবাজার-লামাবাজার->১০");
        list.add("জিন্দাবাজার-শেখঘাট->২০");
        list.add("জিন্দাবাজার-বাগবাড়ি->২০");
        list.add("আম্বরখানা-পাঠানটুলা->১৫");
        list.add("আম্বরখানা-মদিনা মারকেত->৩০");
        list.add("আম্বরখানা-সুবিদবাজার->১০");
        list.add("কীন ব্রীজ-হুমায়ুন চত্তর->৩০");
        list.add("কীন ব্রীজ-গোটাটিকর->২০");
        list.add("কীন ব্রীজ-শিববাড়ি->২০");
        list.add("কীন ব্রীজ-রেলগেট->১০");
        list.add("আম্বরখানা-লাক্কাতুরা->২০");
        list.add("আম্বরখানা-উপশহর->২৫");
        list.add("কীন ব্রীজ-বরইকান্দি->২০");


        adapter = new ArrayAdapter(RentOfRickActivity.this, android.R.layout.simple_list_item_1,list);
        listView.setTextFilterEnabled(true);
        listView.setAdapter(adapter);


        edtx.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                RentOfRickActivity.this.adapter.getFilter().filter(s);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }
}
