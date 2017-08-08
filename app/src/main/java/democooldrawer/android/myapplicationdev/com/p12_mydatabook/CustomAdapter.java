package democooldrawer.android.myapplicationdev.com.p12_mydatabook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 15017591 on 8/8/2017.
 */

public class CustomAdapter extends ArrayAdapter<String> {
    private ArrayList<String> items;
    private Context context;
    private TextView tvTitle;
    private ImageView iv;

    public CustomAdapter(Context context, int resource, ArrayList<String> objects){
        super(context, resource, objects);
        // Store the food that is passed to this adapter
        items = objects;
        // Store Context object as we would need to use it later
        this.context = context;
    }

    // getView() is the method ListView will call to get the
    //  View object every time ListView needs a row
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // The usual way to get the LayoutInflater object to
        //  "inflate" the XML file into a View object
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        // "Inflate" the row.xml as the layout for the View object
        View rowView = inflater.inflate(R.layout.row, parent, false);

        // Get the TextView object
        tvTitle = (TextView) rowView.findViewById(R.id.tvTitle);
        // Get the ImageView object
        iv = (ImageView) rowView.findViewById(R.id.imageView);


        // The parameter "position" is the index of the
        //  row ListView is requesting.
        //  We get back the food at the same index.
        String currentC = items.get(position);
        // Set the TextView to show the food

        tvTitle.setText(currentC);
        // Set the image to star or nostar accordingly

        if (currentC == "Bio"){
            iv.setImageResource(R.drawable.bio);
        } else if (currentC == "Vaccination"){
            
        }
        // Return the nicely done up View to the ListView
        return rowView;
    }

}
