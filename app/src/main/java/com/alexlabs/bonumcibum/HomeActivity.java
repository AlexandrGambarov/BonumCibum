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

/**
 * В HomeActivity содержится список рецептов
 * @author AlexLabs
 */

public class HomeActivity extends AppCompatActivity {

    ListView listView;

    // Recipes

    String[] mTitle = {"Lasagna", "Tom yum"};
    String[] mDescription = {" ", " "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /**
         * Метод закрепления режима экрана (Вертикальный)
         */
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
                if (position == 1) {
                    startActivity(new Intent(HomeActivity.this, TomYum.class));
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String[] rTitle;
        String[] rDescription;

        /**
         * Конструктор класса MyAdapter
         * @param c интерфейс доступа к функциям операционной системы Android
         * @param title первая строка ряда row
         * @param description вторая строка ряда row
         */
        MyAdapter(Context c, String[] title, String[] description) {
            super(c, R.layout.row, R.id.tv_Main, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
        }

        /**
         * Создание ряда в списке рецептов
         * @param position позиция ряда в ListView
         * @return Ряд
         */
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            /**
             * Выбор row.xml в качестве ряда
             * Создание переменных myTitle и myDescription типа TextView, в которых будут хранится первая и вторая строка ряда
             */
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            TextView myTitle = row.findViewById(R.id.tv_Main);
            TextView myDescription = row.findViewById(R.id.tv_Sub);
            //Typeface myFont = Typeface.createFromAsset(getAssets(), "fonts/council.otf");

            /**
             * Присвоение myTitle значения в соответствии с позицией элемента
             * Присвоение myDescription значения в соответствии с позицией элемента
             */
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);
            //myTitle.setTypeface(myFont);
            //myDescription.setTypeface(myFont);

            return row;
        }
    }
}