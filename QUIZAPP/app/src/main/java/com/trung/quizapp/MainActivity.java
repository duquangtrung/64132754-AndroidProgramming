package com.trung.quizapp;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawerlayout);

        // Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Drawer setup
        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navigation_view);
        navigationView.setItemIconTintList(null);

        actionBarDrawerToggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar,
                R.string.open, R.string.close
        );
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        // Navigation item click handling
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.nav_share) {
                    shareApp();
                } else if (id == R.id.nav_rate) {
                    rateApp();
                } else if (id == R.id.facebookPage) {
                    openUrl("https://facebook.com/");
                } else if (id == R.id.website) {
                    openUrl("https://example.com/");
                } else if (id == R.id.nav_privacy_policy) {
                    openUrl("https://example.com/privacy");
                } else if (id == R.id.nav_terms_conditions) {
                    openUrl("https://example.com/terms");
                } else if (id == R.id.more) {
                    openUrl("https://play.google.com/store/apps/dev?id=YOUR_DEV_ID");
                }
                drawerLayout.closeDrawers();
                return true;
            }
        });
    }

    // Nút C
    public void onCClicked(View view) {
        Toast.makeText(this, "C Clicked", Toast.LENGTH_SHORT).show();
        // startActivity(new Intent(this, CActivity.class));
    }

    // Nút C++
    public void onCppClicked(View view) {
        Toast.makeText(this, "C++ Clicked", Toast.LENGTH_SHORT).show();
    }

    // Nút Python
    public void onPythonClicked(View view) {
        Toast.makeText(this, "Python Clicked", Toast.LENGTH_SHORT).show();
    }

    // Nút HTML
    public void onHtmlClicked(View view) {
        Toast.makeText(this, "HTML Clicked", Toast.LENGTH_SHORT).show();
    }

    // Nút Kotlin
    public void onKotlinClicked(View view) {
        Toast.makeText(this, "Kotlin Clicked", Toast.LENGTH_SHORT).show();
    }

    // Nút C#
    public void onCSharpClicked(View view) {
        Toast.makeText(this, "C# Clicked", Toast.LENGTH_SHORT).show();
    }

    // Chia sẻ app
    private void shareApp() {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        String shareMessage = "This is the best Quiz App!\n\n";
        shareMessage += "https://play.google.com/store/apps/details?id=" + getPackageName();
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
        startActivity(Intent.createChooser(shareIntent, "Share via"));
    }

    // Đánh giá app
    private void rateApp() {
        Uri uri = Uri.parse("market://details?id=" + getPackageName());
        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                    Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                    Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        }
        try {
            startActivity(goToMarket);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));
        }
    }

    // Mở URL
    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }
}
