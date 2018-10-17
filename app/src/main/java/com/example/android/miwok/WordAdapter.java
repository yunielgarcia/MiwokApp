package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    private static final String LOG_TAG = WordAdapter.class.getSimpleName();
    private int mColor;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param words A List of Words objects to display in a list
     */
    public WordAdapter(Context context, ArrayList<Word> words, int categoryColor) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, words);

        mColor = categoryColor;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.word_item_layout, parent, false);
        }



        listItemView.setBackgroundColor(getContext().getResources().getColor(mColor));

        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID english_word
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english_word);

        // Set the english version from the current word obj
        englishTextView.setText(currentWord.getmDefaultTranslation());


        // Find the TextView in the list_item.xml layout with the ID miwok_word
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_word);

        // Set the english version from the current word obj
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_for_word);

        if (currentWord.getmWordImageResourceId() != 0) {
            imageView.setImageResource(currentWord.getmWordImageResourceId());
        } else {
            imageView.setVisibility(View.GONE);
        }


        return listItemView;

    }


}
