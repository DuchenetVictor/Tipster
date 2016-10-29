package com.tipster.tipster.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.tipster.tipster.Pojo.Tip;
import com.tipster.tipster.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David_tepoche on 29/10/2016.
 */

public class TipsAdapter extends ArrayAdapter<Tip> {
    public TipsAdapter(Context context, ArrayList<Tip> tips) {
        super(context, 0 ,tips );
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        Tip tip = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.singletip, parent, false);
        }

        // Lookup view for data population
        TextView tvtitle = (TextView) convertView.findViewById(R.id.txtvTitle);
        TextView tvdate = (TextView) convertView.findViewById(R.id.txtvDate);
        TextView tvauthor = (TextView) convertView.findViewById(R.id.txtvAuthor);
        TextView tvtip  = (TextView) convertView.findViewById(R.id.txtvTip);

        // Populate the data into the template view using the data object
        tvtitle.setText(tip.getTitle());
        tvdate.setText(tip.getDate());
        tvauthor.setText(tip.getAuthor());
        tvtip.setText(tip.getMessage());

        // Return the completed view to render on screen
        return convertView;
    }

}
