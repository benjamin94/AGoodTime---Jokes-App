package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.content.Context;
import android.test.ApplicationTestCase;
import android.test.ServiceTestCase;

import com.example.benjamin.lize.myapplication.backend.myApi.MyApi;

import java.lang.reflect.Method;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    public void testEndpointsAsyncTask100RandomStringNotNull(){

        MyApi myApiService = null;

        for (int i = 0; i < 100; i++) {
            myApiService = EndpointsAsyncTask.connectToServerIfRequired();
            String result = EndpointsAsyncTask.getJoke(myApiService);
            assertTrue(result != null);
            assertTrue(!result.equals(""));
        }

    }

    private Context getTestContext()
    {
        try
        {
            Method getTestContext = ServiceTestCase.class.getMethod("getTestContext");
            return (Context) getTestContext.invoke(this);
        }
        catch (final Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
    }
}