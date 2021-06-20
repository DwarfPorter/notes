package ru.geekbrains.notes;

import android.os.Bundle;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class NotesDescripFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    protected static final String ARG_PARAM1 = "param1";

    // TODO: Rename and change types of parameters
    private NotesData notes;

    public NotesDescripFragment() {
        // Required empty public constructor
    }


    public static NotesDescripFragment newInstance(NotesData notesData) {
        NotesDescripFragment fragmentNotes = new NotesDescripFragment();
        Bundle args = new Bundle();
        args.putParcelable(ARG_PARAM1,notesData);
        fragmentNotes.setArguments(args);
        return fragmentNotes;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            notes = getArguments().getParcelable(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_notes_descrip, container, false);

        TextView caption = view.findViewById(R.id.caption);
        caption.setText(notes.getCaption());
//        TextView description = view.findViewById(R.id.description);
//        description.setText(notes.getDescription());
//        TextView date = view.findViewById(R.id.date);
//        date.setText(notes.getDate());

        return view;
    }
}