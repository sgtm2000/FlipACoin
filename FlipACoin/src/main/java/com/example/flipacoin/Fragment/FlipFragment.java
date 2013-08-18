package com.example.flipacoin.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.flipacoin.R;

/**
 * Created by Munu on 8/11/13.
 */
public class FlipFragment extends Fragment{
    private Integer headVisibility = View.INVISIBLE;
    private Integer tailVisibility = View.INVISIBLE;
    private Integer clearBtnVisibility = View.INVISIBLE;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.main_fragment, container, false);
        initializeViews(view);
        final Button coinflipBtn = (Button) view.findViewById(R.id.coinflipButton);
        coinflipBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        flipCoin();
                    }
                }
        );

        final View clearBtn = view.findViewById(R.id.clearButton);
        clearBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        clear();
                    }
                }
        );
        return view;
    }

    public void flipCoin(){
        ImageView head = (ImageView) getView().findViewById(R.id.headPic);
        ImageView tail = (ImageView) getView().findViewById(R.id.tailPic);
        double coinStatus = Math.random();

        if (coinStatus <= 0.5){
            tailVisibility = View.INVISIBLE;
            headVisibility = View.VISIBLE;
        }
        else{
            tailVisibility = View.VISIBLE;
            headVisibility = View.INVISIBLE;
        }

        tail.setVisibility(tailVisibility);
        head.setVisibility(headVisibility);

        Button clearButton = (Button) getView().findViewById(R.id.clearButton);
        clearBtnVisibility = View.VISIBLE;
        clearButton.setVisibility(clearBtnVisibility);
    }

    public void clear(){
        ImageView head = (ImageView) getView().findViewById(R.id.headPic);
        ImageView tail = (ImageView) getView().findViewById(R.id.tailPic);

        tailVisibility = View.INVISIBLE;
        headVisibility = View.INVISIBLE;

        head.setVisibility(headVisibility);
        tail.setVisibility(tailVisibility);

        Button clearButton = (Button) getView().findViewById(R.id.clearButton);
        clearBtnVisibility = View.INVISIBLE;
        clearButton.setVisibility(clearBtnVisibility);
    }

    private void initializeViews(View view){
        ImageView head = (ImageView) view.findViewById(R.id.headPic);
        ImageView tail = (ImageView) view.findViewById(R.id.tailPic);
        Button clearButton = (Button) view.findViewById(R.id.clearButton);

        head.setVisibility(headVisibility);
        tail.setVisibility(tailVisibility);
        clearButton.setVisibility(clearBtnVisibility);
    }
}
