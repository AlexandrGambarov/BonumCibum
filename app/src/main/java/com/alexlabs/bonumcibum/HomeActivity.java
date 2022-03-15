package com.alexlabs.bonumcibum;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    ListView listView;

    // Recipes

    String[] mTitle = {"Lasagna"};
    String[] mDescription = {" "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        listView = findViewById(R.id.recipes);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    startActivity(new Intent(HomeActivity.this, Lasagna.class));
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String[] rTitle;
        String[] rDescription;

        MyAdapter(Context c, String[] title, String[] description) {
            super(c, R.layout.row, R.id.tv_Main, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            TextView myTitle = row.findViewById(R.id.tv_Main);
            TextView myDescription = row.findViewById(R.id.tv_Sub);
            //Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/council.otf");

            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);
            //myTitle.setTypeface(myFont);
            //myDescription.setTypeface(myFont);

            return row;
        }
    }
}