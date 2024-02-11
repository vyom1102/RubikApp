package com.example.project1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project1.adapters.UserAdapter;
import com.example.project1.domain.User;
import com.example.project1.services.UserService;

import java.util.ArrayList;
import java.util.List;

public class AllFragment extends Fragment {

//    private List<UserItem> userList;
    private RecyclerView recyclerView;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_all, container, false);
//        recyclerView = view.findViewById(R.id.recyclerView);
//
//        // Create and initialize the userList
//        userList = new ArrayList<>();
//        userList.add(new UserItem("User 1", "user1@webtel.in", "Unlicensed"));
//        userList.add(new UserItem("User 2", "user2@webtel.in", "Licensed"));
//        // Add more users as needed
//
//        UserAdapter adapter = new UserAdapter(getActivity(), userList);
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        recyclerView = view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Create a list of users (you can replace this with your actual data)
        List <User> userList = UserService.getUsers();

        // Create an adapter and set it to the RecyclerView
        UserAdapter userAdapter = new UserAdapter(userList);
        recyclerView.setAdapter(userAdapter);

        return view;
    }

}
