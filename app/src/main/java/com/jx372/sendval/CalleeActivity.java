package com.jx372.sendval;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CalleeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_callee );

        Intent intent = getIntent();
        int dataNumber = intent.getIntExtra( "data-number", -1 );
        String dataString = intent.getStringExtra( "data-string" );

        ((TextView)findViewById( R.id.textView3 )).
                setText( "data-number:" + dataNumber + "\ndata-string:" + dataString );
    }
}
