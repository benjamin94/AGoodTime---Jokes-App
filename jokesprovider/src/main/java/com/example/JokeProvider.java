package com.example;

public class JokeProvider {

    String[] mJokesz;

    public JokeProvider(){
        mJokesz = new String[10];
        populateArrayWithJokes();
    }

    public String getRandomJoke(){
        int jokePosition = (int) (Math.random()* mJokesz.length);
        return mJokesz[jokePosition];
    }

    public void populateArrayWithJokes(){

        mJokesz[0]= "Joke 0";
        mJokesz[1]= "Joke 1";
        mJokesz[2]= "Joke 2";
        mJokesz[3]= "Joke 3";
        mJokesz[4]= "Joke 4";
        mJokesz[5]= "Joke 5";
        mJokesz[6]= "Joke 6";
        mJokesz[7]= "Joke 7";
        mJokesz[8]= "Joke 8";
        mJokesz[9]= "Joke 9";

    }
}
