 /*
  * Copyright (C) 2016 The Android Open Source Project
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at
  *
  *      http://www.apache.org/licenses/LICENSE-2.0
  *
  * Unless required by applicable law or agreed to in writing, software
  * distributed under the License is distributed on an "AS IS" BASIS,
  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  * See the License for the specific language governing permissions and
  * limitations under the License.
  */
 package com.example.android.miwok;

 import android.content.Intent;
 import android.os.Bundle;
 import android.widget.TextView;

 import androidx.appcompat.app.AppCompatActivity;

 public class MainActivity extends AppCompatActivity {

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);

         TextView numbers = findViewById(R.id.numbers);
         numbers.setOnClickListener(view -> {
             Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
             startActivity(numbersIntent);
         });

         TextView family = findViewById(R.id.family);
         family.setOnClickListener(view -> {
             Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
             startActivity(familyIntent);
         });

         TextView colors = findViewById(R.id.colors);
         colors.setOnClickListener(view -> {
             Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
             startActivity(colorsIntent);
         });

         TextView phrases = findViewById(R.id.phrases);
         phrases.setOnClickListener(view -> {
             Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
             startActivity(phrasesIntent);
         });
     }
 }
