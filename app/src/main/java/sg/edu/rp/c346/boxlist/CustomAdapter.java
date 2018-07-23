package sg.edu.rp.c346.boxlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16019829 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<BoxListItem> boxList;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<BoxListItem> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        boxList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Obtain the LayoutInflater object.
        LayoutInflater inflater = (LayoutInflater) parent_context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        ImageView ivImpt = rowView.findViewById(R.id.imageView);

        // Obtain the property values from the Data Class object
        // and set them to the corresponding UI elements.
        BoxListItem currentItem = boxList.get(position);

        if (currentItem.isFirstbox()) {
            ivImpt.setImageResource(R.drawable.blue_box);
        }
        else if (currentItem.isSecondbox()) {
            ivImpt.setImageResource(R.drawable.orange_box);
        }
        else {
            ivImpt.setImageResource(R.drawable.brown_box);
        }


        // Return the View corresponding to the data at the specified position.
        return rowView;
    }
}
