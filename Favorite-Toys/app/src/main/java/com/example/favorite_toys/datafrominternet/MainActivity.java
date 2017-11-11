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
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.favorite_toys.R;
import com.example.favorite_toys.datafrominternet.recyclerview.GreenAdapter;

//public class MainActivity extends AppCompatActivity {
public class MainActivity extends AppCompatActivity
        implements GreenAdapter.ListItemClickListener {

//    private EditText mSearchBoxEditText;
//
//    private TextView mUrlDisplayTextView;
//
//    private TextView mSearchResultsTextView;
//
//    private TextView mErrorMessageDisplay;
//
//    private ProgressBar mLoadingIndicator;

    private static final int NUM_LIST_ITEMS = 100;

    private GreenAdapter mAdapter;
    private RecyclerView mNumbersList;

    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mSearchBoxEditText = (EditText) findViewById(R.id.et_search_box);
//
//        mUrlDisplayTextView = (TextView) findViewById(R.id.tv_url_display);
//        mSearchResultsTextView = (TextView) findViewById(R.id.tv_github_search_results_json);
//
//        mErrorMessageDisplay = (TextView) findViewById(R.id.tv_error_message_display);
//
//        mLoadingIndicator = (ProgressBar) findViewById(R.id.pb_loading_indicator);

        mNumbersList = (RecyclerView) findViewById(R.id.rv_numbers);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mNumbersList.setLayoutManager(layoutManager);

        mNumbersList.setHasFixedSize(true);

        mAdapter = new GreenAdapter(NUM_LIST_ITEMS, this);//mAdapter = new GreenAdapter(NUM_LIST_ITEMS);
        mNumbersList.setAdapter(mAdapter);
    }

    @Override
    public void onListItemClick(int clickedItemIndex) {
        if (mToast != null) {
            mToast.cancel();
        }

        String toastMessage = "Item #" + clickedItemIndex + " clicked.";
        mToast = Toast.makeText(this, toastMessage, Toast.LENGTH_LONG);

        mToast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();

        switch (itemId) {
            case R.id.action_refresh:
                mAdapter = new GreenAdapter(NUM_LIST_ITEMS, this);//mAdapter = new GreenAdapter(NUM_LIST_ITEMS);
                mNumbersList.setAdapter(mAdapter);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

//    private void makeGithubSearchQuery() {
//        String githubQuery = mSearchBoxEditText.getText().toString();
//        URL githubSearchUrl = NetworkUtils.buildUrl(githubQuery);
//        mUrlDisplayTextView.setText(githubSearchUrl.toString());
//        new GithubQueryTask().execute(githubSearchUrl);
//    }
//
//    private void showJsonDataView() {
//        mErrorMessageDisplay.setVisibility(View.INVISIBLE);
//        mSearchResultsTextView.setVisibility(View.VISIBLE);
//    }
//
//    private void showErrorMessage() {
//        mSearchResultsTextView.setVisibility(View.INVISIBLE);
//        mErrorMessageDisplay.setVisibility(View.VISIBLE);
//    }

//    public class GithubQueryTask extends AsyncTask<URL, Void, String> {
//
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//            mLoadingIndicator.setVisibility(View.VISIBLE);
//        }
//
//        @Override
//        protected String doInBackground(URL... params) {
//            URL searchUrl = params[0];
//            String githubSearchResults = null;
//            try {
//                githubSearchResults = NetworkUtils.getResponseFromHttpUrl(searchUrl);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return githubSearchResults;
//        }
//
//        @Override
//        protected void onPostExecute(String githubSearchResults) {
//            mLoadingIndicator.setVisibility(View.INVISIBLE);
//            if (githubSearchResults != null && !githubSearchResults.equals("")) {
//                showJsonDataView();
//                mSearchResultsTextView.setText(githubSearchResults);
//            } else {
//                showErrorMessage();
//            }
//        }
//    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int itemThatWasClickedId = item.getItemId();
//        if (itemThatWasClickedId == R.id.action_search) {
//            makeGithubSearchQuery();
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
