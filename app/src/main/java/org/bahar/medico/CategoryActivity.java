package org.bahar.medico;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {

    Toolbar mToolbar;
    CollapsingToolbarLayout mCollapsingToolbarLayoutAndroid;
    CoordinatorLayout mRootLayoutAndroid;
    GridView mGridView;
    Context mContext;
    ArrayList mArrayList;

    public static String[] gridViewStrings = {
            "دندانپزشک ",
            "پزشک عمومی",
            "متخصص آلرژی",
            "متخصص  داخلی",
            "متخصص  چشم",
            "متخصص  قلب و عروق",
            "متخصص  اعصاب و روان",
            "متخصص   پوست",
            "متخصص کودکان",
            "متخصص ارتوپدي",
            "متخصص  مغز و اعصاب",
            "متخصص اورولوژی",
            "متخصص  زنان و زایمان",
            "متخصص  رادیولوژی",
            " سایر تخصص ها"

    };
    public static int[] gridViewImages = {
            R.drawable.android_ic,
            R.drawable.android_ic,
            R.drawable.android_ic,
            R.drawable.android_ic,
            R.drawable.android_ic,
            R.drawable.android_ic,
            R.drawable.android_ic,
            R.drawable.android_ic,
            R.drawable.android_ic,
            R.drawable.android_ic,
            R.drawable.android_ic,
            R.drawable.android_ic,
            R.drawable.android_ic,
            R.drawable.android_ic,
            R.drawable.android_ic
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        findViews();

        setSupportActionBar(mToolbar);

        mGridView.setAdapter(new CategoryAdapter(this, gridViewStrings, gridViewImages));

        initInstances();

        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id){

                Intent mIntent = new Intent(getApplicationContext(), ListsActivity.class);

                mIntent.putExtra("category", position);
                startActivity(mIntent);

            }
        });


    }

    private void initInstances() {
        mCollapsingToolbarLayoutAndroid.setTitle("  دکتریاب  ");
    }

    private void findViews(){
        mToolbar =  findViewById(R.id.activityCategoryToolbar);
        mGridView =  findViewById(R.id.activityCategoryGridViewMain);
        mRootLayoutAndroid =  findViewById(R.id.activityCategoryCoordinatorLayout);
        mCollapsingToolbarLayoutAndroid = findViewById(R.id.activityCategoryCollapsingToolbarLayout);
    }
}