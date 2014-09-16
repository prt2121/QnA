package com.prt2121.qna;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.glass.media.Sounds;


public class QuestionActivity extends BaseGlassActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new TuggableView(this, R.layout.activity_question));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.question, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_answer) {
            startActivity(new Intent(this, AnswerActivity.class));
            return true;
        } else if (id == R.id.action_view_answers) {
            startActivity(new Intent(this, PreviousAnswersActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    protected boolean onTap() {
        openOptionsMenu();
        AudioManager am = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        am.playSoundEffect(Sounds.TAP);
        return false;
    }
}
