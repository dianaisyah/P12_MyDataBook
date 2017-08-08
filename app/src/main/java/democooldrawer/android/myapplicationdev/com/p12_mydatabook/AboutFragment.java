package democooldrawer.android.myapplicationdev.com.p12_mydatabook;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {
    
    TextView tvAbout;
    ImageView ivAbout;



    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.aboutfragment, container, false);
        tvAbout = (TextView)view.findViewById(R.id.tvAbout);
        ivAbout = (ImageView)view.findViewById(R.id.iv);
        String url = "https://upload.wikimedia.org/wikipedia/commons/8/80/Republic_Polytechnic_Logo.jpg";
        Picasso.with(view.getContext()).load(url).into(ivAbout);
        return view;
    }

}
