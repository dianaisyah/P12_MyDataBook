package democooldrawer.android.myapplicationdev.com.p12_mydatabook;


import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class NoteFrag extends Fragment {


    public NoteFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {





        View view = inflater.inflate(R.layout.fragment_note, container,false);

        LinearLayout passPhrase = (LinearLayout)inflater.inflate(R.layout.passnote, null);
        final EditText etPassphrase = (EditText)passPhrase.findViewById(R.id.editTextPassPhrase);

        AlertDialog.Builder builder = new AlertDialog.Builder(NoteFrag.super.getContext());
        builder.setTitle("Please Enter")
                .setView(passPhrase)
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Toast.makeText(NoteFrag.super.getContext(), "You had entered " +
                                etPassphrase.getText().toString(), Toast.LENGTH_LONG).show();
                    }
                });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

        return view;
    }

}
