package nikhita.com.fragment123;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Naveen on 3/2/2016.
 */
public class ButtonFragment extends Fragment
{
    Button b1,b2;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.button_fragment_layout,container,false);

        b1 = (Button)v.findViewById(R.id.client_b);
        b2 = (Button)v.findViewById(R.id.admin_b);
        final Context c = v.getContext();
        b1.  setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                b1.setBackgroundColor(0000);
              FragmentManager fm = getFragmentManager();
              FragmentTransaction ft = fm.beginTransaction();
              ft.replace(R.id.fg1,new ClientFragment());
              ft.commit();
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.add(R.id.fg1,new AdminFragment());

                ft.commit();
            }
        });
        return v;
    }
}
