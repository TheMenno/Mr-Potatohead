package com.example.menno_000.mrpotatohead;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // Initiating variables
    ImageView Arms, Ears, Eyebrows, Eyes, Glasses, Hat, Mouth, Mustache, Nose, Shoes;
    CheckBox arms, ears, eyebrows, eyes, glasses, hat, mouth, mustache, nose, shoes;


    // Setting up basic functionality
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        // Setting variables to views in the application
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

        // Setting variables to checkboxes in the application
        arms = findViewById(R.id.armsBox);
        ears = findViewById(R.id.earsBox);
        eyebrows = findViewById(R.id.eyebrowsBox);
        eyes = findViewById(R.id.eyesBox);
        glasses = findViewById(R.id.glassesBox);
        hat = findViewById(R.id.hatBox);
        mouth = findViewById(R.id.mouthBox);
        mustache = findViewById(R.id.mustacheBox);
        nose = findViewById(R.id.noseBox);
        shoes = findViewById(R.id.shoesBox);
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


    // Acts when a checkbox is clicked, and (re)sets the corresponding box visibility
    public void Clicked(View v) {
        CheckBox checkbox = (CheckBox) v;
        Boolean check = checkbox.isChecked();

        // Get the right checkbox, and set the corresponding image
        switch (v.getId()) {
            case R.id.armsBox:
                visibilitySetter(Arms, check);
                break;

            case R.id.earsBox:
                visibilitySetter(Ears, check);
                break;

            case R.id.eyebrowsBox:
                visibilitySetter(Eyebrows, check);
                break;

            case R.id.eyesBox:
                visibilitySetter(Eyes, check);
                break;

            case R.id.glassesBox:
                visibilitySetter(Glasses, check);
                break;

            case R.id.hatBox:
                visibilitySetter(Hat, check);
                break;

            case R.id.mouthBox:
                visibilitySetter(Mouth, check);
                break;

            case R.id.mustacheBox:
                visibilitySetter(Mustache, check);
                break;

            case R.id.noseBox:
                visibilitySetter(Nose, check);
                break;

            case R.id.shoesBox:
                visibilitySetter(Shoes, check);
                break;
        }
    }


    // Sets the visibility of view according to the value of checked
    public void visibilitySetter(ImageView view, Boolean checked) {
        if (checked) {
            view.setVisibility(View.VISIBLE);
        } else {
            view.setVisibility(View.INVISIBLE);
        }
    }


    // Acts when a 'fully dress' button is clicked, and fully dresses Mr. Potatohead
    public void fullyDressedClicked(View v) {

        // Set the visibility of all views
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

        // Check the corresponding checkboxes of all views
        arms.setChecked(true);
        ears.setChecked(true);
        eyebrows.setChecked(true);
        eyes.setChecked(true);
        glasses.setChecked(true);
        hat.setChecked(true);
        mouth.setChecked(true);
        mustache.setChecked(true);
        nose.setChecked(true);
        shoes.setChecked(true);
    }


    // Acts when a 'undress' box is clicked, and fully undresses Mr. Potatohead
    public void potatoClicked(View v) {

        // Set the visibility of all views
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

        // Uncheck the corresponding checkboxes of all views
        arms.setChecked(false);
        ears.setChecked(false);
        eyebrows.setChecked(false);
        eyes.setChecked(false);
        glasses.setChecked(false);
        hat.setChecked(false);
        mouth.setChecked(false);
        mustache.setChecked(false);
        nose.setChecked(false);
        shoes.setChecked(false);
    }
}