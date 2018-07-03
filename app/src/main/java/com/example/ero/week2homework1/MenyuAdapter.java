package com.example.ero.week2homework1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MenyuAdapter extends ArrayAdapter<Menyu> {

    private Context context;
    private List<Menyu> list;
    private int layoutId;

    public MenyuAdapter(@NonNull Context context, int resource, @NonNull List<Menyu> objects) {
        super(context, resource, objects);
        this.context = context;
        this.list = objects;
        this.layoutId = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(context).inflate(layoutId, parent, false);
        }

        final Menyu menyu = list.get(position);
        final ImageView menyuImage = listItem.findViewById(R.id.imageview);
        final TextView menyuTaitle = listItem.findViewById(R.id.title);
        final TextView menyuText = listItem.findViewById(R.id.text);
        final TextView menyuText2 = listItem.findViewById(R.id.kaloria);

        menyuTaitle.setText(menyu.getTitle());
        menyuText.setText(menyu.getText());
        menyuText2.setText(menyu.getKaloria());
        Picasso.get().load(menyu.getImageUrl()).into(menyuImage);
        return listItem;

    }

}
