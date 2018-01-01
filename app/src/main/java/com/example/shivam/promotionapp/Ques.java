package com.example.shivam.promotionapp;

/**
 * Created by shivam on 30/12/17.
 */

public class Ques {
    String opt1,opt2,opt3,opt4,correct;
    String ques;
    public Ques(String ques,String opt1,String opt2,String opt3,String opt4,String correct)
    {
        this.opt1=opt1;
        this.opt2=opt2;
        this.opt3=opt3;
        this.opt4=opt4;
        this.ques=ques;
        this.correct=correct;
    }

    public String getOpt1() {
        return opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public String getCorrect() {
        return correct;
    }

    public String getQues() {
        return ques;
    }
}
