package com.test2.android.fontn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {


    // variables for image array
    private GridView mygridview;
    private GridviewAdapter gridViewAdapter;

    protected int myPosition;
    public int UNIQUE_INT_PER_CALL = 0;
    public List<String> dummychar;
    public List<String> dummypics;
    public static String[] alphabet = {
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

//    public static String[] images = {
//            "http://i00.i.aliimg.com/photo/v0/60178145604_1/2015Teda_wholesale_Letters_Capital_Alphabet.jpg_200x200.jpg",
//            "http://i00.i.aliimg.com/photo/v0/60178145604_1/2015Teda_wholesale_Letters_Capital_Alphabet.jpg_200x200.jpg",
//            "http://i00.i.aliimg.com/photo/v0/60178145604_1/2015Teda_wholesale_Letters_Capital_Alphabet.jpg_200x200.jpg",
//            "http://i00.i.aliimg.com/photo/v0/60178145604_1/2015Teda_wholesale_Letters_Capital_Alphabet.jpg_200x200.jpg",
//            "http://i00.i.aliimg.com/photo/v0/60178145604_1/2015Teda_wholesale_Letters_Capital_Alphabet.jpg_200x200.jpg",
//            "http://i00.i.aliimg.com/photo/v0/60178145604_1/2015Teda_wholesale_Letters_Capital_Alphabet.jpg_200x200.jpg",
//            "http://i00.i.aliimg.com/photo/v0/60178145604_1/2015Teda_wholesale_Letters_Capital_Alphabet.jpg_200x200.jpg",
//            "http://i00.i.aliimg.com/photo/v0/60178145604_1/2015Teda_wholesale_Letters_Capital_Alphabet.jpg_200x200.jpg",
//            "http://i00.i.aliimg.com/photo/v0/60178145604_1/2015Teda_wholesale_Letters_Capital_Alphabet.jpg_200x200.jpg",
//            "http://i00.i.aliimg.com/photo/v0/60178145604_1/2015Teda_wholesale_Letters_Capital_Alphabet.jpg_200x200.jpg",
//            "http://i00.i.aliimg.com/photo/v0/60178145604_1/2015Teda_wholesale_Letters_Capital_Alphabet.jpg_200x200.jpg",
//            "http://i00.i.aliimg.com/photo/v0/60178145604_1/2015Teda_wholesale_Letters_Capital_Alphabet.jpg_200x200.jpg"
//    };

    public int[] images = {
            R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box,
            R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box,
            R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box,
            R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box,
            R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box,
            R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box,
            R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box,
            R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box,
            R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box, R.drawable.squared_box,
    };

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Once the root view for the Fragment has been created, it's time to populate
        // the GridView with some dummy font

        int arrayCount = alphabet.length;

        dummychar = new ArrayList<String>(Arrays.asList(alphabet));
//        dummypics = new ArrayList<String>(Arrays.asList(images));

        // Now that we have some dummy char font, create an ArrayAdapter.
        // The ArrayAdapter will take data from a source (like our dummy font) and
        // use it to populate the GridView it's attached to.

        // ORIGINAL CODE FOR DUMMYCHAR

//        ArrayAdapter<String> mFontGridAdapter = new ArrayAdapter<String>(
//                // The current context (this fragment's parent activity)
//                getActivity(),
//                // ID of grid char layout
//                R.layout.grid_item_layout,
//                // ID of the textview to populate
//                R.id.grid_char_menu_textview,
//                // Grid menu data
//                dummychar);

//        ArrayAdapter<String> mFontGridAdapter = new ArrayAdapter<String>(
//                // The current context (this fragment's parent activity)
//                getActivity(),
//                // ID of grid char layout
//                R.layout.grid_image_layout,
//                // ID of the imageview to populate
//                R.id.grid_image_menu_imageview,
//                // Grid menu data
//                dummypics);



        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

//        mygridview = (GridView) rootView.findViewById(R.id.gridcharview);
//        mygridview.setAdapter(mFontGridAdapter);

        // Get a reference to the GridView, and attach this adapter to it.
        mygridview = (GridView) rootView.findViewById(R.id.gridcharview);
        gridViewAdapter = new GridviewAdapter(getActivity(), images);
        mygridview.setAdapter(gridViewAdapter);



        mygridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
//              Toast.makeText(getActivity(),
//                        ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(getActivity(), MainDisplay.class);
                i.putExtra("textSelected", ((TextView) v).getText());
                Log.v("i", i + " is your i");
                startActivity(i);
            }
        });


        return rootView;
    }
}
