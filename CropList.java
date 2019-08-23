package com.example.user.biscuit;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

/**
 * Created by user on 02-01-2019.
 */

public class CropList extends ArrayAdapter<Crop> {

    private Activity context;
    private  List<Crop> cropList;

    public CropList(Activity context, List<Crop> cropList){
        super(context, R.layout.list_layout ,cropList);

        this.context = context;
        this.cropList = cropList;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater= context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.list_layout,null,true);

        TextView textViewF = (TextView)listViewItem.findViewById(R.id.textView11);
        TextView textViewC = (TextView)listViewItem.findViewById(R.id.textView12);
        TextView textViewQ = (TextView)listViewItem.findViewById(R.id.textView13);
        TextView textViewCo = (TextView)listViewItem.findViewById(R.id.textView14);
        TextView textViewM = (TextView)listViewItem.findViewById(R.id.textView15);
        TextView textViewA = (TextView)listViewItem.findViewById(R.id.textView16);

        Crop crop = cropList.get(position);

        textViewF.setText(crop.getFarmer());
        textViewC.setText(crop.getCrop());
        textViewQ.setText(crop.getQuantity());
        textViewCo.setText(crop.getQuantity());
        textViewM.setText(crop.getMobile());
        textViewA.setText(crop.getAddress());


        return listViewItem;


    }
}
