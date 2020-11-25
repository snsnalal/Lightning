package com.example.lighting.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.example.lighting.MainActivity;
import com.example.lighting.R;

public class ono extends Fragment {
    Button btn_on;
    Button btn_off;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_onoff, container, false);
        btn_on = (Button) v.findViewById(R.id.button_on);
        btn_off = (Button) v.findViewById(R.id.button_off);

        return v;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //on버튼 클릭 시 led메뉴들 화면으로 전환
        view.findViewById(R.id.button_on).setOnClickListener(v -> {
            ((MainActivity) getActivity()).bluetoothOn();
            ((MainActivity) getActivity()).listPairedDevices();
            Navigation.findNavController(view).navigate(R.id.action_onoff_to_ledmenu);
        });
        //off버튼 클릭 시 led 꺼짐 액션 수행
        view.findViewById(R.id.button_off).setOnClickListener(v -> {
            //아래 두줄 꺼짐 액션 만들어서 수정하기
            ((MainActivity) getActivity()).bluetoothOff();
            NavHostFragment.findNavController(ono.this).navigate(R.id.action_onoff_to_ledmenu);
        });
    }
}