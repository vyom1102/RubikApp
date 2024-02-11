package com.example.project1.fragments;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

//import com.example.project1.adapters.UserAdapter;

import com.example.project1.R;
import com.example.project1.adapters.UserAdapter;
import com.example.project1.domain.User;
import com.example.project1.services.UserService;

import java.util.ArrayList;
import java.util.List;

public class LicensedFragment extends Fragment {
//    private List<AllFragment.UserItem> licensedUsers;
//    private RecyclerView recyclerView;

//    public LicensedFragment(List<AllFragment.UserItem> licensedUsers) {
//        this.licensedUsers = licensedUsers;
//    }
//
//    public LicensedFragment() {
//
//    }

//    private List<User> licensedUsers;
//
//    public LicensedFragment() {
//        // Required empty public constructor
//    }
//
//    public static LicensedFragment newInstance() {
//        return new LicensedFragment();
//    }

    private RecyclerView recyclerView;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_licensed, container,false);
//        recyclerView = view.findViewById(R.id.recyclerView);

//        UserAdapter adapter = new UserAdapter(licensedUsers);
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

//        recyclerView = view.findViewById(R.id.recyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

//        correct code line
        List<User> userList = UserService.getUserByLicence("Licensed");

//        userList.add(new User("User 1", "User1@webtel.in", "Unlicensed"));
//        userList.add(new User("User 2", "User2@webtel.in", "Licensed"));
//        userList.add(new User("User 3", "User3@webtel.in", "Unlicensed"));

//        UserAdapter userAdapter = new UserAdapter(userList);
//        recyclerView.setAdapter(userAdapter);


//        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//
//        // Get all licensed users from the UserService
//        licensedUsers = UserService.getUserByLicence("Licensed");
//
//        // Use the licensed user list to populate the RecyclerView
//        UserAdapter userAdapter = new UserAdapter(licensedUsers);
//        recyclerView.setAdapter(userAdapter);

        return view;
    }
}
