package com.example.menno_000.mrpotatohead;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // Initiating variables
    ImageView Arms;
    ImageView Ears;
    ImageView Eyebrows;
    ImageView Eyes;
    ImageView Glasses;
    ImageView Hat;
    ImageView Mouth;
    ImageView Mustache;
    ImageView Nose;
    ImageView Shoes;


    // Setting up basic app settings
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        // Setting the variables to objects in the application
        Arms = findViewById(R.id.arms);
        Ears = findViewById(R.id.ears);
        Eyebrows = findViewById(R.id.eyebrows);
        Eyes = findViewById(R.id.eyes);
        Glasses = findViewById(R.id.glasses);
        Hat = findViewById(R.id.hat);
        Mouth = findViewById(R.id.mouth);
        Mustache = findViewById(R.id.mustache);
        Nose = findViewById(R.id.nose);
        Shoes = findViewById(R.id.shoes);
    }


    // Overriding app settings so progress will be saved between swapping views
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Get the visibility of each object
        Integer visibilityArms = Arms.getVisibility();
        Integer visibilityEars = Ears.getVisibility();
        Integer visibilityEyebrows = Eyebrows.getVisibility();
        Integer visibilityEyes = Eyes.getVisibility();
        Integer visibilityGlasses = Glasses.getVisibility();
        Integer visibilityHat = Hat.getVisibility();
        Integer visibilityMouth = Mouth.getVisibility();
        Integer visibilityMustache = Mustache.getVisibility();
        Integer visibilityNose = Nose.getVisibility();
        Integer visibilityShoes = Shoes.getVisibility();

        // Store the visibility of each object
        outState.putInt("VisibilityArms", visibilityArms);
        outState.putInt("VisibilityEars", visibilityEars);
        outState.putInt("VisibilityEyebrows", visibilityEyebrows);
        outState.putInt("VisibilityEyes", visibilityEyes);
        outState.putInt("VisibilityGlasses", visibilityGlasses);
        outState.putInt("VisibilityHat", visibilityHat);
        outState.putInt("VisibilityMouth", visibilityMouth);
        outState.putInt("VisibilityMustache", visibilityMustache);
        outState.putInt("VisibilityNose", visibilityNose);
        outState.putInt("VisibilityShoes", visibilityShoes);
    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        // Get the visibility of each object that was stored
        Integer visibilitySaveArms = inState.getInt("VisibilityArms");
        Integer visibilitySaveEars = inState.getInt("VisibilityEars");
        Integer visibilitySaveEyebrows = inState.getInt("VisibilityEyebrows");
        Integer visibilitySaveEyes = inState.getInt("VisibilityEyes");
        Integer visibilitySaveGlasses = inState.getInt("VisibilityGlasses");
        Integer visibilitySaveHat = inState.getInt("VisibilityHat");
        Integer visibilitySaveMouth = inState.getInt("VisibilityMouth");
        Integer visibilitySaveMustache = inState.getInt("VisibilityMustache");
        Integer visibilitySaveNose = inState.getInt("VisibilityNose");
        Integer visibilitySaveShoes = inState.getInt("VisibilityShoes");

        // Set the visibility of each object
        Arms.setVisibility(visibilitySaveArms);
        Ears.setVisibility(visibilitySaveEars);
        Eyebrows.setVisibility(visibilitySaveEyebrows);
        Eyes.setVisibility(visibilitySaveEyes);
        Glasses.setVisibility(visibilitySaveGlasses);
        Hat.setVisibility(visibilitySaveHat);
        Mouth.setVisibility(visibilitySaveMouth);
        Mustache.setVisibility(visibilitySaveMustache);
        Nose.setVisibility(visibilitySaveNose);
        Shoes.setVisibility(visibilitySaveShoes);

    }


    // This function acts when a checkbox is clicked, and (re)sets the corresponding box visibility
    public void Clicked(View v) {
        CheckBox checkbox = (CheckBox) v;
        Boolean check = checkbox.isChecked();

        switch (v.getId()) {
            case R.id.armsBox:
                if (check) {
                    Arms.setVisibility(View.VISIBLE);
                } else {
                    Arms.setVisibility(View.INVISIBLE);
                }
        }

        switch (v.getId()) {
            case R.id.earsBox:
                if (check) {
                    Ears.setVisibility(View.VISIBLE);
                } else {
                    Ears.setVisibility(View.INVISIBLE);
                }
        }

        switch (v.getId()) {
            case R.id.eyebrowsBox:
                if (check) {
                    Eyebrows.setVisibility(View.VISIBLE);
                } else {
                    Eyebrows.setVisibility(View.INVISIBLE);
                }
        }

        switch (v.getId()) {
            case R.id.eyesBox:
                if (check) {
                    Eyes.setVisibility(View.VISIBLE);
                } else {
                    Eyes.setVisibility(View.INVISIBLE);
                }
        }

        switch (v.getId()) {
            case R.id.glassesBox:
                if (check) {
                    Glasses.setVisibility(View.VISIBLE);
                } else {
                    Glasses.setVisibility(View.INVISIBLE);
                }
        }

        switch (v.getId()) {
            case R.id.hatBox:
                if (check) {
                    Hat.setVisibility(View.VISIBLE);
                } else {
                    Hat.setVisibility(View.INVISIBLE);
                }
        }

        switch (v.getId()) {
            case R.id.mouthBox:
                if (check) {
                    Mouth.setVisibility(View.VISIBLE);
                } else {
                    Mouth.setVisibility(View.INVISIBLE);
                }
        }

        switch (v.getId()) {
            case R.id.mustacheBox:
                if (check) {
                    Mustache.setVisibility(View.VISIBLE);
                } else {
                    Mustache.setVisibility(View.INVISIBLE);
                }
        }

        switch (v.getId()) {
            case R.id.noseBox:
                if (check) {
                    Nose.setVisibility(View.VISIBLE);
                } else {
                    Nose.setVisibility(View.INVISIBLE);
                }
        }

        switch (v.getId()) {
            case R.id.shoesBox:
                if (check) {
                    Shoes.setVisibility(View.VISIBLE);
                } else {
                    Shoes.setVisibility(View.INVISIBLE);
                }
        }
    }
}
