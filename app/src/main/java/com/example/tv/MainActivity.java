package com.example.tv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout chi,btv,channel24,rtv,news24,independent, jamona;

    private  String url_channel_chi = "https://rhridoy136.shortcm.li/channeli.m3u8";
    private  String url_channel_btv = "https://rhridoy136.shortcm.li/btvworld.m3u8";
    private  String url_channel_channel24 = "https://rhridoy136.shortcm.li/channel24.m3u8";
    private  String url_channel_rtv = "https://rhridoy136.shortcm.li/rtv.m3u8";
    private  String url_channel_news24 = "https://vidcdn.vidgyor.com/news24-origin/liveabr/news24-origin/live1/playlist.m3u8";
    private  String url_channel_independent = "https://rhridoy136.shortcm.li/independenttv.m3u8";
    private  String url_channel_jamona = "https://rhridoy136.shortcm.li/jamunatv.m3u8";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chi = findViewById(R.id.chi);
        jamona = findViewById(R.id.jamunatv);
        btv = findViewById(R.id.btv);
        channel24 = findViewById(R.id.channel24);
        rtv = findViewById(R.id.rtv);
        news24 = findViewById(R.id.news24);
        independent = findViewById(R.id.indepance);

        chi.setOnClickListener(this);
        jamona.setOnClickListener(this);
        btv.setOnClickListener(this);
        channel24.setOnClickListener(this);
        rtv.setOnClickListener(this);
        news24.setOnClickListener(this);
        independent.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.chi){
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url_channel_chi));
            startActivity(intent);
        }else if (v.getId()==R.id.btv){
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url_channel_btv));
            startActivity(intent);
        }else if (v.getId()==R.id.channel24){
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url_channel_channel24));
            startActivity(intent);
        }else if (v.getId()==R.id.rtv){
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url_channel_rtv));
            startActivity(intent);
        }else if (v.getId()==R.id.news24){
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url_channel_news24));
            startActivity(intent);
        }else if (v.getId()==R.id.indepance){
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url_channel_independent));
            startActivity(intent);
        }else if (v.getId()==R.id.jamunatv){
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse(url_channel_jamona));
            startActivity(intent);
        }

    }
}