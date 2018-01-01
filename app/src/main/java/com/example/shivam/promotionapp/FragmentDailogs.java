package com.example.shivam.promotionapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * Created by shivam on 31/12/17.
 */

public class FragmentDailogs extends DialogFragment {
    String text;
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View v = LayoutInflater.from(getActivity()).inflate(R.layout.dialogs,null);
        TextView textView = (TextView)v.findViewById(R.id.textView4);
        text=getArguments().getString("text");
        textView.setText(text);
        return new AlertDialog.Builder(getContext()).setView(v).setTitle("Answer is").setPositiveButton("Got It", null).create();
    }
   public static FragmentDailogs getInstance(String text)
   {
       Bundle b = new Bundle();
       b.putString("text",text);
       FragmentDailogs fragmentDailogs = new FragmentDailogs();
       fragmentDailogs.setArguments(b);
       return fragmentDailogs;
   }

}
