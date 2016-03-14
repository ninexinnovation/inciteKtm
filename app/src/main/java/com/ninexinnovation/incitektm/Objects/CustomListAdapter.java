package com.ninexinnovation.incitektm.Objects;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.ninexinnovation.incitektm.OverPricingActivity;
import com.ninexinnovation.incitektm.R;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter implements View.OnClickListener {
    private Activity activity;
    private ArrayList data;
    private static LayoutInflater inflater=null;
    public Resources res;
    ListModel tempValues=null;
    int i=0;

    public CustomListAdapter(Activity a, ArrayList d, Resources resLocal) {

        activity = a;
        data=d;
        res = resLocal;

        inflater = (LayoutInflater)activity.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    public int getCount() {

        if(data.size()<=0)
            return 1;
        return data.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public static class ViewHolder{

        public TextView txtProfileName;
        public TextView txtProductName;
        public TextView txtLocation;
        public TextView txtRating;

    }

    /****** Depends upon data size called for each row , Create each ListView row *****/
    public View getView(int position, View convertView, ViewGroup parent) {

        View vi = convertView;
        ViewHolder holder;

        if(convertView==null){

            vi = inflater.inflate(R.layout.tabitem, null);

            holder = new ViewHolder();
            holder.txtProductName=(TextView) vi.findViewById(R.id.txtProductName);
            holder.txtProfileName=(TextView) vi.findViewById(R.id.txtProfileName);
            holder.txtLocation=(TextView) vi.findViewById(R.id.txtLocation);
            holder.txtRating=(TextView) vi.findViewById(R.id.txtRating);
            vi.setTag( holder );
        }
        else
            holder=(ViewHolder)vi.getTag();

        if(data.size()<=0)
        {
            holder.txtProfileName.setText("No Data");

        }
        else
        {
            tempValues=null;
            tempValues = ( ListModel ) data.get( position );

            holder.txtProfileName.setText(tempValues.getProfileName());
            holder.txtProductName.setText( tempValues.getProductName());
            holder.txtLocation.setText( tempValues.getLocation());
            holder.txtRating.setText( tempValues.getRating());


            /******** Set Item Click Listner for LayoutInflater for each row *******/

            vi.setOnClickListener(new OnItemClickListener( position ));
        }
        return vi;
    }

    @Override
    public void onClick(View v) {
        Log.v("Rumesh", "Row button clicked");
    }
    private class OnItemClickListener  implements View.OnClickListener {
        private int mPosition;

        OnItemClickListener(int position){
            mPosition = position;
        }

        @Override
        public void onClick(View arg0) {


            OverPricingActivity sct = (OverPricingActivity)activity;

            sct.onItemClick(mPosition);
        }
    }
}