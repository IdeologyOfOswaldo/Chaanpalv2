package com.example.danozz.chaanpal;

import android.support.v4.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import static com.example.danozz.chaanpal.Informationadditional._liaa;

/**
 * Created by dan on 5/10/16.
 */
public class MyDialogFragment extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final LinearLayout ll_dialog = (LinearLayout) inflater.inflate(R.layout.fragment_dialog,
                container, false);

        final CheckBox _c=(CheckBox)ll_dialog.findViewById(R.id.checkBox8);
        final CheckBox _ao=(CheckBox)ll_dialog.findViewById(R.id.checkBox9);
        final CheckBox _go=(CheckBox)ll_dialog.findViewById(R.id.checkBox10);


        getDialog().setTitle("Sintomas");

        Button dismiss = (Button) ll_dialog.findViewById(R.id.btnconfirmardialog);
        dismiss.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(_c.isChecked())
                {
                    _liaa.setSintomasInfeccionUrinaria(_c.getText().toString());
                }if(_ao.isChecked())
                {
                    _liaa.setSintomasInfeccionUrinaria(_ao.getText().toString());
                }if(_go.isChecked())
                {
                    _liaa.setSintomasInfeccionUrinaria(_go.getText().toString());
                }
                if(!_c.isChecked()&&!_ao.isChecked()&&!_go.isChecked())
                {
                    _liaa.setSintomasInfeccionUrinaria("No ha seleccionado algún sintoma especifico de las infecciónes de las vías urinarias");
                }
                dismiss();
            }
        });
        return ll_dialog;
    }


}
