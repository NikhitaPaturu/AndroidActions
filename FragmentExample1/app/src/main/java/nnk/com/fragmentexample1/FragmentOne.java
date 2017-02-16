package nnk.com.fragmentexample1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Naveen on 3/2/2016.
 */
public class FragmentOne extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater in,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        super.onCreateView(in, container, savedInstanceState);
        View v = in.inflate(R.layout.fragment_layout1, container, false);
        return v;
    }
}