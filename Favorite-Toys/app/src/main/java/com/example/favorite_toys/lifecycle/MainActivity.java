//package com.example.favorite_toys.lifecycle;
//
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.util.Log;
//import android.view.View;
//import android.widget.TextView;
//
//import com.example.favorite_toys.R;
//
//import java.util.ArrayList;
//
//public class MainActivity extends AppCompatActivity {
//
//    private static final String TAG = MainActivity.class.getSimpleName();
//
//    private static final String LIFECYCLE_CALLBACKS_TEXT_KEY = "callbacks";
//
//    private static final String ON_CREATE = "onCreate";
//    private static final String ON_START = "onStart";
//    private static final String ON_RESUME = "onResume";
//    private static final String ON_PAUSE = "onPause";
//    private static final String ON_STOP = "onStop";
//    private static final String ON_RESTART = "onRestart";
//    private static final String ON_DESTROY = "onDestroy";
//    private static final String ON_SAVE_INSTANCE_STATE = "onSaveInstanceState";
//
//    private TextView mLifecycleDisplay;
//
//    private static final ArrayList<String> mLifecycleCallbacks = new ArrayList<>();
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        mLifecycleDisplay = (TextView) findViewById(R.id.tv_lifecycle_events_display);
//
//        if (savedInstanceState != null) {
//            if (savedInstanceState.containsKey(LIFECYCLE_CALLBACKS_TEXT_KEY)) {
//                String allPreviousLifecycleCallbacks = savedInstanceState
//                        .getString(LIFECYCLE_CALLBACKS_TEXT_KEY);
//                mLifecycleDisplay.setText(allPreviousLifecycleCallbacks);
//            }
//        }
//
//        for (int i = mLifecycleCallbacks.size() - 1; i >= 0; i--) {
//            mLifecycleDisplay.append(mLifecycleCallbacks.get(i) + "\n");
//        }
//
//        mLifecycleCallbacks.clear();
//
//        logAndAppend(ON_CREATE);
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        logAndAppend(ON_RESUME);
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//
//        logAndAppend(ON_PAUSE);
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//
//        logAndAppend(ON_STOP);
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//
//        logAndAppend(ON_RESTART);
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//
//        logAndAppend(ON_DESTROY);
//    }
//
//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//
//        logAndAppend(ON_SAVE_INSTANCE_STATE);
//
//        String lifecycleDisplayTextViewContents = mLifecycleDisplay.getText().toString();
//        outState.putString(LIFECYCLE_CALLBACKS_TEXT_KEY, lifecycleDisplayTextViewContents);
//    }
//
//    private void logAndAppend(String lifecycleEvent) {
//        Log.d(TAG, "Lifecycle Event: " + lifecycleEvent);
//
//        mLifecycleDisplay.append(lifecycleEvent + "\n");
//    }
//
//    public void resetLifecycleDisplay(View view) {
//        mLifecycleDisplay.setText("Lifecycle callbacks:\n");
//    }
//}