package com.example.danozz.chaanpal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnFragmentInteractionListener} interface
 * to handle interaction events.
 */
public class LocalizationDoctors extends Fragment {
    ImageView _iv_localizationdoorclose=null;
    ImageView _iv_localizationdooropen=null;

    private OnFragmentInteractionListener mListener;
    public LocalizationDoctors() {
        // Required empty public constructor
    }

    @Override
    public void onResume() {
        super.onResume();
        _iv_localizationdoorclose.setVisibility(View.VISIBLE);
        _iv_localizationdooropen.setVisibility(View.INVISIBLE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final FrameLayout fl_localization_doctors = (FrameLayout) inflater.inflate(R.layout.fragment_localization_doctors,
                container, false);
        final Animation _fadein= AnimationUtils.loadAnimation(getContext(), R.anim.fadein);
        final Animation _fadeout= AnimationUtils.loadAnimation(getContext(), R.anim.fadeout);
        final Animation _fadeout2= AnimationUtils.loadAnimation(getContext(), R.anim.fadeout);

        _iv_localizationdoorclose=(ImageView)fl_localization_doctors.findViewById(R.id.iv_localizationdoorclose);
        _iv_localizationdooropen=(ImageView)fl_localization_doctors.findViewById(R.id.iv_localizationdooropen);
        _iv_localizationdooropen.setVisibility(View.INVISIBLE);
        _fadein.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
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
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        _iv_localizationdoorclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _iv_localizationdoorclose.setVisibility(View.INVISIBLE);
                _iv_localizationdooropen.setVisibility(View.VISIBLE);
                _iv_localizationdooropen.startAnimation(_fadeout);
            //    startActivity(new Intent(getContext(), LocalizationDoctorsMaps.class));
            }
        });

        _iv_localizationdoorclose.startAnimation(_fadein);
        return fl_localization_doctors;



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
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
