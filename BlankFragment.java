package com.example.android.foodguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {

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

    public BlankFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment BlankFragment.
     */
    //  types and number of parameters
    public static BlankFragment newInstance(String name, int image, String preptime, String cooktime, String servings, String ingredients, String directions) {
        BlankFragment fragment = new BlankFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_cake, container, false);

        ImageView image = (ImageView) rootView.findViewById(R.id.dessert1);
        image.setImageResource(mImage);

        TextView nameText = (TextView) rootView.findViewById(R.id.cake);
        nameText.setText(mName);

        TextView preptime = (TextView) rootView.findViewById(R.id.text_view1);
        preptime.setText("Prep time\n\n" + mPrepTime);

        TextView cooktime = (TextView) rootView.findViewById(R.id.text_view2);
        cooktime.setText("Cook time\n\n" + mCookTime);

        TextView servings = (TextView) rootView.findViewById(R.id.text_view3);
        servings.setText("Servings\n\n" + mServings);

        TextView ingredients = (TextView) rootView.findViewById(R.id.text_view6);
        ingredients.setText(mIngredients);

        TextView directions = (TextView) rootView.findViewById(R.id.directions);
        directions.setText(mDirections);

        // Inflate the layout for this fragment
        return rootView;
    }
}
