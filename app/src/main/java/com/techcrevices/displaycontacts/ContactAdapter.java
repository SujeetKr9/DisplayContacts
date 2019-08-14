package com.techcrevices.displaycontacts;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.MyContactAdapter> {

    //ContactAdapter

    List<ContactModel> contactModels;
    Context context;

    public ContactAdapter(Context context, List<ContactModel> contactModels) {
        this.contactModels = contactModels;
        this.context = context;
    }

    @NonNull
    @Override
    public MyContactAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.contact_list, parent, false);
        return new MyContactAdapter(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyContactAdapter holder, final int position) {

        final ContactModel contactModel = contactModels.get(position);
        holder.nameTv.setText(contactModel.getName());
        holder.mobileTv.setText(contactModel.getMobile());

        holder.mobileTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context,Main2Activity.class);
                i.putExtra("listitem" , (Serializable) contactModels);
                i.putExtra("position", String.valueOf(position));
                context.startActivity(i);




            }
        });

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
