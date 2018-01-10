package org.bahar.medico;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Bahar on 1/1/2018.
 */

public class ListsAdapter extends BaseAdapter {
    private Context mContext;
    private final String[] mDrName;
    private final String[] mExpert;
    private final int[] Imageid;

    public ListsAdapter(String[] mDrName, String[] mExpert, int[] Imageid) {
        //mContext = context;
        this.Imageid = Imageid;
        this.mDrName = mDrName;
        this.mExpert = mExpert;
    }

    @Override
    public int getCount() {
        return mDrName.length;
    }

    @Override
    public Object getItem(int p) {
        return null;
    }

    @Override
    public long getItemId(int p) {
        return 0;
    }

    @Override
    public View getView(int p, View convertView, ViewGroup parent) {
//        View cardview;
//        LayoutInflater inflater = (LayoutInflater) mContext
//                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//        if (convertView == null) {
        CardView cardview= new CardView(mContext);
            //cardview = new View(mContext);
        View row = LayoutInflater.from(cardview.getContext()).inflate(R.layout.layout_lists_card_view, null, false);

         //= lainflate(R.layout.layout_lists_card_view, null,false);
            TextView Drname_textview = cardview.findViewById(R.id.layout_list_textview_dr_name);
            TextView Expert_textView = cardview.findViewById(R.id.layout_list_textview_dr_degree);
            ImageView imageView = cardview.findViewById(R.id.layout_list_imageview_dr_pic);
            Drname_textview.setText(mDrName[p]);
            Expert_textView.setText(mExpert[p]);
            imageView.setImageResource(Imageid[p]);
//        } else {
//            cardview = convertView;
//        }

        return cardview;
    }

}
