package com.example.android.foodguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        ArrayList<FragmentWithTitle> fragmentList = new ArrayList<>();
        int category = getIntent().getIntExtra("Category", R.id.desserts);
        switch (category) {
            case R.id.desserts:
                //display the dessert category tabs
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.name), R.drawable.cake2, getString(R.string.preptime), getString(R.string.cooktime), getString(R.string.servings), getString(R.string.cake_ingredients), getString(R.string.steps)), "Cake"));
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.brownie_name), R.drawable.brownies, getString(R.string.brownie_cooktime), getString(R.string.brownie_preptime), getString(R.string.brownie_servings), getString(R.string.brownie_ingredients), getString(R.string.brownie_step)), "Brownies"));
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.parfait_name), R.drawable.parfait, getString(R.string.parfait_preptime), getString(R.string.parfait_cooktime), getString(R.string.parfait_servings), getString(R.string.parfait_ingredients), getString(R.string.parfait_steps)), "Parfait"));
                break;

            case R.id.Soup_Recipes:
                //display the fragment tabs for soup_recipes category
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.egusi_name), R.drawable.egusi, getString(R.string.egusi_cooktime), getString(R.string.egusi_preptime), getString(R.string.egusi_servings), getString(R.string.egusi_ingredients), getString(R.string.egusi_step1)), "Egusi Soup"));
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.edi_name), R.drawable.edika_ikong, getString(R.string.edi_cooktime), getString(R.string.edi_preptime), getString(R.string.edi_servings), getString(R.string.edi_ingredients), getString(R.string.edi_steps)), "Edikaikong Soup"));
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.soup_name), R.drawable.nsala, getString(R.string.soup_cooktime), getString(R.string.soup_preptime), getString(R.string.soup_servings), getString(R.string.soup_ingredients), getString(R.string.soup_steps)), "Ofe Nsala"));
                break;
            case R.id.Drinks:
                //displays the fragment tabs for drinks category
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.cocktail_name), R.drawable.cocktail, getString(R.string.cocktail_cooktime), getString(R.string.cocktail_preptime), getString(R.string.cocktail_servings), getString(R.string.cocktail_ingredients), getString(R.string.cocktail_steps)), "Cocktail"));
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.smoothie_name), R.drawable.smoothie, getString(R.string.smoothie_cooktime), getString(R.string.smoothie_preptime), getString(R.string.smoothie_servings), getString(R.string.smoothie_ingredients), getString(R.string.smoothie_steps)), "Smoothie"));
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.juice_name), R.drawable.juice, getString(R.string.juice_cooktime), getString(R.string.juice_preptime), getString(R.string.juice_servings), getString(R.string.juice_ingredients), getString(R.string.juice_steps)), "Fruit Juice"));
                break;

            //displays the fragment tabs for rice_recipes category
            case R.id.Rice_recipes:
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.jollof_name), R.drawable.jollof_rice, getString(R.string.jollof_cooktime), getString(R.string.jollof_preptime), getString(R.string.jollof_servings), getString(R.string.jollof_ingredients), getString(R.string.jollof_steps)), "Jollof Rice"));
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.friedrice_name), R.drawable.friedrice, getString(R.string.friedrice_cooktime), getString(R.string.friedrice_preptime), getString(R.string.friedrice_servings), getString(R.string.friedrice_ingredients), getString(R.string.friedrice_steps)), "Fried Rice"));
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.coconutrice_name), R.drawable.coconut_rice, getString(R.string.coconutrice_cooktime), getString(R.string.coconutrice_preptime), getString(R.string.coconutrice_servings), getString(R.string.coconutrice_ingredients), getString(R.string.coconutrice_steps)), "Coconut Rice"));
                break;

            //displays the fragment tabs for chicken category
            case R.id.chicken:
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.chicken_name), R.drawable.peppersoup, getString(R.string.chicken_cooktime), getString(R.string.chicken_preptime), getString(R.string.chicken_servings), getString(R.string.chicken_ingredients), getString(R.string.chicken_steps)), "Chicken Pepper Soup"));
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.shawarma_name), R.drawable.shawarma, getString(R.string.shawarma_cooktime), getString(R.string.shawarma_preptime), getString(R.string.shawarma_servings), getString(R.string.shawarma_ingredients), getString(R.string.shawarma_steps)), "Chicken Shawarma"));
                break;

            //displays the fragment tabs for salad category
            case R.id.salad:
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.coleslaw_name), R.drawable.coleslaw, getString(R.string.coleslaw_cooktime), getString(R.string.coleslaw_preptime), getString(R.string.coleslaw_servings), getString(R.string.coleslaw_ingredients), getString(R.string.coleslaw_steps)), "Coleslaw"));
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.africansalad_name), R.drawable.abacha, getString(R.string.africansalad_cooktime), getString(R.string.africansalad_preptime), getString(R.string.africansalad_servings), getString(R.string.africansalad_ingredients), getString(R.string.africansalad_steps)), "African Salad"));
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.fruitsalad_name), R.drawable.fruitsalad, getString(R.string.fruitsalad_cooktime), getString(R.string.fruitsalad_preptime), getString(R.string.fruitsalad_servings), getString(R.string.fruitsalad_ingredients), getString(R.string.fruitsalad_steps)), "Fruit Salad"));
                break;

            //displays the fragment tabs for cake_recipes category
            case R.id.cake_recipes:
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.vanillacake_name), R.drawable.vanillacake, getString(R.string.vanillacake_cooktime), getString(R.string.vanillacake_preptime), getString(R.string.vanillacake_servings), getString(R.string.vanillacake_ingredients), getString(R.string.vanillacake_steps)), "Vanilla Cake"));
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.name), R.drawable.cake2, getString(R.string.preptime), getString(R.string.cooktime), getString(R.string.servings), getString(R.string.cake_ingredients), getString(R.string.steps)), "Chocolate Cake"));
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.cake_name), R.drawable.pine_coco, getString(R.string.cake_cooktime), getString(R.string.cake_preptime), getString(R.string.cake_servings), getString(R.string.pineaplecake_ingredients), getString(R.string.pineaplecake_steps)), "pineaple coconut"));
                break;

            //displays the tabs for breakfast_recipes category
            case R.id.breakfast_recipes:
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.pancake_name), R.drawable.pancake, getString(R.string.pancake_cooktime), getString(R.string.pancake_preptime), getString(R.string.pancake_servings), getString(R.string.pancake_ingredients), getString(R.string.pancake_steps)), "PanCake"));
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.french_toast_name), R.drawable.french_toast, getString(R.string.french_toast_preptime), getString(R.string.french_toast_cooktime), getString(R.string.french_toast_servings), getString(R.string.french_toast_ingredients), getString(R.string.french_toast_steps)), "French Toast"));
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.sandwich_name), R.drawable.clubsandwich, getString(R.string.sandwich_cooktime), getString(R.string.sandwich_preptime), getString(R.string.sandwich_servings), getString(R.string.sandwich_ingredients), getString(R.string.sandwich_steps)), "Club Sandwich"));
                break;

            //displays the tabs for weight_loss category
            case R.id.weight_loss:
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.cabbage_name), R.drawable.cabbage_soup, getString(R.string.cabbage_cooktime), getString(R.string.cabbage_preptime), getString(R.string.cabbage_servings), getString(R.string.cabbage_ingredients), getString(R.string.cabbage_steps)), "Cabbage Soup"));
                break;

            //displays the fragment tabs that contains the content of the stew_recipes category
            case R.id.stew_recipes:
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.banga_name), R.drawable.banga_stew, getString(R.string.banga_cooktime), getString(R.string.banga_preptime), getString(R.string.banga_servings), getString(R.string.banga_ingredients), getString(R.string.banga_steps)), "Banga Stew"));
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.garden_egg_name), R.drawable.garden_egg_stew, getString(R.string.garden_egg_cooktime), getString(R.string.garden_egg_cooktime), getString(R.string.garden_egg_servings), getString(R.string.garden_egg_ingredients), getString(R.string.garden_egg_steps)), "Garden Egg Stew"));
                fragmentList.add(new FragmentWithTitle(BlankFragment.newInstance(getString(R.string.pepper_stew_name), R.drawable.pepperstew, getString(R.string.pepper_stew_cooktime), getString(R.string.pepper_stew_preptime), getString(R.string.gpepper_stew_servings), getString(R.string.pepper_stew_ingredients), getString(R.string.pepper_stew_steps)), "Pepper Stew"));
                break;
        }

        // Create an adapter that knows which fragment should be shown on each page
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager(), fragmentList);

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);

    }
}



