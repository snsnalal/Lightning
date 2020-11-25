package com.example.lighting.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.lighting.R;

public class onoff extends Fragment {

    public byte[] sendByte = new byte[5];

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_onoff, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //on버튼 클릭 시 led메뉴들 화면으로 전환
        view.findViewById(R.id.button_on).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(com.example.lighting.fragment.onoff.this)
                        .navigate(R.id.action_onoff_to_ledmenu);
            }
        });

        //off버튼 클릭 시 led 꺼짐 액션 수행
        view.findViewById(R.id.button_off).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
            //아래 두줄 꺼짐 액션 만들어서 수정하기
                NavHostFragment.findNavController(onoff.this)
                        .navigate(R.id.action_onoff_to_ledmenu);
                 */
            }

        });
    }
}