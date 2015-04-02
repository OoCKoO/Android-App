package com.example.androidhive;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BlackBoardActivity extends Activity {

	Button btnViewPosts;
	Button btnNewPost;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_blackboard);

		// Buttons
		btnViewPosts = (Button) findViewById(R.id.btnViewPosts);
		btnNewPost = (Button) findViewById(R.id.btnCreatePost);

		// view products click event
		btnViewPosts.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				// Launching All products Activity
				Intent i = new Intent(getApplicationContext(),
						AllPostsActivity.class);
				startActivity(i);

			}
		});

		// view products click event
		btnNewPost.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View view) {
				// Launching create new product activity
				Intent i = new Intent(getApplicationContext(),
						NewPostActivity.class);
				startActivity(i);

			}
		});
	}
}