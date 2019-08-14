package com.techcrevices.displaycontacts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyContactAdapter> {

    List<ContactModel> contactModels;

    public ContactAdapter(List<ContactModel> contactModels) {
        this.contactModels = contactModels;
    }

    @NonNull
    @Override
    public MyContactAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contact_list, parent, false);
        return new MyContactAdapter(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyContactAdapter holder, int position) {

        ContactModel contactModel = contactModels.get(position);
        holder.nameTv.setText(contactModel.getName());
        holder.mobileTv.setText(contactModel.getMobile());

    }

    @Override
    public int getItemCount() {
        return contactModels.size();
    }

    public class MyContactAdapter extends RecyclerView.ViewHolder{

        TextView nameTv;
        TextView mobileTv;

        public MyContactAdapter(@NonNull View itemView) {
            super(itemView);
            nameTv = (TextView)itemView.findViewById(R.id.nameTv);
            mobileTv = (TextView)itemView.findViewById(R.id.mobileTv);
        }
    }

}
