package nikhita.com.fragment123;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Naveen on 3/2/2016.
 */
public class HomeFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
       super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.home_fragment_layout, container, false);
        return  v;
    }
}
