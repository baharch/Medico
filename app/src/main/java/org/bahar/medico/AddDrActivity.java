package org.bahar.medico;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import io.realm.Realm;

public class AddDrActivity extends AppCompatActivity {
    private Button mAddButton,mCancelButton;
    private EditText mNameEditText,mFamilyEditText,mExpertEditText,mDescriptionEditText;
    private EditText mAddressEditText,mTelEditText,mWebEditText;
    private TextView mLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dr);
        findViews();
       Realm mRealm=Realm.getDefaultInstance();
       mAddButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               addRecord();

           }
       });


    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
//        Realm.close();
    }
    private void findViews(){
        mAddButton=findViewById(R.id.activity_add_dr_Button_add);
        mCancelButton=findViewById(R.id.activity_add_dr_Button_canecl);

        mNameEditText=findViewById(R.id.activity_add_dr_EditText_name);
        mFamilyEditText=findViewById(R.id.activity_add_dr_EditText_family);
        mExpertEditText=findViewById(R.id.activity_add_dr_EditText_expert);
        mDescriptionEditText=findViewById(R.id.activity_add_dr_EditText_description);
        mAddressEditText=findViewById(R.id.activity_add_dr_EditText_address);
        mTelEditText=findViewById(R.id.activity_add_dr_EditText_tel);
        mWebEditText=findViewById(R.id.activity_add_dr_EditText_web);
        mLog=findViewById(R.id.log_text);

    }
    private void addRecord(){

    }
}
