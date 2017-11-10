package com.example.favorite_toys.datafrominternet;
/*
 * File -> Settings
 * Editor -> File and Code templates
 * select Class from list
 * enter following text in right window
 * #if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end #parse("File Header.java") public class ${NAME} { }
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.example.favorite_toys.R;

public class MainActivity extends AppCompatActivity {

    //private TextView mToysListTextView;
    private EditText mSearchBoxEditText;

    private TextView mUrlDisplayTextView;

    private TextView mSearchResultsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mToysListTextView = (TextView) findViewById(R.id.tv_toy_names);
//
//        String[] toyNames = ToyBox.getToyNames();
//
//        for (String toyName : toyNames) {
//            mToysListTextView.append(toyName + "\n\n\n");
//        }

        mSearchBoxEditText = (EditText) findViewById(R.id.et_search_box);

        mUrlDisplayTextView = (TextView) findViewById(R.id.tv_url_display);

        mSearchResultsTextView = (TextView) findViewById(R.id.tv_github_search_results_json);
    }
}
