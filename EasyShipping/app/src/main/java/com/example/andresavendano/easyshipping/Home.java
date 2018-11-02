package com.example.andresavendano.easyshipping;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Home extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflaterView=inflater.inflate(R.layout.fragment_home, container, false);
        Button button1 = inflaterView.findViewById(R.id.button);
        Button button2 = inflaterView.findViewById(R.id.button2);
        Button button3 = inflaterView.findViewById(R.id.button3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main2Activity.class);
                startActivityForResult(intent, 0);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main2Activity.class);
                startActivityForResult(intent, 0);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Main2Activity.class);
                startActivityForResult(intent, 0);
            }
        });

        return inflaterView;
    }

}
