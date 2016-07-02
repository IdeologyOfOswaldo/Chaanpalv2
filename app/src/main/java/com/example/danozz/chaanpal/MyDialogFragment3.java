package com.example.danozz.chaanpal;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import static com.example.danozz.chaanpal.Informationadditional._liaa;


/**
 * Created by dan on 5/10/16.
 */
public class MyDialogFragment3 extends DialogFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final LinearLayout ll_dialog = (LinearLayout) inflater.inflate(R.layout.fragment_dialog3,
                container, false);

        final EditText _p=(EditText)ll_dialog.findViewById(R.id.editText);
        final EditText _e=(EditText)ll_dialog.findViewById(R.id.editText2);
        Button dismiss = (Button) ll_dialog.findViewById(R.id.btnconfirmardialog3);
        dismiss.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!_p.getText().toString().isEmpty()&&!_e.getText().toString().isEmpty()) {
                    Double _pe = Double.parseDouble(_p.getText().toString());
                    Double _est = Double.parseDouble(_e.getText().toString());
                    _liaa.setPeso(_pe);
                    _liaa.setEstatura(_est);
                    dismiss();
                }
            }
        });
        return ll_dialog;
    }


}
