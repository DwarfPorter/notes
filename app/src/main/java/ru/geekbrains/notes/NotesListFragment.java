package ru.geekbrains.notes;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NotesListFragment extends Fragment {

    public static final String CURRENT_NOTE = "Currentnote";
    private NotesData currenteNote;    // Тек

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_notes_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initList(view);
    }

    private void initList(View view) {
        LinearLayout layoutView = (LinearLayout) view;
        String[] notes = getResources().getStringArray(R.array.notes);


        for (int i = 0; i < notes.length; i++) {
            String notesElement = notes[i];
            TextView tv = new TextView(getContext());
            tv.setText(notesElement);
            tv.setTextSize(30);
            layoutView.addView(tv);
           // tv.setClickable(true);
            final int index = i;
            tv.setOnClickListener(v -> {
                currenteNote= new NotesData(index,notesElement);

                Intent intent = new Intent();
                intent.setClass(getActivity(), SecondActivity.class);
                intent.putExtra(NotesDescripFragment.ARG_PARAM1,currenteNote );
                startActivity(intent);
            });
        }


    }
}