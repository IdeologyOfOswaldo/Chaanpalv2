package com.example.danozz.chaanpal;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by dan on 5/10/16.
 */
public class MyDialogFragment4 extends DialogFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final RelativeLayout ll_dialog = (RelativeLayout) inflater.inflate(R.layout.fragment_dialog4,
                container, false);

        getDialog().setTitle("Información sobre un niño");

        Button dismiss = (Button) ll_dialog.findViewById(R.id.btnconfirmardialog4);
        dismiss.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dismiss();
                Toast.makeText(getContext(), R.string.instruction15, Toast.LENGTH_LONG).show();
            }
        });
        return ll_dialog;
    }


}
