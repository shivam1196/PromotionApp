package com.example.shivam.promotionapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by shivam on 30/12/17.
 */

public class QuestionFragments extends Fragment {
    static int score=0;
    String right;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragmentques,null);
        RadioGroup radioGroup= (RadioGroup)view.findViewById(R.id.radiogrp);
        TextView textView=(TextView)view.findViewById(R.id.txtQues);
        RadioButton radioButton=(RadioButton)view.findViewById(R.id.radioButton1);
        RadioButton radioButton1=(RadioButton)view.findViewById(R.id.radioButton2);
        RadioButton radioButton2=(RadioButton)view.findViewById(R.id.radioButton3);
        RadioButton radioButton3=(RadioButton)view.findViewById(R.id.radioButton4);
        score++;
        String ques = getArguments().getString("ques");
        String opt1=getArguments().getString("opt1");
        String opt2=getArguments().getString("opt2");
        String opt3=getArguments().getString("opt3");
        String opt4=getArguments().getString("opt4");
         right = getArguments().getString("right");
        textView.setText(ques);
        radioButton.setText(opt1);
        radioButton1.setText(opt2);
        radioButton2.setText(opt3);
        radioButton3.setText(opt4);
        RadioGroup radioGroup1=(RadioGroup)view.findViewById(R.id.radiogrp);
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton4 = (RadioButton)view.findViewById(i);
                String correct = radioButton4.getText().toString();
                FragmentManager fragmentManager =getFragmentManager();
                FragmentDailogs.getInstance(right).show(fragmentManager,"Yess");

            }
        });
        return view;
    }
    public static QuestionFragments getInstance(String ques,String opt1,String opt2,String opt3,String opt4,String correct)
    {
        Bundle b = new Bundle();
        b.putString("ques",ques);
        b.putString("opt1",opt1);
        b.putString("opt2",opt2);
        b.putString("opt3",opt3);
        b.putString("opt4",opt4);
        b.putString("right",correct);
        QuestionFragments questionFragments = new QuestionFragments();
        questionFragments.setArguments(b);
        return questionFragments;
    }
    public static int quesScore()
    {
        return score;
    }
}
