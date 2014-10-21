package com.example.copperadmin.tabformation;

import android.os.AsyncTask;
import android.util.Log;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by Copper Admin on 10/20/2014.
 */
public class BackgroundWebRequest extends AsyncTask<String, Void, String> {

    private static final String TAG = "BackgroundWebRequest";

    @Override
    protected String doInBackground(String... url){

        Log.d(TAG, "Test 1");
        Response response = null;
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url[0])
                .build();
        Log.d(TAG, "Test 2");
        try {
            Log.d(TAG, "Test 3");
            response = client.newCall(request).execute();
            Log.d(TAG, response.body().toString());

            return response.body().string();

        } catch (IOException e) {
// TODO print out the error screen
            e.printStackTrace();
        }
        return null;
    }
    @Override
    protected void onPostExecute(String result) {

// TODO go to the list screen with the initial results
        Log.d(TAG, result);
    }
}
