package com.example.custom_list_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_BaseAdpter extends BaseAdapter {
    private final Context mContext;
    private final String data[];
    private final int mImage;
    private final LayoutInflater mlayoutInflater;

    public Activity_BaseAdpter(Context context,String mdata[],int image)
    {
        this.data=mdata;
        this.mContext=context;
        this.mImage=image;
        mlayoutInflater= (LayoutInflater) this.mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View rootView;
        rootView=mlayoutInflater.inflate(R.layout.list_view_item,null);

        TextView mTextView=rootView.findViewById(R.id.textView);
        ImageView mImageView=rootView.findViewById(R.id.imageView);

        mTextView.setText(data[i]);
        mImageView.setImageResource(R.drawable.smile);

        return rootView;
    }
}
