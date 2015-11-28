package com.test2.android.fontn;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    Context c;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Once the root view for the Fragment has been created, it's time to populate
        // the GridView with some dummy font

        // Create some dummy data for the GridView. Here's a sample char font:

        String[] alphabet = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K",
                "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
                "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g",
                "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
                "s", "t", "u", "v", "w", "x", "y", "z", "!", "#", "$",
                "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/",
                "[", "]", "^", "_", "`", "0", "1", "2", "3", "4", "5",
                "6", "7", "8", "9", ":", ";", "<", "=", ">", "?", "@",
                "{", "|", "}", "~"
        };


        List<String> dummychar = new ArrayList<String>(Arrays.asList(alphabet));

        // Now that we have some dummy char font, create an ArrayAdapter.
        // The ArrayAdapter will take data from a source (like our dummy font) and
        // use it to populate the GridView it's attached to.

        ArrayAdapter<String> mFontGridAdapter = new ArrayAdapter<String>(
                // The current context (this fragment's parent activity)
                getActivity(),
                // ID of grid char layout
                R.layout.grid_item_layout,
                // ID of the textview to populate
                R.id.grid_char_menu_textview,
                // Grid menu data
                dummychar);

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        // Get a reference to the GridView, and attach this adapter to it.
        GridView mygridview = (GridView) rootView.findViewById(R.id.gridcharview);
        mygridview.setAdapter(mFontGridAdapter);

        mygridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Toast.makeText(getActivity(),
                ((TextView) v).getText(), Toast.LENGTH_SHORT).show();

//                Intent i = new Intent(MainActivityFragment.this, MainDisplay.class);
//                i.putExtra("id", position);
//                startActivity(i);

            }
//                // Send intent to SingleViewActivity
//                Intent i = new Intent(MainActivity().this, MainDisplay.class);
//
//                // Pass image index
//                i.putExtra("id", position);
//                startActivity(i);
        });

        return rootView;




    }


}
