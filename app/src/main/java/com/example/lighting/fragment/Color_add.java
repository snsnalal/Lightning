package com.example.lighting.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lighting.R;
import com.larswerkman.holocolorpicker.ColorPicker;

import org.w3c.dom.Text;

import app.akexorcist.bluetotohspp.library.BluetoothSPP;

public class Color_add extends Fragment {
    ColorPicker picker;
    String color;
    TextView txt;
    TextView txt2;
    TextView txt4;
    Button btn;
    private BluetoothSPP bt;
    Button Con_btn;
    public Color_add() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_color_add, container, false);

        picker = (ColorPicker)v.findViewById(R.id.picker);
        txt = (TextView)v.findViewById(R.id.Color_text);
        txt2 = (TextView)v.findViewById(R.id.num_text);
        txt4 = (TextView)v.findViewById(R.id.textView);
        TextView txt3 = (TextView)v.findViewById(R.id.textView4);
        btn = (Button)v.findViewById(R.id.button);
        SeekBar sb = (SeekBar)v.findViewById(R.id.seekBar);
        RadioGroup r4 = (RadioGroup)v.findViewById(R.id.radiogroup);
        RadioButton r1 = (RadioButton)v.findViewById(R.id.번호1);
        RadioButton r2 = (RadioButton)v.findViewById(R.id.번호2);
        RadioButton r3 = (RadioButton)v.findViewById(R.id.번호3);
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txt3.setText(Integer.toHexString(seekBar.getProgress()));
                txt4.setText(Integer.toHexString(seekBar.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                txt3.setText(Integer.toHexString(seekBar.getProgress()));
                txt4.setText(Integer.toHexString(seekBar.getProgress()));
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                txt3.setText(Integer.toHexString(seekBar.getProgress()));
                txt4.setText(Integer.toHexString(seekBar.getProgress()));
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //bt.send(Integer.toHexString(picker.getColor()), true);
                if(r1.isChecked())
                {
                    String a = Integer.toHexString(picker.getColor());
                    txt.setText(a.substring(2));

                    txt2.setText("1번");
                    r1.setChecked(false);
                }
                else if(r2.isChecked())
                {
                    String a = Integer.toHexString(picker.getColor());
                    txt.setText(a.substring(2));
                    txt2.setText("2번");
                    r2.setChecked(false);
                }else if(r3.isChecked())
                {
                    String a = Integer.toHexString(picker.getColor());
                    txt.setText(a.substring(2));
                    txt2.setText("3번");
                    r3.setChecked(false);
                }
                else
                {
                    Toast.makeText(getActivity().getApplicationContext()
                            , "체크해주세요"
                            , Toast.LENGTH_SHORT).show();


                }

            }
        });

        return v;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}