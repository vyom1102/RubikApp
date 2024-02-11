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

import java.util.List;

public class UnlicensedFragment extends Fragment {
//    private List<AllFragment.UserItem> unlicensedUsers;
//    private RecyclerView recyclerView;
//
//    public UnlicensedFragment(List<AllFragment.UserItem> unlicensedUsers) {
//        this.unlicensedUsers = unlicensedUsers;
//    }
//
//    public UnlicensedFragment() {
//
//    }


    private List<User> unlicensedUsers;

    public UnlicensedFragment() {
        // Required empty public constructor
    }

    public static UnlicensedFragment newInstance() {
        return new UnlicensedFragment();
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_unlicensed, container, false);
//        recyclerView = view.findViewById(R.id.recyclerViewUnlicensed);

//        UserAdapter adapter = new UserAdapter(unlicensedUsers);
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

//        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//
//        // Get all unlicensed users from the UserService
//        List<User> userList = UserService.getUserByLicence("Unlicensed");
//
//        // Use the unlicensed user list to populate the RecyclerView
//        UserAdapter userAdapter = new UserAdapter(unlicensedUsers);
//        recyclerView.setAdapter(userAdapter);

        return view;
    }
}


//package com.example.project1;
//
//import android.annotation.SuppressLint;
//import android.os.Bundle;
//
//import androidx.fragment.app.Fragment;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//
//import java.util.List;
//
//public class UnlicensedFragment extends Fragment {
//
//    private List<AllFragment.UserItem> unlicensedUsers;
//    private RecyclerView recyclerView;
//    private AllFragment.UserAdapter adapter;
//
//    public UnlicensedFragment(List<AllFragment.UserItem> unlicensedUsers) {
//        this.unlicensedUsers = unlicensedUsers;
//    }
//
//    public UnlicensedFragment() {
//
//    }
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_unlicensed, container, false);
//        recyclerView = view.findViewById(R.id.recyclerView);
//
//        // Create and set up the adapter
//        adapter = new AllFragment.UserAdapter(unlicensedUsers);
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//
//        return view;
//    }
//}
