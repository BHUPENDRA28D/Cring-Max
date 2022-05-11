package com.example.cringmax;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ViewPager2 viewPager2;
    ArrayList<VedioModle> videos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        viewPager2 =  (ViewPager2) findViewById(R.id.Id_viewpager);
        videos= new ArrayList<>();

        VedioModle ob1 = new VedioModle("https://docjamal.xyz/wp-content/uploads/2020/08/vedio1.mp4","Title","This is a cring vedio to pass time");
                videos.add(ob1);

        VedioModle ob2 = new VedioModle("https://docjamal.xyz/wp-content/uploads/2020/08/vedio2.mp4","Title","This is a cring vedio to pass time");
        videos.add(ob2);

        VedioModle ob3 = new VedioModle("https://docjamal.xyz/wp-content/uploads/2020/08/vedio3.mp4","Title","This is a cring vedio to pass time");
        videos.add(ob3);

        VedioModle ob4 = new VedioModle("https://docjamal.xyz/wp-content/uploads/2020/08/vedio4.mp4","Title","This is a cring vedio to pass time");
        videos.add(ob4);

        VedioModle ob5 = new VedioModle("https://docjamal.xyz/wp-content/uploads/2020/08/vedio5.mp4","Title","This is a cring vedio to pass time");
        videos.add(ob5);

        VedioModle ob6 = new VedioModle("https://docjamal.xyz/wp-content/uploads/2020/08/vedio6.mp4","Title","This is a cring vedio to pass time");
        videos.add(ob6);

        viewPager2.setAdapter(new VedioAdaptor(videos));

    }
}