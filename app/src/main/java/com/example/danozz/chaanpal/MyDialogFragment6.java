package com.example.danozz.chaanpal;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by dan on 5/10/16.
 */
public class MyDialogFragment6 extends DialogFragment {

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final RelativeLayout ll_dialog = (RelativeLayout) inflater.inflate(R.layout.fragment_dialog6,
                container, false);
        Typeface type = Typeface.createFromAsset(getActivity().getAssets(), "fonts/quicksand-light.otf");
        final TextView _tvInstruction1=(TextView)ll_dialog.findViewById(R.id.lbldialog6);
        final TextView _tvInstruction2=(TextView)ll_dialog.findViewById(R.id.lbldialog602);
        _tvInstruction1.setTypeface(type);
        _tvInstruction2.setTypeface(type);
        Button dismiss = (Button) ll_dialog.findViewById(R.id.btnconfirmardialog6);
        dismiss.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                dismiss();
            }
        });
        return ll_dialog;
    }


}
