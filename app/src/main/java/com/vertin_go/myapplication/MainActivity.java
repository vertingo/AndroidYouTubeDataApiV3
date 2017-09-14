package com.vertin_go.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> data = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data.add("Partager!");
        data.add("Télécharger!");
        data.add("Mes Zip");
        data.add("Mes Annonces");
        data.add("Mes Bannieres");

        ListView lv = (ListView) findViewById(R.id.listview);
        lv.setAdapter(new MainActivity.MyListAdapter(this, R.layout.list_item, data));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "List item was clicked at " + position, Toast.LENGTH_SHORT).show();

            }
        });



    }

    


    private class MyListAdapter extends ArrayAdapter<String> {
        private int layout;
        private List<String> mObjects;
        private MyListAdapter(Context context, int resource, List<String> objects) {
            super(context, resource, objects);
            mObjects = objects;
            layout = resource;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            MainActivity.ViewHolder mainViewholder = null;
            if(convertView == null) {
                LayoutInflater inflater = LayoutInflater.from(getContext());
                convertView = inflater.inflate(layout, parent, false);
                MainActivity.ViewHolder viewHolder = new MainActivity.ViewHolder();

                viewHolder.button = (Button) convertView.findViewById(R.id.list_item_button);
                viewHolder.thumbnail = (ImageView) convertView.findViewById(R.id.list_item_img);
                viewHolder.title = (TextView) convertView.findViewById(R.id.list_item_text);

                convertView.setTag(viewHolder);
            }
            mainViewholder = (MainActivity.ViewHolder) convertView.getTag();
            mainViewholder.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                  /*  if(position==0)
                    {
                        Intent intent = new Intent(MainActivity.this,
                                PartageActivity.class);
                        String choix="share";
                        intent.putExtra("choix", choix);
                        startActivity(intent);
                    }
                    else if(position==1)
                    {
                        Intent intent = new Intent(MainActivity.this,
                                PartageActivity.class);
                        String choix="download";
                        intent.putExtra("choix", choix);
                        startActivity(intent);

                    }*/

                      Toast.makeText(getContext(), "Button was clicked for list item " + position, Toast.LENGTH_SHORT).show();

                }
            });
            mainViewholder.title.setText(getItem(position));

            return convertView;
        }
    }
    public class ViewHolder {

        ImageView thumbnail;
        TextView title;
        Button button;
    }
}
