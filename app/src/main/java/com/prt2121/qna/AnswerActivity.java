package com.prt2121.qna;

import android.os.Bundle;


public class AnswerActivity extends BaseGlassActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new TuggableView(this, R.layout.activity_answer));
    }

}
