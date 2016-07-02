package com.example.danozz.chaanpal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class Informationadditional extends Fragment {

    public static LogicInformationAdditionalAll _liaa;
    private OnFragmentInteractionListener mListener;

    public Informationadditional() {
        // Required empty public constructor
    }

    @Override
    public void onResume() {
        super.onResume();
        _liaa=new LogicInformationAdditionalAll();
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        _liaa=new LogicInformationAdditionalAll();
        // Inflate the layout for this fragment
        final RelativeLayout fl_informationadditional = (RelativeLayout) inflater.inflate(R.layout.fragment_informationadditional,
                container, false);
        final LinearLayout _ll_Information=(LinearLayout)fl_informationadditional.findViewById(R.id.ll_Information);
        final LinearLayout _dangerll=(LinearLayout)fl_informationadditional.findViewById(R.id.dangerll);
        _dangerll.setVisibility(View.INVISIBLE);
        final TextView _t1=(TextView)fl_informationadditional.findViewById(R.id.dato0101);
        final TextView _dato1=(TextView)fl_informationadditional.findViewById(R.id.dato1);
        final TextView _t2=(TextView)fl_informationadditional.findViewById(R.id.dato0102);
        final TextView _dato2=(TextView)fl_informationadditional.findViewById(R.id.dato2);
        final TextView _t3=(TextView)fl_informationadditional.findViewById(R.id.dato0103);
        final TextView _dato3=(TextView)fl_informationadditional.findViewById(R.id.dato3);
        final TextView _t4=(TextView)fl_informationadditional.findViewById(R.id.dato0104);
        final TextView _dato4=(TextView)fl_informationadditional.findViewById(R.id.dato4);

        final TextView _dato5=(TextView)fl_informationadditional.findViewById(R.id.dato5);

        Typeface type = Typeface.createFromAsset(getActivity().getAssets(), "fonts/quicksand-light.otf");

        _dato1.setTypeface(type);
        _dato2.setTypeface(type);
        _dato3.setTypeface(type);
        _dato4.setTypeface(type);
        _t1.setTypeface(type);
        _t2.setTypeface(type);
        _t3.setTypeface(type);
        _t4.setTypeface(type);

        final CheckBox _checkBox=(CheckBox)fl_informationadditional.findViewById(R.id.checkBox);
        final CheckBox _checkBox2=(CheckBox)fl_informationadditional.findViewById(R.id.checkBox2);
        final CheckBox _checkBox3=(CheckBox)fl_informationadditional.findViewById(R.id.checkBox3);
        final ImageView imageView=(ImageView)fl_informationadditional.findViewById(R.id.imgbtnInformation2);
        _checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_checkBox3.isChecked()) {
                    FragmentManager fm = getFragmentManager();
                    MyDialogFragment dialogFragment = new MyDialogFragment();
                    dialogFragment.show(fm, "Sample Fragment");
                }
            }
        });


        final CheckBox _checkBox4=(CheckBox)fl_informationadditional.findViewById(R.id.checkBox4);
        _checkBox4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(_checkBox4.isChecked()) {
                    FragmentManager fm = getFragmentManager();
                    MyDialogFragment2 dialogFragment = new MyDialogFragment2();
                    dialogFragment.show(fm, "Sample Fragment");
                }
            }
        });
        final CheckBox _checkBox5=(CheckBox)fl_informationadditional.findViewById(R.id.checkBox5);
        _checkBox5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(_checkBox5.isChecked()) {
                    FragmentManager fm = getFragmentManager();
                    MyDialogFragment3 dialogFragment = new MyDialogFragment3();
                    dialogFragment.show(fm, "Sample Fragment");
                }
            }
        });
        final CheckBox _checkBox6=(CheckBox)fl_informationadditional.findViewById(R.id.checkBox6);
        final CheckBox _checkBox7=(CheckBox)fl_informationadditional.findViewById(R.id.checkBox7);

        final Button _btnDangerous=(Button)fl_informationadditional.findViewById(R.id.btnDangerous);
        final Button _goLocalization=(Button)fl_informationadditional.findViewById(R.id.btngolocalization);

        _goLocalization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // startActivity(new Intent(getContext(), LocalizationDoctorsMaps.class));
            }
        });
        _btnDangerous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_checkBox.isChecked() || _checkBox2.isChecked() || _checkBox3.isChecked() || _checkBox4.isChecked()
                        || _checkBox5.isChecked() || _checkBox6.isChecked() || _checkBox7.isChecked()) {
                if (_checkBox7.isChecked()) {                }


                _dangerll.setVisibility(View.VISIBLE);
                ScrollView scrollView = (ScrollView) fl_informationadditional.findViewById(R.id.scrollView301);
                scrollView.bringToFront();
                _ll_Information.setVisibility(View.INVISIBLE);

                if (_checkBox5.isChecked()) {
                    if (!_liaa.descIMC().equals("") || !_liaa.descIMC().isEmpty()) {
                        if (_liaa.descIMC().equals("Normal") || _liaa.descIMC().equals("Delgadez aceptable")) {
                            _dato4.setText("Índice de masa coorporal= " + _liaa.descIMC() + "\nIMC= " + _liaa.imc());
                            imageView.setImageResource(R.drawable.ic_danger03);
                            _dato5.setText(R.string.instruction39);

                        }
                        if (_liaa.descIMC().equals("Obeso tipo I") || _liaa.descIMC().equals("Obeso tipo II") || _liaa.descIMC().equals("Obeso tipo III")|| _liaa.descIMC().equals("Delgadez severa")) {
                            _dato4.setText("Índice de masa coorporal= " + _liaa.descIMC() + "\nIMC= " + _liaa.imc());
                            imageView.setImageResource(R.drawable.ic_danger);
                            _dato5.setText(R.string.instruction37);
                        }
                        if (_liaa.descIMC().equals("Preobeso") || _liaa.descIMC().equals("Delgadez moderada") ) {
                            _dato4.setText("Índice de masa coorporal= " + _liaa.descIMC() + "\nIMC= " + _liaa.imc());
                            imageView.setImageResource(R.drawable.ic_danger02);
                            _dato5.setText(R.string.instruction38);
                        }
                    }
                }
                    if (_checkBox7.isChecked()) {
                        _liaa.setSintomas(_checkBox7.getText().toString());
                        imageView.setImageResource(R.drawable.ic_danger03);
                        _dato5.setText(R.string.instruction39);
                    }
                    if (_checkBox6.isChecked()) {
                        _liaa.setSintomas(_checkBox6.getText().toString());
                        imageView.setImageResource(R.drawable.ic_danger03);
                        _dato5.setText(R.string.instruction39);
                    }
                    if (_checkBox5.isChecked()) {
                        imageView.setImageResource(R.drawable.ic_danger03);
                        _dato5.setText(R.string.instruction39);
                    }
                    if (_checkBox4.isChecked()) {
                        _liaa.setSintomas(_checkBox4.getText().toString());
                        imageView.setImageResource(R.drawable.ic_danger03);
                        _dato5.setText(R.string.instruction39);
                    }
                    if (_checkBox3.isChecked()) {
                        _liaa.setSintomas(_checkBox3.getText().toString());
                        imageView.setImageResource(R.drawable.ic_danger02);
                        _dato5.setText(R.string.instruction38);
                    }

                    if (_checkBox2.isChecked()) {
                        _liaa.setSintomas(_checkBox2.getText().toString());
                        imageView.setImageResource(R.drawable.ic_danger);
                        _dato5.setText(R.string.instruction37);
                    }
                    if (_checkBox.isChecked()) {
                        _liaa.setSintomas(_checkBox.getText().toString());
                        imageView.setImageResource(R.drawable.ic_danger);
                        _dato5.setText(R.string.instruction37);
                    }

                    _dato2.setText(_liaa.getSintomas());

                    if (_checkBox3.isChecked()) {
                        if (!_liaa.getSintomasInfeccionUrinaria().equals("") || !_liaa.getSintomasInfeccionUrinaria().isEmpty()) {
                            _dato1.setText(_liaa.getSintomasInfeccionUrinaria());
                        }
                    }
                    if (_checkBox4.isChecked()) {
                        if (_liaa.isTiposanguineocontario()) {
                            _dato3.setText("Debe vacunarse por tener el tipo de sangre contrario");
                            imageView.setImageResource(R.drawable.ic_danger);
                        }
                    }
                    if(_checkBox.isChecked()&&_checkBox2.isChecked()&&_checkBox3.isChecked()&&_checkBox4.isChecked()&&
                            _checkBox5.isChecked()&&  _checkBox6.isChecked()&&_checkBox6.isChecked()){
                        imageView.setImageResource(R.drawable.ic_danger);
                        _dato5.setText(R.string.instruction37);
                    }

            }
            }
        });


        final ImageButton _imgbtnInformation=(ImageButton)fl_informationadditional.findViewById(R.id.imgbtnInformation);

        final Animation _fadein= AnimationUtils.loadAnimation(getContext(), R.anim.fadein);
        final Animation _fadeout= AnimationUtils.loadAnimation(getContext(), R.anim.fadeout);
        _fadein.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                _imgbtnInformation.startAnimation(_fadeout);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        _fadeout.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                _imgbtnInformation.startAnimation(_fadein);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        _imgbtnInformation.startAnimation(_fadein);

        _imgbtnInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentManager fm = getFragmentManager();
                MyDialogFragment6 dialogFragment = new MyDialogFragment6 ();
                dialogFragment.show(fm, "Sample Fragment");

               /* AlertDialog.Builder dialogo1 = new AlertDialog.Builder(getContext());
                dialogo1.setTitle(R.string.instruction17);
                dialogo1.setMessage(R.string.instruction12informationadditional);
                dialogo1.setCancelable(false);
                dialogo1.setPositiveButton(R.string.instruction28informationadditional, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogo1, int id) {

                    }
                });
                dialogo1.show();
                */
            }
        });


        return fl_informationadditional;


    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
