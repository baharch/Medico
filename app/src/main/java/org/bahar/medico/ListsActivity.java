package org.bahar.medico;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListsActivity extends AppCompatActivity {
    ListView listview;
//    Student s1=new Student(101,"Sonoo",23);
    String [] mDrname = {"JAVA","Android","php","jQuery","JAVAScript","Python"};
    String [] mExpert = {"for Desktop","for Mobile","for Web","for Web to improve interFace","like jQuery","For desktop"};
    String [] imageurl = {"@drawable/profile","@drawable/profile","@drawable/profile","@drawable/profile","@drawable/profile","@drawable/profile"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lists);

        // Get intent data
        Intent mIntent = getIntent();
        int mPosition = mIntent.getExtras().getInt("category");

                listview = findViewById(R.id.activity_lists_listView_myList);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.layout_lists_card_view);
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new OnItemClickListener(){
        @Override
        public void onItemClick(AdapterView<?> MainActivity, View view, int position, long id) {
            Intent i = new Intent(ListsActivity.this,ShowActivity.class);
            i.putExtra("name",mDrname[position]);
            i.putExtra("expert",mExpert[position]);
            i.putExtra("image",imageurl[position]);
            startActivity(i);}

                                                }
                );
    }
}
