package com.vidi.ai.videoeditor.chromakey;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.vidi.ai.videoeditor.AIProcessor;
import com.vidi.ai.videoeditor.Helper;
import com.vidi.ai.videoeditor.R;
import com.vidi.ai.videoeditor.Ads;
import com.vidi.ai.videoeditor.listvideoandmyvideo.ListVideoAndMyAlbumActivity;

/**
 * ChromaKeyActivity - Professional chroma key (green screen) removal
 * Removes green/blue screen backgrounds for professional compositing
 */
public class ChromaKeyActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private Ads ads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chroma_key);
        
        // Initialize ads
        ads = new Ads();
        FrameLayout native_ad_container = findViewById(R.id.native_ad_container);
        ads.loadNativeAd(ChromaKeyActivity.this, native_ad_container);
        ads.Interstitialload(this);
        
        // Setup toolbar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setTitle("Chroma Key");
        }
        
        toolbar.setNavigationOnClickListener(v -> onBackPressed());
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
