package democooldrawer.android.myapplicationdev.com.p12_mydatabook;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class BioFragment extends Fragment {
    Button btnEdit;
    TextView tv;
    //EditText editText;


    public BioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_bio, container, false);
        btnEdit = (Button)view.findViewById(R.id.btnEdit);
        //editText = (EditText)view.findViewById(R.id.editText);
        tv =(TextView)view.findViewById(R.id.textView);

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout passPhrase =
                        (LinearLayout) inflater.inflate(R.layout.parsephase, null);
                final EditText etPassphrase = (EditText) passPhrase
                        .findViewById(R.id.editTextPassPhrase);
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle("Please Enter")
                        .setView(passPhrase)
                        .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                tv.setText(etPassphrase.getText().toString());
                                Toast.makeText(getActivity(), "You had entered " +
                                        etPassphrase.getText().toString(), Toast.LENGTH_LONG).show();
                            }
                        });
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });
        return view;
    }

}
