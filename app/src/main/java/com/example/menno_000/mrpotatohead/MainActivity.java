package com.example.menno_000.mrpotatohead;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // Initiating variables
    ImageView imageArms, imageEars, imageEyebrows, imageEyes, imageGlasses, imageHat, imageMouth,
            imageMustache, imageNose, imageShoes;
    CheckBox arms, ears, eyebrows, eyes, glasses, hat, mouth, mustache, nose, shoes;


    // Setting up basic functionality
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);

        // Setting variables to views in the application
        imageArms = findViewById(R.id.arms);
        imageEars = findViewById(R.id.ears);
        imageEyebrows = findViewById(R.id.eyebrows);
        imageEyes = findViewById(R.id.eyes);
        imageGlasses = findViewById(R.id.glasses);
        imageHat = findViewById(R.id.hat);
        imageMouth = findViewById(R.id.mouth);
        imageMustache = findViewById(R.id.mustache);
        imageNose = findViewById(R.id.nose);
        imageShoes = findViewById(R.id.shoes);

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

        // Setting up the listeners for the checkboxes
        findViewById(R.id.armsBox).setOnClickListener(new MainActivity.CheckboxListener());
        findViewById(R.id.earsBox).setOnClickListener(new MainActivity.CheckboxListener());
        findViewById(R.id.eyebrowsBox).setOnClickListener(new MainActivity.CheckboxListener());
        findViewById(R.id.eyesBox).setOnClickListener(new MainActivity.CheckboxListener());
        findViewById(R.id.glassesBox).setOnClickListener(new MainActivity.CheckboxListener());
        findViewById(R.id.hatBox).setOnClickListener(new MainActivity.CheckboxListener());
        findViewById(R.id.mouthBox).setOnClickListener(new MainActivity.CheckboxListener());
        findViewById(R.id.mustacheBox).setOnClickListener(new MainActivity.CheckboxListener());
        findViewById(R.id.noseBox).setOnClickListener(new MainActivity.CheckboxListener());
        findViewById(R.id.shoesBox).setOnClickListener(new MainActivity.CheckboxListener());

        // Setting up the listeners for the buttons
        findViewById(R.id.fullyDressed).setOnClickListener(new MainActivity.ButtonListener());
        findViewById(R.id.potato).setOnClickListener(new MainActivity.ButtonListener());
    }


    // Listener for the "Dress" and "Undress" buttons
    public class CheckboxListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            CheckBox checkbox = (CheckBox) view;
            Boolean check = checkbox.isChecked();

            // Get the right checkbox, and set the corresponding image
            switch (view.getId()) {
                case R.id.armsBox:
                    visibilitySetter(imageArms, check);
                    break;

                case R.id.earsBox:
                    visibilitySetter(imageEars, check);
                    break;

                case R.id.eyebrowsBox:
                    visibilitySetter(imageEyebrows, check);
                    break;

                case R.id.eyesBox:
                    visibilitySetter(imageEyes, check);
                    break;

                case R.id.glassesBox:
                    visibilitySetter(imageGlasses, check);
                    break;

                case R.id.hatBox:
                    visibilitySetter(imageHat, check);
                    break;

                case R.id.mouthBox:
                    visibilitySetter(imageMouth, check);
                    break;

                case R.id.mustacheBox:
                    visibilitySetter(imageMustache, check);
                    break;

                case R.id.noseBox:
                    visibilitySetter(imageNose, check);
                    break;

                case R.id.shoesBox:
                    visibilitySetter(imageShoes, check);
                    break;
            }
        }
    }


    // Listener for the "Dress" and "Undress" buttons
    public class ButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {

            switch(view.getId()) {
                case R.id.fullyDressed:
                    fullyDressedClicked();
                    break;
                case R.id.potato:
                    potatoClicked();
                    break;
            }
        }
    }


    // Overriding app settings so progress will be saved between swapping views
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // Get the visibility of each object
        Integer visibilityArms = imageArms.getVisibility();
        Integer visibilityEars = imageEars.getVisibility();
        Integer visibilityEyebrows = imageEyebrows.getVisibility();
        Integer visibilityEyes = imageEyes.getVisibility();
        Integer visibilityGlasses = imageGlasses.getVisibility();
        Integer visibilityHat = imageHat.getVisibility();
        Integer visibilityMouth = imageMouth.getVisibility();
        Integer visibilityMustache = imageMustache.getVisibility();
        Integer visibilityNose = imageNose.getVisibility();
        Integer visibilityShoes = imageShoes.getVisibility();

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
        imageArms.setVisibility(visibilitySaveArms);
        imageEars.setVisibility(visibilitySaveEars);
        imageEyebrows.setVisibility(visibilitySaveEyebrows);
        imageEyes.setVisibility(visibilitySaveEyes);
        imageGlasses.setVisibility(visibilitySaveGlasses);
        imageHat.setVisibility(visibilitySaveHat);
        imageMouth.setVisibility(visibilitySaveMouth);
        imageMustache.setVisibility(visibilitySaveMustache);
        imageNose.setVisibility(visibilitySaveNose);
        imageShoes.setVisibility(visibilitySaveShoes);
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
    public void fullyDressedClicked() {

        // Set the visibility of all views
        imageArms.setVisibility(View.VISIBLE);
        imageEars.setVisibility(View.VISIBLE);
        imageEyebrows.setVisibility(View.VISIBLE);
        imageEyes.setVisibility(View.VISIBLE);
        imageGlasses.setVisibility(View.VISIBLE);
        imageHat.setVisibility(View.VISIBLE);
        imageMouth.setVisibility(View.VISIBLE);
        imageMustache.setVisibility(View.VISIBLE);
        imageNose.setVisibility(View.VISIBLE);
        imageShoes.setVisibility(View.VISIBLE);

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
    public void potatoClicked() {

        // Set the visibility of all views
        imageArms.setVisibility(View.INVISIBLE);
        imageEars.setVisibility(View.INVISIBLE);
        imageEyebrows.setVisibility(View.INVISIBLE);
        imageEyes.setVisibility(View.INVISIBLE);
        imageGlasses.setVisibility(View.INVISIBLE);
        imageHat.setVisibility(View.INVISIBLE);
        imageMouth.setVisibility(View.INVISIBLE);
        imageMustache.setVisibility(View.INVISIBLE);
        imageNose.setVisibility(View.INVISIBLE);
        imageShoes.setVisibility(View.INVISIBLE);

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