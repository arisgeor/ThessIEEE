package com.example.aristos.thessieee;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Aristos on 7/17/2017.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    private int tColorResourceId;

    public ItemAdapter(Activity context, ArrayList<Item> items, int colorResourceId) {
        super(context, 0, items);
        tColorResourceId = colorResourceId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the object located at this position in the list
        Item currentItem = getItem(position);

        //1st TextView (pronunciation)
        TextView pronunciationTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        pronunciationTextView.setText(currentItem.getName());

        //2nd TextView (translation)
        TextView translationTextView = (TextView) listItemView.findViewById(R.id.ability_text_view);
        translationTextView.setText(currentItem.getAbility());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        //same, but for images
        if (currentItem.hasImage()) {
            imageView.setImageResource(currentItem.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        //different colors for each category
        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), tColorResourceId);
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
