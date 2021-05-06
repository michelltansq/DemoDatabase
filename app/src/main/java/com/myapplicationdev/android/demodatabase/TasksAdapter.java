package com.myapplicationdev.android.demodatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TasksAdapter extends ArrayAdapter<Task> {

    private ArrayList<Task> tasks;
    private Context context;
    private TextView tvID;
    private TextView tvDesc;
    private TextView tvDate;


    public TasksAdapter(Context context, int resource,
                        ArrayList<Task> objects) {
        super(context, resource, objects);
        this.tasks = objects;
        this.context = context;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent,
                false);

        tvID = rowView.findViewById(R.id.tvID);
        tvDesc = rowView.findViewById(R.id.tvDesc);
        tvDate = rowView.findViewById(R.id.tvDate);


        Task currTask = tasks.get(pos);
        tvID.setText(String.valueOf(currTask.getId()));
        tvDesc.setText(currTask.getDescription());
        tvDate.setText(currTask.getDate());

        return rowView;
    }
}