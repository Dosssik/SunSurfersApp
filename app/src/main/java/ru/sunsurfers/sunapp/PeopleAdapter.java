package ru.sunsurfers.sunapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PeopleHolder>{

    List<SunsurferVM> list;

    public PeopleAdapter(List<SunsurferVM> list) {
        this.list = list;
    }

    @Override
    public PeopleHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PeopleHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(
                                R.layout.people_holder_item_view,
                                parent,
                                false)
        );
    }

    @Override
    public void onBindViewHolder(PeopleHolder holder, int position) {
        SunsurferVM sunsurfer = list.get(position);
        // TODO: 5/8/17 Bind
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class PeopleHolder extends RecyclerView.ViewHolder {


        public PeopleHolder(View itemView) {
            super(itemView);
        }
    }

}
