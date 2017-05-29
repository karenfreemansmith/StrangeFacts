package com.microacademylabs.strangefacts;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

  private static final String KEY_FACT = "KEY_FACT";
  private static final String KEY_COLOR = "KEY_COLOR";
  private TextView mFactTextView;
  private ConstraintLayout mMainActivity;
  private Button mNextFactButton;
  private FactBook mFactBook = new FactBook();
  private ColorWheel mColorWheel = new ColorWheel();
  private String mFact = mFactBook.mFacts[0];
  private int mColor = Color.parseColor(mColorWheel.mColors[8]);
  private AdView mAdView;

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);

    outState.putString(KEY_FACT, mFact);
    outState.putInt(KEY_COLOR, mColor);
  }

  @Override
  protected void onRestoreInstanceState(Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);

    mFact = savedInstanceState.getString(KEY_FACT);
    mColor = savedInstanceState.getInt(KEY_COLOR);

    mFactTextView.setText(mFact);
    mMainActivity.setBackgroundColor(mColor);
    mNextFactButton.setTextColor(mColor);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    mAdView = (AdView) findViewById(R.id.adView);
    AdRequest adRequest = new AdRequest.Builder()
        .build();
    mAdView.loadAd(adRequest);

    mFactTextView = (TextView) findViewById(R.id.factTextView);
    mMainActivity = (ConstraintLayout) findViewById(R.id.main_layout);
    mNextFactButton = (Button) findViewById(R.id.nextFactButton);

    View.OnClickListener listener = new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        mFact = mFactBook.getFact();
        mColor = mColorWheel.getColor();
        mFactTextView.setText(mFact);
        mMainActivity.setBackgroundColor(mColor);
        mNextFactButton.setTextColor(mColor);
      }
    };
    mNextFactButton.setOnClickListener(listener);

  }

}
