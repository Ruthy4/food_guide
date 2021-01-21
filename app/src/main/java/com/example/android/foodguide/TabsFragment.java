package com.example.android.foodguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TabsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TabsFragment extends Fragment {

    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_NAME = "name";
    private static final String ARG_IMAGE = "image";
    private static final String ARG_SERVINGS = "servings";
    private static final String ARG_PREP_TIME = "preptime";
    private static final String ARG_COOK_TIME = "cooktime";
    private static final String ARG_INGREDIENTS = "ingredients";
    private static final String ARG_DIRECTIONS = "directions";


    //  types of parameters
    private String mName;
    private int mImage;
    private String mServings;
    private String mPrepTime;
    private String mIngredients;
    private String mDirections;
    private String mCookTime;

    public TabsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment TabsFragment.
     */
    //  types and number of parameters
    public static TabsFragment newInstance(String name, int image, String preptime, String cooktime, String servings, String ingredients, String directions) {
        TabsFragment fragment = new TabsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_NAME, name);
        args.putInt(ARG_IMAGE, image);
        args.putString(ARG_PREP_TIME, preptime);
        args.putString(ARG_COOK_TIME, cooktime);
        args.putString(ARG_SERVINGS, servings);
        args.putString(ARG_INGREDIENTS, ingredients);
        args.putString(ARG_DIRECTIONS, directions);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mName = getArguments().getString(ARG_NAME);
            mImage = getArguments().getInt(ARG_IMAGE);
            mServings = getArguments().getString(ARG_SERVINGS);
            mPrepTime = getArguments().getString(ARG_PREP_TIME);
            mIngredients = getArguments().getString(ARG_INGREDIENTS);
            mDirections = getArguments().getString(ARG_DIRECTIONS);
            mCookTime = getArguments().getString(ARG_COOK_TIME);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_tabs, container, false);

        // Find the ImageView in the TabsFragment.xml layout with the ID image
        ImageView image = (ImageView) rootView.findViewById(R.id.image);
        image.setImageResource(mImage);

        // Find the TextView in the categoryActivity.xml layout with the ID name_text_view
        TextView nameText = (TextView) rootView.findViewById(R.id.name_text_view);
        nameText.setText(mName);

        // Find the TextView in the TabsFragment.xml layout with the ID Prep_time_text_view
        TextView preptime = (TextView) rootView.findViewById(R.id.prep_time_text_view);
        preptime.setText("Prep time\n\n" + mPrepTime);

        // Find the TextView in the TabsFragment.xml layout with the ID cook_time_text_view
        TextView cooktime = (TextView) rootView.findViewById(R.id.cook_time_text_view);
        cooktime.setText("Cook time\n\n" + mCookTime);

        // Find the TextView in the TabsFragment.xml layout with the ID servings_text_view
        TextView servings = (TextView) rootView.findViewById(R.id.servings_text_view);
        servings.setText("Servings\n\n" + mServings);

        // Find the TextView in the TabsFragment.xml layout with the ID ingredients_text_view
        TextView ingredients = (TextView) rootView.findViewById(R.id.ingredients_text_view);
        ingredients.setText(mIngredients);

        // Find the TextView in the TabsFragment.xml layout with the ID directions_text_view
        TextView directions = (TextView) rootView.findViewById(R.id.directions_text_view);
        directions.setText(mDirections);

        // Inflate the layout for this fragment
        return rootView;
    }
}
