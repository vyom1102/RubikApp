package com.example.project1;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.project1.userdetails.EditUserActivity;
import com.example.project1.util.ItemDecoration;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class UserDetail extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);

        RecyclerView recyclerView;
        List<UserActionItem> userActionItems;

        recyclerView = findViewById(R.id.recyclerView);
        int spaceInPixels = getResources().getDimensionPixelSize(R.dimen.space_dimen); // Specify your desired space here
        recyclerView.addItemDecoration(new ItemDecoration(spaceInPixels));
        userActionItems = new ArrayList<>();

        // Add user action items to the list
        userActionItems.add(new UserActionItem(R.drawable.baseline_key_24, "Reset Password", v -> onResetPasswordClick(v)));
        userActionItems.add(new UserActionItem(R.drawable.baseline_assignment_24, "Assign License", v -> onAssignLicenseClick(v)));
        userActionItems.add(new UserActionItem(R.drawable.baseline_block_24, "Block User", v -> onBlockUserClick(v)));
        userActionItems.add(new UserActionItem(R.drawable.baseline_person_remove_24, "Delete User", v -> onDeleteUserClick(v)));
        userActionItems.add(new UserActionItem(R.drawable.baseline_lock_person_24, "Multi-factor authentication", v -> onMultiFactorClick(v)));
        userActionItems.add(new UserActionItem(R.drawable.baseline_edit_24, "Edit User", v -> onEditUserClick(v)));
        userActionItems.add(new UserActionItem(R.drawable.baseline_assignment_ind_24, "User Role", v -> onUserRoleClick(v)));
        userActionItems.add(new UserActionItem(R.drawable.baseline_person_24, "View and Manage Groups", v -> onViewGroupClick(v)));


        UserActionAdapter adapter = new UserActionAdapter(this, userActionItems);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public class UserActionItem {
        private int iconResourceId;
        private String title;
        private View.OnClickListener onClickMethod;

        public UserActionItem(int iconResourceId, String title, View.OnClickListener onClickMethod) {
            this.iconResourceId = iconResourceId;
            this.title = title;
            this.onClickMethod = onClickMethod;
        }

        public int getIconResourceId() {
            return iconResourceId;
        }

        public String getTitle() {
            return title;
        }

        public View.OnClickListener getClickListener() {
            return onClickMethod;
        }
    }

    public class UserActionAdapter extends RecyclerView.Adapter<UserActionAdapter.ViewHolder> {

        private List<UserActionItem> userActionItems;
        private LayoutInflater inflater;

        public UserActionAdapter(Context context, List<UserActionItem> userActionItems) {
            this.inflater = LayoutInflater.from(context);
            this.userActionItems = userActionItems;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = inflater.inflate(R.layout.user_action_item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            UserActionItem item = userActionItems.get(position);
            holder.titleTextView.setText(item.getTitle());
            holder.iconImageView.setImageResource(item.getIconResourceId());
            holder.itemView.setOnClickListener(item.getClickListener());
        }

        @Override
        public int getItemCount() {
            return userActionItems.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            ImageView iconImageView;
            TextView titleTextView;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                iconImageView = itemView.findViewById(R.id.iconImageView);
                titleTextView = itemView.findViewById(R.id.titleTextView);
            }
        }
    }

    public void onResetPasswordClick(View view){
        // This method will be called when the ResetPassword is clicked
        startActivity(new Intent(UserDetail.this, ResetPassword.class));
    }

    public void onAssignLicenseClick(View view){
        startActivity(new Intent(UserDetail.this, EditUserActivity.class));
    }

    public void onBlockUserClick(View view){
        startActivity(new Intent(UserDetail.this, EditUserActivity.class));
    }

    public void onDeleteUserClick(View view){
        startActivity(new Intent(UserDetail.this, EditUserActivity.class));
    }

    public void onMultiFactorClick(View view){
        startActivity(new Intent(UserDetail.this, EditUserActivity.class));
    }

    public void onEditUserClick(View view){
        startActivity(new Intent(UserDetail.this, EditUserActivity.class));
    }

    public void onUserRoleClick(View view){
        startActivity(new Intent(UserDetail.this, EditUserActivity.class));
    }

    public void onViewGroupClick(View view){
        startActivity(new Intent(UserDetail.this, EditUserActivity.class));
    }
}
