package com.example.luismauricio.doodlzz;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class LifecycleFragment extends Fragment {

    private String name = getClass().getSimpleName();

    public LifecycleFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(LifecycleActivity.TAG, "onAttach in fragment: " + name);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LifecycleActivity.TAG, "onCreate in fragment: " + name);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(LifecycleActivity.TAG, "onCreateView in fragment: " + name);
        return null;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(LifecycleActivity.TAG, "onViewCreated in fragment: " + name);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(LifecycleActivity.TAG, "onResume in fragment: " + name);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(LifecycleActivity.TAG, "onPause in fragment: " + name);
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(LifecycleActivity.TAG, "onStop in fragment: " + name);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(LifecycleActivity.TAG, "onDestroyView in fragment: " + name);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LifecycleActivity.TAG, "onDestroy in fragment: " + name);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(LifecycleActivity.TAG, "onDetach in fragment: " + name);
    }
}
