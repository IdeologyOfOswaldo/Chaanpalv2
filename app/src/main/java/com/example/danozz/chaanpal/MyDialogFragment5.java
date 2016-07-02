package com.example.danozz.chaanpal;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by dan on 5/10/16.
 */
public class MyDialogFragment5 extends DialogFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final RelativeLayout ll_dialog = (RelativeLayout) inflater.inflate(R.layout.fragment_dialog5,
                container, false);

        getDialog().setTitle("Información sobre una niña");

        Button dismiss = (Button) ll_dialog.findViewById(R.id.btnconfirmardialog5);
        dismiss.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return ll_dialog;
    }


}
