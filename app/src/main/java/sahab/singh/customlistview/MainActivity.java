package sahab.singh.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //This ia a array of custom datatype thatis MovieDataType ,we have to define a class and
        //than make object of it to use it as a datatype
        //in this arraylist
        ArrayList<MovieDataType> words=new ArrayList<>();

        //here we are adding data to above arraylist
        //with the help of passing new objects of MovieDataType class inline
        words.add(new MovieDataType("https://terrigen-cdn-dev.marvel.com/content/prod/1x/blackwidow_lob_crd_06.jpg","Avengers","20054"));
        words.add(new MovieDataType("https://terrigen-cdn-dev.marvel.com/content/prod/1x/blackwidow_lob_crd_06.jpg","Avengers","20054"));
        words.add(new MovieDataType("https://terrigen-cdn-dev.marvel.com/content/prod/1x/blackwidow_lob_crd_06.jpg","Avengers","20054"));
        words.add(new MovieDataType("https://terrigen-cdn-dev.marvel.com/content/prod/1x/blackwidow_lob_crd_06.jpg","Avengers","20054"));




        MovielistAdaptor itemsAdapter = new MovielistAdaptor(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}