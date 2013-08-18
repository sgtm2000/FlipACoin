package com.example.flipacoin.Activity;

import android.app.Fragment;
import android.os.Bundle;
import android.app.Activity;

import com.example.flipacoin.Fragment.FlipFragment;
import com.example.flipacoin.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Fragment existingFragment = getFragmentManager().findFragmentById(R.id.content_frame);
        if (existingFragment == null )
        {
            getFragmentManager().beginTransaction()
                    .replace(R.id.content_frame, new FlipFragment())
                    .commit();
        }
    }



//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main_fragment, menu);
//        return true;
//    }

//    public void flipCoin(View view){
//        ImageView head = (ImageView) findViewById(R.id.headPic);
//        ImageView tail = (ImageView) findViewById(R.id.tailPic);
//        double coinStatus = Math.random();
//
//        if (coinStatus <= 0.5){
//            tail.setVisibility(View.INVISIBLE);
//            head.setVisibility(View.VISIBLE);
//        }
//        else{
//            head.setVisibility(View.INVISIBLE);
//            tail.setVisibility(View.VISIBLE);
//        }
//
//        Button clearButton = (Button) findViewById(R.id.clearButton);
//        clearButton.setVisibility(View.VISIBLE);
//    }
//
//    public void clear(View view){
//        ImageView head = (ImageView) findViewById(R.id.headPic);
//        ImageView tail = (ImageView) findViewById(R.id.tailPic);
//        head.setVisibility(View.INVISIBLE);
//        tail.setVisibility(View.INVISIBLE);
//
//        Button clearButton = (Button) findViewById(R.id.clearButton);
//        clearButton.setVisibility(View.INVISIBLE);
//    }
    
}
