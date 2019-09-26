package com.farhanunnasih.notes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {

    private List<Notes> notesList = new ArrayList<>();

    public NotesAdapter(List<Notes> notesList) {
        this.notesList = notesList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_notes, parent, false);

        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Notes note = notesList.get(position);

        holder.tvDate.setText(note.getDate());
        holder.tvTitle.setText(note.getTitle());
        holder.tvDesc.setText(note.getDesc());
    }

    @Override
    public int getItemCount() {
        return notesList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvDate;
        public TextView tvTitle;
        public TextView tvDesc;
        public ViewHolder(View v) {
            super(v);

            tvDate = v.findViewById(R.id.notesItemDate);
            tvTitle = v.findViewById(R.id.notesItemTitle);
            tvDesc = v.findViewById(R.id.notesItemDesc);
        }
    }

}
