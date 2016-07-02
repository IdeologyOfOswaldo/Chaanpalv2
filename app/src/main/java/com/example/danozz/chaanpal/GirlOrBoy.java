package com.example.danozz.chaanpal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class GirlOrBoy extends Fragment {

    private String[] items;
    private View view;
    final String _s="Niño";
    private OnFragmentInteractionListener mListener;
    Matriz m;
    public GirlOrBoy() {
        // Required empty public constructor
        m = new Matriz();
        m.Insertar();
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final RelativeLayout lL_baby = (RelativeLayout) inflater.inflate(R.layout.fragment_girlorboy,
                container, false);

        final LinearLayout _ll=(LinearLayout)lL_baby.findViewById(R.id.lL_girlorboy);
        final FrameLayout _b=(FrameLayout)lL_baby.findViewById(R.id.fl_boy);
        final FrameLayout _g=(FrameLayout)lL_baby.findViewById(R.id.fl_girl);
        _b.setVisibility(View.INVISIBLE);
        _g.setVisibility(View.INVISIBLE);

        Typeface type = Typeface.createFromAsset(getActivity().getAssets(), "fonts/quicksand-bold.otf");
        final RadioButton _rbTrue=(RadioButton)lL_baby.findViewById(R.id.radioButton);
        final RadioButton _rbFalse=(RadioButton)lL_baby.findViewById(R.id.radioButton2);
        _rbFalse.setChecked(true);
        final Button _btnMoreInf=(Button)lL_baby.findViewById(R.id.btnMoreinformation);
        _btnMoreInf.setVisibility(View.INVISIBLE);

        final Spinner _selectorMonth=(Spinner)lL_baby.findViewById(R.id.spinner);
        final Spinner _selectorAge=(Spinner)lL_baby.findViewById(R.id.spinner2);
        final FloatingActionButton fabgirlorboy = (FloatingActionButton)lL_baby.findViewById(R.id.fabgirlorboy);


        final TextView tvSelectMonth=(TextView)lL_baby.findViewById(R.id.tvSelectMonth);
        final TextView tvSelectAge=(TextView)lL_baby.findViewById(R.id.tvSelectAge);
        final TextView tvWhatAge=(TextView)lL_baby.findViewById(R.id.tvWhatAge);
        ArrayAdapter spinnerArrayAdapter = new ArrayAdapter(getContext(),R.layout.my_spinner_style,getResources().getStringArray(R.array.spinnerMonth));
        ArrayAdapter spinnerArrayAdapter2 = new ArrayAdapter(getContext(), R.layout.my_spinner_style,getResources().getStringArray(R.array.spinnerAge));
        _selectorMonth.setAdapter(spinnerArrayAdapter);
        _selectorAge.setAdapter(spinnerArrayAdapter2);
        tvSelectMonth.setTypeface(type);
        tvSelectAge.setTypeface(type);
        tvWhatAge.setTypeface(type);
        _rbTrue.setTypeface(type);
        _btnMoreInf.setTypeface(type);
        _rbFalse.setTypeface(type);
        _btnMoreInf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(_b.getVisibility()==View.VISIBLE) {

                    FragmentManager fm = getFragmentManager();
                    MyDialogFragment4 dialogFragment = new MyDialogFragment4 ();
                    dialogFragment.show(fm, "Sample Fragment");


                   /* AlertDialog.Builder dialogo1 = new AlertDialog.Builder(getContext());
                    dialogo1.setTitle(R.string.instruction17);
                    dialogo1.setMessage(R.string.instruction26additionalboy);
                    dialogo1.setCancelable(false);
                    dialogo1.setPositiveButton(R.string.instruction28informationadditional, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {

                        }
                    });
                    dialogo1.show();*/
                }
                else {

                    FragmentManager fm = getFragmentManager();
                    MyDialogFragment5 dialogFragment = new MyDialogFragment5 ();
                    dialogFragment.show(fm, "Sample Fragment");
                    /*AlertDialog.Builder dialogo1 = new AlertDialog.Builder(getContext());
                    dialogo1.setTitle(R.string.instruction17);
                    dialogo1.setMessage(R.string.instruction26additionalgirl);
                    dialogo1.setCancelable(false);
                    dialogo1.setPositiveButton(R.string.instruction28informationadditional, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {

                        }
                    });
                    dialogo1.show();*/
                }
            }
        });
        fabgirlorboy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (_ll.getVisibility() == View.VISIBLE)
                {
                    if (_selectorMonth.getSelectedItemPosition() == 0 || _selectorAge.getSelectedItemPosition() == 0 || !_rbTrue.isChecked() && !_rbFalse.isChecked()) {
                        Toast.makeText(getContext(), "¡ES NECESARIO LLENAR TODOS LOS CAMPOS!", Toast.LENGTH_LONG).show();
                    } else {

                        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(getContext());
                        dialogo1.setTitle(R.string.instruction17);
                        dialogo1.setMessage(R.string.instruction18);
                        dialogo1.setCancelable(false);
                        dialogo1.setPositiveButton(R.string.instruction19, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogo1, int id) {
                                int f = _selectorMonth.getSelectedItemPosition() - 1;
                                int c;
                                if (!_rbTrue.isChecked()) {
                                    c = _selectorAge.getSelectedItemPosition() - 1;
                                } else {
                                    c = _selectorAge.getSelectedItemPosition();
                                }
                                if (m.Algo(f, c) == _s) {
                                    Toast.makeText(getContext(), R.string.instruction15, Toast.LENGTH_LONG).show();
                                    lL_baby.setBackgroundResource(R.drawable.background_boy);
                                    _ll.setVisibility(View.INVISIBLE);
                                    _b.setVisibility(View.VISIBLE);
                                    _btnMoreInf.setVisibility(View.VISIBLE);
                                    _btnMoreInf.setBackgroundResource(R.drawable.background_boy);
                                    FragmentManager fm = getFragmentManager();
                                    MyDialogFragment4 dialogFragment = new MyDialogFragment4 ();
                                    dialogFragment.show(fm, "Sample Fragment");

                                } else {
                                    Toast.makeText(getContext(), R.string.instruction16, Toast.LENGTH_LONG).show();
                                    _btnMoreInf.setBackgroundResource(R.drawable.background_girl);
                                    lL_baby.setBackgroundResource(R.drawable.background_girl);
                                    _g.setVisibility(View.VISIBLE);
                                    _ll.setVisibility(View.INVISIBLE);
                                    _btnMoreInf.setVisibility(View.VISIBLE);
                                    FragmentManager fm = getFragmentManager();
                                    MyDialogFragment5 dialogFragment = new MyDialogFragment5 ();
                                    dialogFragment.show(fm, "Sample Fragment");

                                }
                                fabgirlorboy.setImageResource(R.drawable.ic_return);
                            }
                        });
                        dialogo1.setNegativeButton(R.string.instruction20, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogo1, int id) {
                                Toast.makeText(getContext(), R.string.instruction21, Toast.LENGTH_LONG).show();
                            }
                        });
                        dialogo1.show();



                    }
            }else
                {
                    if(_g.getVisibility()==View.VISIBLE)
                    {
                        _g.setVisibility(View.INVISIBLE);
                        _btnMoreInf.setVisibility(View.INVISIBLE);

                    }else if(_b.getVisibility()==View.VISIBLE)
                    {
                        _b.setVisibility(View.INVISIBLE);
                        _btnMoreInf.setVisibility(View.INVISIBLE);
                    }
                    _ll.setVisibility(View.VISIBLE);
                    if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
                        lL_baby.setBackgroundResource(R.drawable.imgbackgroundlandscape);
                    }else {
                        lL_baby.setBackgroundResource(R.drawable.imgbackground);
                    }
                    fabgirlorboy.setImageResource(R.drawable.ic_next);
                }
            }
        });

        return lL_baby;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void
    onButtonPressed(Uri uri) {
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
