package com.example.menno_000.mrpotatohead;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // Initiating variables
    ImageView Arms, Ears, Eyebrows, Eyes, Glasses, Hat, Mouth, Mustache, Nose, Shoes;


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

    // Overriding app settings so progress will be saved between swapping views
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


    // This function acts when a 'fully dress' button is clicked, and fully dresses Mr. Potatohead
    public void fullyDressedClicked(View v) {
        // Set the visibility of all objects
        Arms.setVisibility(View.VISIBLE);
        Ears.setVisibility(View.VISIBLE);
        Eyebrows.setVisibility(View.VISIBLE);
        Eyes.setVisibility(View.VISIBLE);
        Glasses.setVisibility(View.VISIBLE);
        Hat.setVisibility(View.VISIBLE);
        Mouth.setVisibility(View.VISIBLE);
        Mustache.setVisibility(View.VISIBLE);
        Nose.setVisibility(View.VISIBLE);
        Shoes.setVisibility(View.VISIBLE);

        // Assign each object to a new variable
        CheckBox armsOn = findViewById(R.id.armsBox);
        CheckBox earsOn = findViewById(R.id.earsBox);
        CheckBox eyebrowsOn = findViewById(R.id.eyebrowsBox);
        CheckBox eyesOn = findViewById(R.id.eyesBox);
        CheckBox glassesOn = findViewById(R.id.glassesBox);
        CheckBox hatOn = findViewById(R.id.hatBox);
        CheckBox mouthOn = findViewById(R.id.mouthBox);
        CheckBox mustacheOn = findViewById(R.id.mustacheBox);
        CheckBox noseOn = findViewById(R.id.noseBox);
        CheckBox shoesOn = findViewById(R.id.shoesBox);

        // Check the checkboxes of all objects
        armsOn.setChecked(true);
        earsOn.setChecked(true);
        eyebrowsOn.setChecked(true);
        eyesOn.setChecked(true);
        glassesOn.setChecked(true);
        hatOn.setChecked(true);
        mouthOn.setChecked(true);
        mustacheOn.setChecked(true);
        noseOn.setChecked(true);
        shoesOn.setChecked(true);
    }


    // This function acts when a 'undress' box is clicked, and fully undresses Mr. Potatohead
    public void potatoClicked(View v) {
        Arms.setVisibility(View.INVISIBLE);
        Ears.setVisibility(View.INVISIBLE);
        Eyebrows.setVisibility(View.INVISIBLE);
        Eyes.setVisibility(View.INVISIBLE);
        Glasses.setVisibility(View.INVISIBLE);
        Hat.setVisibility(View.INVISIBLE);
        Mouth.setVisibility(View.INVISIBLE);
        Mustache.setVisibility(View.INVISIBLE);
        Nose.setVisibility(View.INVISIBLE);
        Shoes.setVisibility(View.INVISIBLE);

        // Assign each object to a new variable
        CheckBox armsOff = findViewById(R.id.armsBox);
        CheckBox earsOff = findViewById(R.id.earsBox);
        CheckBox eyebrowsOff = findViewById(R.id.eyebrowsBox);
        CheckBox eyesOff = findViewById(R.id.eyesBox);
        CheckBox glassesOff = findViewById(R.id.glassesBox);
        CheckBox hatOff = findViewById(R.id.hatBox);
        CheckBox mouthOff = findViewById(R.id.mouthBox);
        CheckBox mustacheOff = findViewById(R.id.mustacheBox);
        CheckBox noseOff = findViewById(R.id.noseBox);
        CheckBox shoesOff = findViewById(R.id.shoesBox);

        // Uncheck the checkboxes of all objects
        armsOff.setChecked(false);
        earsOff.setChecked(false);
        eyebrowsOff.setChecked(false);
        eyesOff.setChecked(false);
        glassesOff.setChecked(false);
        hatOff.setChecked(false);
        mouthOff.setChecked(false);
        mustacheOff.setChecked(false);
        noseOff.setChecked(false);
        shoesOff.setChecked(false);
    }
}
