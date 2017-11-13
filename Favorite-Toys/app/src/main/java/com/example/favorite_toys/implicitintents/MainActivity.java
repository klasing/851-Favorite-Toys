//package com.example.favorite_toys.implicitintents;
//
//import android.content.Intent;
//import android.net.Uri;
//import android.os.Bundle;
//import android.support.v4.app.ShareCompat;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.Toast;
//
//import com.example.favorite_toys.R;
//
//public class MainActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }
//
//    public void onClickOpenWebpageButton(View v) {
//        String urlAsString = "https://www.udacity.com";
//
//        openWebPage(urlAsString);
//    }
//
//    public void onClickOpenAddressButton(View v) {
//        //Toast.makeText(this, "TODO: Open a map when this button is clicked", Toast.LENGTH_SHORT).show();
//
//        String addressString = "1600 Amphitheatre Parkway, CA";
//
//        Uri.Builder builder = new Uri.Builder();
//        builder.scheme("geo")
//                .path("0,0")
//                .query(addressString);
//        Uri addressUri = builder.build();
//
//        showMap(addressUri);
//    }
//
//    public void onClickShareTextButton(View v) {
//        //Toast.makeText(this, "TODO: Share text when this is clicked", Toast.LENGTH_LONG).show();
//        String textThatYouWantToShare =
//                "Sharing the coolest thing I've learned so far. You should " +
//                        "check out Udacity and Google's Android Nanodegree!";
//
//        shareText(textThatYouWantToShare);
//    }
//
//    public void createYourOwn(View v) {
//        Toast.makeText(this,
//                "TODO: Create Your Own Implicit Intent",
//                Toast.LENGTH_SHORT)
//                .show();
//    }
//
//    private void openWebPage(String url) {
//        Uri webpage = Uri.parse(url);
//
//        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
//
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//        }
//    }
//
//    private void showMap(Uri geoLocation) {
//        Intent intent = new Intent(Intent.ACTION_VIEW);
//
//       intent.setData(geoLocation);
//
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//        }
//    }
//
//    private void shareText(String textToShare) {
//        String mimeType = "text/plain";
//
//        String title = "Learning How to Share";
//
//        ShareCompat.IntentBuilder
//                /* The from method specifies the Context from which this share is coming from */
//                .from(this)
//                .setType(mimeType)
//                .setChooserTitle(title)
//                .setText(textToShare)
//                .startChooser();
//    }
//}