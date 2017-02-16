package nnk.com.fragmentexample3;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Naveen on 3/3/2016.
 */
public class MyItemsListFragment extends ListFragment
{
    String names[] = {"Wi-Fi","Admin","Fire","ABC","Remote","Logo","Drive","Signal"};

    int images[] ={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

       // View  v = inflater.inflate(R.layout.my_items_list,container,false);

       // Each row in the list stores country name, currency and flag
        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        for(int i=0;i<7;i++)
        {
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("img",Integer.toString(images[i]));
            hm.put("name",names[i]);
            aList.add(hm);
        }

        // Keys used in Hashmap
        String[] from = { "img","name"};

        // Ids of views in listview_layout
        int[] to = {R.id.img1,R.id.tv1};

        // Instantiating an adapter to store each items
        // R.layout.listview_layout defines the layout of each item
        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.my_items_list, from, to);

        setListAdapter(adapter);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
