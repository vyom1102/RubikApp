package com.example.project1;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity{
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    BottomNavigationView bottomNavigationView;
    FrameLayout frameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FrameLayout container = findViewById(R.id.container);
//
//        // Example: Load the layout of a different activity dynamically
//        int layoutResId = R.layout.activity_groups; // Replace with the desired layout
//        loadContentLayout(layoutResId, container);


        FrameLayout container = findViewById(R.id.container);
        // Load the initial content layout
        loadContentLayout(R.layout.content_main);

        Button[] quickActions =new Button[4];

        quickActions[0] = findViewById(R.id.resetPassword);
        quickActions[1] = findViewById(R.id.assignLicense);
        quickActions[2] = findViewById(R.id.addUser);
        quickActions[3] = findViewById(R.id.addUserToGroup);

        for (Button b : quickActions) {
            b.setOnClickListener(view -> {
                // Get the text of the clicked button
                String buttonText = b.getText().toString();
                // Use a switch statement to determine which button was clicked
                switch (buttonText) {
                    case "Reset Password":
                        startActivity(new Intent(MainActivity.this, ResetPassword.class));
                        break;
                    case "Assign License":
                        startActivity(new Intent(MainActivity.this, AssignLicense.class));
                        break;
                    case "Add user":
                        startActivity(new Intent(MainActivity.this, ResetPassword.class));
                        break;
                    case "Add user to group":
                        startActivity(new Intent(MainActivity.this, AssignLicense.class));
                        break;
                }
            });
        }

//        Button resetPassword= findViewById(R.id.resetPassword);
//        Button assignLicense= findViewById(R.id.assignLicense);
//        Button addUser= findViewById(R.id.addUser);
//        Button addUserToGroup= findViewById(R.id.addUserToGroup);

//        for(Button b: quickActions){
//            b.setOnClickListener(view -> {
//                String quickActionText = b.getText().toString();
//                Toast.makeText(MainActivity.this, quickActionText, Toast.LENGTH_SHORT).show();
//            });
//        }

//        resetPassword.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent= new Intent(MainActivity.this, ResetPassword.class);
//                startActivity(intent);
////                finish();
//            }
//        });
//
//        assignLicense.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent= new Intent(MainActivity.this, AssignLicense.class);
//                startActivity(intent);
//            }
//        });
//
//        addUser.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent= new Intent(MainActivity.this, ResetPassword.class);
//                startActivity(intent);
//            }
//        });
//
//        addUserToGroup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent= new Intent(MainActivity.this, ResetPassword.class);
//                startActivity(intent);
//            }
//        });

//        resetPassword.setOnClickListener(view ->
//                Toast.makeText(MainActivity.this, "Button Clicked1", Toast.LENGTH_SHORT).show()
//                );

//        assignLicense.setOnClickListener(view ->
//                Toast.makeText(MainActivity.this, "Button Clicked2", Toast.LENGTH_SHORT).show()
//                );
//
//        addUser.setOnClickListener(view ->
//                Toast.makeText(MainActivity.this, "Button Clicked3", Toast.LENGTH_SHORT).show()
//                );
//
//        addUserToGroup.setOnClickListener(view ->
//                Toast.makeText(MainActivity.this, "Button Clicked4", Toast.LENGTH_SHORT).show()
//                );

        //        for(Button b: quickLinks){
//            b.setOnClickListener(view -> {
//                String buttonText = b.getText().toString();
//                Toast.makeText(MainActivity.this, buttonText, Toast.LENGTH_SHORT).show();
//            });
//        }

        Button[] quickLinks =new Button[6];

        quickLinks[0] = findViewById(R.id.usersButton);
        quickLinks[1] = findViewById(R.id.groupsButton);
        quickLinks[2] = findViewById(R.id.billingButton);
        quickLinks[3] = findViewById(R.id.settingsButton);
        quickLinks[4] = findViewById(R.id.themeButton);
//        quickLinks[5] = findViewById(R.id.languageButton);
        quickLinks[5] = findViewById(R.id.supportButton);

        for (Button b : quickLinks) {
            b.setOnClickListener(view -> {
                String buttonText = b.getText().toString();

                switch (buttonText) {
                    case "Users":
                        startActivity(new Intent(MainActivity.this, UsersActivity.class));
                        break;
                    case "Groups":
                        // Start the GroupsActivity
                        startActivity(new Intent(MainActivity.this, GroupsActivity.class));
                        break;
                    case "Billing":
                        // Start the BillingActivity
                        startActivity(new Intent(MainActivity.this, BillingActivity.class));
                        break;
                    case "Settings":
                        // Start the BillingActivity
                        startActivity(new Intent(MainActivity.this, BillingActivity.class));
                        break;
                    case "Theme":
                        // Start the BillingActivity
                        startActivity(new Intent(MainActivity.this, BillingActivity.class));
                        break;
//                    case "Language":
//                        // Start the BillingActivity
//                        startActivity(new Intent(MainActivity.this, LanguageActivity.class));
//                        break;
                    case "Support":
                        // Start the BillingActivity
                        startActivity(new Intent(MainActivity.this, BillingActivity.class));
                        break;
                    // Add cases for other buttons as needed
                }
            });
        }


//        Button[] drawer_menu =new Button[9];
//
//        drawer_menu[0] = findViewById(R.id.home);
//        drawer_menu[1] = findViewById(R.id.users);
//        drawer_menu[2] = findViewById(R.id.billing);
//        drawer_menu[3] = findViewById(R.id.groups);
//
//        drawer_menu[3] = findViewById(R.id.settingsButton);
//        drawer_menu[4] = findViewById(R.id.themeButton);
//        drawer_menu[5] = findViewById(R.id.languageButton);
//        drawer_menu[6] = findViewById(R.id.supportButton);
//
//        for (Button b : quickLinks) {
//            b.setOnClickListener(view -> {
//                String buttonText = b.getText().toString();
//
//                switch (buttonText) {
//                    case "Users":
//                        startActivity(new Intent(MainActivity.this, UsersActivity.class));
//                        break;
//                    case "Groups":
//                        // Start the GroupsActivity
//                        startActivity(new Intent(MainActivity.this, GroupsActivity.class));
//                        break;
//                    case "Billing":
//                        // Start the BillingActivity
//                        startActivity(new Intent(MainActivity.this, BillingActivity.class));
//                        break;
//                    case "Settings":
//                        // Start the BillingActivity
//                        startActivity(new Intent(MainActivity.this, BillingActivity.class));
//                        break;
//                    case "Theme":
//                        // Start the BillingActivity
//                        startActivity(new Intent(MainActivity.this, BillingActivity.class));
//                        break;
//                    case "Language":
//                        // Start the BillingActivity
//                        startActivity(new Intent(MainActivity.this, BillingActivity.class));
//                        break;
//                    case "Support":
//                        // Start the BillingActivity
//                        startActivity(new Intent(MainActivity.this, BillingActivity.class));
//                        break;
//                    // Add cases for other buttons as needed
//                }
//            });
//        }


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigationView);
        toolbar = findViewById(R.id.toolbar);
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
        @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item){


            int itemId = item.getItemId();

            if(itemId == R.id.home){
                startActivity(new Intent(MainActivity.this, UsersActivity.class));

//                loadFragment(new HomeFragment());
            }

            else if(itemId == R.id.search){
                startActivity(new Intent(MainActivity.this, UsersActivity.class));
//                loadFragment(new SearchFragment());
            }
            else{
                startActivity(new Intent(MainActivity.this, HealthActivity.class));
//                loadFragment(new HealthFragment());
            }

            return false;
            }

            private void loadFragment(Fragment fragment) {

                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.frameLayout, fragment);
                ft.add(R.id.container , fragment);
                ft.commit();
            }
        });

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.openDrawer, R.string.closeDrawer
        );

        drawerLayout.addDrawerListener(toggle);

        toggle.syncState(); // for syncing the states of drawer i.e. open or closed

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id= item.getItemId();

                if(id==R.id.home){
                    drawerLayout.closeDrawer(GravityCompat.START);
                }

                else if (id==R.id.users) {
                    startActivity(new Intent(MainActivity.this, UsersActivity.class));
                }

                else if (id==R.id.billing) {
                    startActivity(new Intent(MainActivity.this, BillingActivity.class));
                }

                else if (id==R.id.groups) {
                    startActivity(new Intent(MainActivity.this, GroupsActivity.class));
                }

                else if (id==R.id.health) {
                    startActivity(new Intent(MainActivity.this, HealthActivity.class));
                }

                else if (id==R.id.support) {
                    startActivity(new Intent(MainActivity.this, SupportActivity.class));
                }

                else if (id==R.id.mailbox) {
                    startActivity(new Intent(MainActivity.this, MailboxRegistrationActivity.class));
                }

                else if (id==R.id.resources) {
                    startActivity(new Intent(MainActivity.this, ResourcesActivity.class));
                }

                else{
                    startActivity(new Intent(MainActivity.this, AdminCenterActivity.class));
                }

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;

            }
        }
        );

    }

//    private void loadContentLayout(int layoutResId, FrameLayout container) {
//        // Inflate the specified layout and replace the content
//        View newContentView = LayoutInflater.from(this).inflate(layoutResId, container, false);
//        container.removeAllViews();
//        container.addView(newContentView);
//    }

    private void loadContentLayout(int layoutResId) {
        // Inflate the specified layout and replace the content
        View newContentView = getLayoutInflater().inflate(layoutResId, null);
        FrameLayout container = findViewById(R.id.container);
        container.removeAllViews();
        container.addView(newContentView);
    }
}