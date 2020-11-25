package com.example.lighting.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.example.lighting.R;

public class ledmenu extends Fragment {
    Button btn;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View v = inflater.inflate(R.layout.fragment_ledmenu, container, false);
        // Inflate the layout for this fragment

        return v;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //theme01버튼 클릭
        view.findViewById(R.id.button_theme01).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //아래 두줄 액션 만들어서 수정하기
                NavHostFragment.findNavController(com.example.lighting.fragment.ledmenu.this)
                        .navigate(R.id.action_ledmenu_to_onoff);
            }
        });

        //theme02버튼 클릭
        view.findViewById(R.id.button_theme02).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //아래 두줄 액션 만들어서 수정하기
                NavHostFragment.findNavController(com.example.lighting.fragment.ledmenu.this)
                        .navigate(R.id.action_ledmenu_to_onoff);
            }
        });

        //theme03버튼 클릭
        view.findViewById(R.id.button_theme03).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //아래 두줄 액션 만들어서 수정하기
                NavHostFragment.findNavController(com.example.lighting.fragment.ledmenu.this)
                        .navigate(R.id.action_ledmenu_to_onoff);
            }
        });

        //theme04버튼 클릭
        view.findViewById(R.id.button_theme04).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //아래 두줄 액션 만들어서 수정하기
                NavHostFragment.findNavController(com.example.lighting.fragment.ledmenu.this)
                        .navigate(R.id.action_ledmenu_to_onoff);
            }
        });

        //theme05버튼 클릭
        view.findViewById(R.id.button_theme05).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //아래 두줄 액션 만들어서 수정하기
                NavHostFragment.findNavController(com.example.lighting.fragment.ledmenu.this)
                        .navigate(R.id.action_ledmenu_to_onoff);
            }
        });

        //theme06버튼 클릭
        view.findViewById(R.id.button_theme06).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //아래 두줄 액션 만들어서 수정하기
                NavHostFragment.findNavController(com.example.lighting.fragment.ledmenu.this)
                        .navigate(R.id.action_ledmenu_to_onoff);
            }
        });

        //theme07버튼 클릭
        view.findViewById(R.id.button_theme07).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //아래 두줄 액션 만들어서 수정하기
                NavHostFragment.findNavController(com.example.lighting.fragment.ledmenu.this)
                        .navigate(R.id.action_ledmenu_to_onoff);
            }
        });
        btn = view.findViewById(R.id.btn_setting);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate((R.id.action_ledmenu_to_setting));
            }
        });

        view.findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_ledmenu_to_color_add);
            }
        });

    }
}