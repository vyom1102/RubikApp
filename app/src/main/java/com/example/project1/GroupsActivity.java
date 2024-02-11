package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GroupsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups);
    }
}


//package com.example.project1;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.MenuItem;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.ActionBarDrawerToggle;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
//import androidx.core.view.GravityCompat;
//import androidx.drawerlayout.widget.DrawerLayout;
//
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//import com.google.android.material.navigation.NavigationView;
//
//public class GroupsActivity extends AppCompatActivity {
//
//    DrawerLayout drawerLayout;
//    NavigationView navigationView;
//    BottomNavigationView bottomNavigationView;
//    Toolbar toolbar;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_groups);
//
//        drawerLayout = findViewById(R.id.drawer_layout);
//        navigationView = findViewById(R.id.navigationView);
//        toolbar = findViewById(R.id.toolbar);
//        bottomNavigationView = findViewById(R.id.bottomNavigationView);
//
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                int itemId = item.getItemId();
//
//                if (itemId == R.id.home) {
//                    startActivity(new Intent(GroupsActivity.this, UsersActivity.class));
//                } else if (itemId == R.id.search) {
//                    startActivity(new Intent(GroupsActivity.this, UsersActivity.class));
//                } else {
//                    startActivity(new Intent(GroupsActivity.this, HealthActivity.class));
//                }
//
//                return false;
//            }
//        });
//
//        // This line should be outside the OnNavigationItemSelectedListener
//        setSupportActionBar(toolbar);
//
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawerLayout, toolbar, R.string.openDrawer, R.string.closeDrawer
//        );
//
//        drawerLayout.addDrawerListener(toggle);
//        toggle.syncState(); // for syncing the states of the drawer i.e., open or closed
//
//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//
//                int id = item.getItemId();
//
//                if (id == R.id.home) {
//                    drawerLayout.closeDrawer(GravityCompat.START);
//                } else if (id == R.id.users) {
//                    startActivity(new Intent(GroupsActivity.this, UsersActivity.class));
//                } else if (id == R.id.billing) {
//                    startActivity(new Intent(GroupsActivity.this, BillingActivity.class));
//                } else if (id == R.id.groups) {
//                    // You are already in the GroupsActivity, so no need to start it again
//                    drawerLayout.closeDrawer(GravityCompat.START);
//                    return true;
//                } else if (id == R.id.health) {
//                    startActivity(new Intent(GroupsActivity.this, HealthActivity.class));
//                } else if (id == R.id.support) {
//                    startActivity(new Intent(GroupsActivity.this, SupportActivity.class));
//                } else if (id == R.id.mailbox) {
//                    startActivity(new Intent(GroupsActivity.this, MailboxRegistrationActivity.class));
//                } else if (id == R.id.resources) {
//                    startActivity(new Intent(GroupsActivity.this, ResourcesActivity.class));
//                } else {
//                    startActivity(new Intent(GroupsActivity.this, AdminCenterActivity.class));
//                }
//
//                drawerLayout.closeDrawer(GravityCompat.START);
//                return true;
//            }
//        });
//    }
//}
//
//
////package com.example.project1;
////
////import androidx.annotation.NonNull;
////import androidx.appcompat.app.ActionBarDrawerToggle;
////import androidx.appcompat.app.AppCompatActivity;
////import androidx.appcompat.widget.Toolbar;
////import androidx.core.view.GravityCompat;
////import androidx.drawerlayout.widget.DrawerLayout;
////
////import android.content.Intent;
////import android.os.Bundle;
////import android.view.MenuItem;
////
////import com.google.android.material.bottomnavigation.BottomNavigationView;
////import com.google.android.material.navigation.NavigationView;
////
////public class GroupsActivity extends AppCompatActivity {
////
////    DrawerLayout drawerLayout;
////    NavigationView navigationView;
////    BottomNavigationView bottomNavigationView;
////    Toolbar toolbar;
////
////    @Override
////    protected void onCreate(Bundle savedInstanceState) {
////        super.onCreate(savedInstanceState);
////        setContentView(R.layout.activity_groups);
////
////
////        drawerLayout = findViewById(R.id.drawer_layout);
////        navigationView = findViewById(R.id.navigationView);
////        toolbar = findViewById(R.id.toolbar);
////        bottomNavigationView = findViewById(R.id.bottomNavigationView);
////
////        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
////            @Override
////            public boolean onNavigationItemSelected(@NonNull MenuItem item){
////
////
////                int itemId = item.getItemId();
////
////                if(itemId == R.id.home){
////                    startActivity(new Intent(GroupsActivity.this, UsersActivity.class));
////
//////                loadFragment(new HomeFragment());
////                }
////
////                else if(itemId == R.id.search){
////                    startActivity(new Intent(GroupsActivity.this, UsersActivity.class));
//////                loadFragment(new SearchFragment());
////                }
////                else{
////                    startActivity(new Intent(GroupsActivity.this, HealthActivity.class));
//////                loadFragment(new HealthFragment());
////                }
////
////                return false;
////            }
////
////            setSupportActionBar(toolbar);
////
////            ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(
////                    this, drawerLayout, toolbar, R.string.openDrawer, R.string.closeDrawer
////            );
////
////        drawerLayout.addDrawerListener(toggle);
////
////        toggle.syncState(); // for syncing the states of drawer i.e. open or closed
////
////        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
////                @Override
////                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
////
////                    int id= item.getItemId();
////
////                    if(id==R.id.home){
////                        drawerLayout.closeDrawer(GravityCompat.START);
////                    }
////
////                    else if (id==R.id.users) {
////                        startActivity(new Intent(GroupsActivity.this, UsersActivity.class));
////                    }
////
////                    else if (id==R.id.billing) {
////                        startActivity(new Intent(GroupsActivity.this, BillingActivity.class));
////                    }
////
////                    else if (id==R.id.groups) {
////                        startActivity(new Intent(GroupsActivity.this, GroupsActivity.class));
////                    }
////
////                    else if (id==R.id.health) {
////                        startActivity(new Intent(GroupsActivity.this, HealthActivity.class));
////                    }
////
////                    else if (id==R.id.support) {
////                        startActivity(new Intent(GroupsActivity.this, SupportActivity.class));
////                    }
////
////                    else if (id==R.id.mailbox) {
////                        startActivity(new Intent(GroupsActivity.this, MailboxRegistrationActivity.class));
////                    }
////
////                    else if (id==R.id.resources) {
////                        startActivity(new Intent(GroupsActivity.this, ResourcesActivity.class));
////                    }
////
////                    else{
////                        startActivity(new Intent(GroupsActivity.this, AdminCenterActivity.class));
////                    }
////
////                    drawerLayout.closeDrawer(GravityCompat.START);
////                    return true;
////
////                }
////            }
////        }
////        );
////
////    }
////}