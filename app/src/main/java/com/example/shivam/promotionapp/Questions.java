package com.example.shivam.promotionapp;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Questions extends AppCompatActivity {
    ViewPager mViewPager;
    Button mButton;
    List<Ques> mQues = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        mButton=(Button)findViewById(R.id.btnSubmit);
        mButton.setText("Submit");
        mButton.setVisibility(View.GONE);
        Ques ques = new Ques("Q1) What are you planning to do this \n new year?","a) Sleep","b) Get motivated and plan on studying","c) start with option b) and then eventually \nrealise option a) is better!","d) Wait when did this year get over?","Seriously me too");
        mQues.add(ques);
        Ques ques1 = new Ques("Q2) The best thing happened to you \nthis year was-","a) Game of thrones","b) Seriously Game of thrones!","c) I havent watched Game of thrones so, \nanything bollywood!","d) Do I really have to answer these questions?","Come on there were Dragons and Queens and zombies and Kings, what else do you need?");
        mQues.add(ques1);
        Ques ques2 = new Ques("Q3) If Ram had three apples and \nShyam had two, what is the mass of sun, \ngiven that every new year both eat all the \napples!","a) The mass of the sun is 1.989 × 10^30 kg","b) Wait that escalated quickly","c) I didn't make a \"son\" yet , get it ( ͡° ͜ʖ ͡°) ","d) So they celebrate new year by eating apples,\n guessing sun's mass? sweet!","3) An apple a day keeps the sun's mass in check hey (Rhymed)");
        mQues.add(ques2);
        Ques ques3 = new Ques("Q4) From 1 to 10 how do you rate the coming new year!","a) 10","b) avogadro's number","c) The mass of sun I just calculated","d) it doesn't matter does it?","Rate Rate Rate!!");
        mQues.add(ques3);
        Ques ques4 = new Ques("Q5) Got a plan on 31st?","a) Yeah netflix and chill!","b) Party!!!!","c) I dont know, probably the regular stuff.","d) I have a list of exactly 100 items that \nI want to do, and a 101 that would probably get cancelled!","okay so what's you Plan B?");
        mQues.add(ques4);
        mViewPager=(ViewPager)findViewById(R.id.viewPager);
        FragmentManager fragmentManager = getSupportFragmentManager();
        mViewPager.setAdapter(new FragmentStatePagerAdapter(fragmentManager) {
            @Override
            public Fragment getItem(int position) {
                String ques,opt1,opt2,opt3,opt4,correct;
                Ques ques2= mQues.get(position);
                int sc= QuestionFragments.quesScore();
                if(sc == 4)
                {
                    mButton.setVisibility(View.VISIBLE);
                }
                return QuestionFragments.getInstance(ques2.getQues(),ques2.getOpt1(),ques2.getOpt2(),ques2.getOpt3(),ques2.getOpt4(),ques2.getCorrect());
            }


            @Override
            public int getCount() {
                return mQues.size();
            }
        });

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Finish.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
