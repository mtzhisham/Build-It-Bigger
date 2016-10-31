package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.test.InstrumentationTestCase;

/**
 * Created by moataz on 30/10/16.
 */
public class JokesTaskTest extends AndroidTestCase {

    public void testVerifyResultNotEmpty(){


        comm.EndpointsAsyncTask endpointsAsyncTask = new comm.EndpointsAsyncTask();
       String response =  endpointsAsyncTask.doInBackground(getContext());
        //checks if the string is empty string
        //a blank - " " - string is non-empty so the test will pass
        //and will also pass if the returned response is error message
        assertTrue(!response.isEmpty());



    }



}
