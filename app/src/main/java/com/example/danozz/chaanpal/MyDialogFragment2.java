package com.example.danozz.chaanpal;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import static com.example.danozz.chaanpal.Informationadditional._liaa;

/**
 * Created by dan on 5/10/16.
 */
public class MyDialogFragment2 extends DialogFragment {

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final LinearLayout ll_dialog = (LinearLayout) inflater.inflate(R.layout.fragment_dialog2,
                container, false);

        final CheckBox _c=(CheckBox)ll_dialog.findViewById(R.id.checkBoxtrue);

        Button dismiss = (Button) ll_dialog.findViewById(R.id.btnconfirmardialog2);
        dismiss.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(_c.isChecked())
                {
                    _liaa.setTiposanguineocontario(true);
                }else
                {
                    _liaa.setTiposanguineocontario(false);
                }
                dismiss();
            }
        });
        return ll_dialog;
    }


}
