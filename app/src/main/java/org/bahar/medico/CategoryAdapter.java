package org.bahar.medico;

import android.widget.BaseAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Bahar on 1/1/2018.
 */

public class CategoryAdapter extends BaseAdapter {
    private Context mContext;
    private final String[] string;
    private final int[] Imageid;

    public CategoryAdapter(Context c, String[] string, int[] Imageid ) {
        mContext = c;
        this.Imageid = Imageid;
        this.string = string;
    }

    @Override
    public int getCount() {
        return string.length;
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
       View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            grid = new View(mContext);
            grid = inflater.inflate(R.layout.layout_category_grid_view, null,false);
            TextView textView = grid.findViewById(R.id.gridview_text);
            ImageView imageView = grid.findViewById(R.id.gridview_image);
            textView.setText(string[p]);
            imageView.setImageResource(Imageid[p]);
        } else {
            grid = convertView;
        }

        return grid;
    }
}