package com.example.project1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.example.project1.adapters.VPAdapter;
import com.example.project1.fragments.LicensedFragment;
import com.example.project1.fragments.UnlicensedFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

public class UsersActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    Toolbar toolbar;
    BottomNavigationView bottomNavigationView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users);

        // Initialize ViewPager and TabLayout
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

        // Set up ViewPager and Adapter
        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        vpAdapter.addFragment(new AllFragment(), "All");
        vpAdapter.addFragment(new LicensedFragment(), "Licensed");
        vpAdapter.addFragment(new UnlicensedFragment(), "Unlicensed");
        viewPager.setAdapter(vpAdapter);

        // Set up TabLayout with ViewPager
        tabLayout.setupWithViewPager(viewPager);

        // Set up Toolbar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(
//                UsersActivity.this, drawerLayout, toolbar, R.string.openDrawer, R.string.closeDrawer
//        );
//
//        drawerLayout.addDrawerListener(toggle);
//
//        toggle.syncState();
//
//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//                                                             @Override
//                                                             public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//                                                                 int id = item.getItemId();
//
//                                                                 if (id == R.id.home) {
//                                                                     drawerLayout.closeDrawer(GravityCompat.START);
//                                                                 } else if (id == R.id.users) {
//                                                                     startActivity(new Intent(UsersActivity.this, UsersActivity.class));
//                                                                 } else if (id == R.id.billing) {
//                                                                     startActivity(new Intent(UsersActivity.this, BillingActivity.class));
//                                                                 } else if (id == R.id.groups) {
//                                                                     startActivity(new Intent(UsersActivity.this, GroupsActivity.class));
//                                                                 } else if (id == R.id.health) {
//                                                                     startActivity(new Intent(UsersActivity.this, HealthActivity.class));
//                                                                 }
//
//                                                                 else if (id==R.id.support) {
//                                                                     startActivity(new Intent(UsersActivity.this, SupportActivity.class));
//                                                                 }
//
//                                                                 else if (id==R.id.mailbox) {
//                                                                     startActivity(new Intent(UsersActivity.this, MailboxRegistrationActivity.class));
//                                                                 }
//
//                                                                 else if (id==R.id.resources) {
//                                                                     startActivity(new Intent(UsersActivity.this, ResourcesActivity.class));
//                                                                 }
//
//                                                                 else {
//                                                                     startActivity(new Intent(UsersActivity.this, AdminCenterActivity.class));
//                                                                 }
//
//                                                                 drawerLayout.closeDrawer(GravityCompat.START);
//                                                                 return true;
//
//                                                             }
//                                                         });
//        // Set up BottomNavigationView
//        bottomNavigationView = findViewById(R.id.bottomNavigationView);
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                int itemId = item.getItemId();
//
//                if (itemId == R.id.home) {
//                    startActivity(new Intent(UsersActivity.this, MainActivity.class));
//                } else if (itemId == R.id.search) {
//                    startActivity(new Intent(UsersActivity.this, BillingActivity.class));
//                } else {
//                    startActivity(new Intent(UsersActivity.this, HealthActivity.class));
//                }
//                return false;
//            }
//        });
    }

//    private void loadFragment(Fragment fragment) {
//        FragmentManager fm = getSupportFragmentManager();
//        FragmentTransaction ft = fm.beginTransaction();
//        ft.replace(R.id.frameLayout, fragment);
//        ft.addToBackStack(null); // Optional: Add fragment to the back stack
//        ft.commit();
//    }

    public void onLinearLayoutClick(View view) {
        // This method will be called when the LinearLayout is clicked
        startActivity(new Intent(UsersActivity.this, UserDetail.class));
    }
}
