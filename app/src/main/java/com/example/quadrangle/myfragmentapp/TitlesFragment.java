package com.example.quadrangle.myfragmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by quadrangle on 2016/01/07.
 */
public class TitlesFragment extends ListFragment{

    public static final String EXTRA_POSITION =
            "com.example.quadrangle.myfragmentapp.POSITION";

    public TitlesFragment(){}

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                News.Titles
        ));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent intent = new Intent(getActivity(), SubActivity.class);
        intent.putExtra(EXTRA_POSITION, position);
        startActivity(intent);
    }
}
