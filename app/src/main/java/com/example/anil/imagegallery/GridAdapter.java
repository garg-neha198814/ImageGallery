package com.example.anil.imagegallery;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.ArrayList;

/**
 * Created by Edwin on 28/02/2015.
 */
public class GridAdapter extends RecyclerView.Adapter<GridAdapter.ViewHolder> {
    Context activity;
    private ArrayList<Integer> productDataList = new ArrayList<>();
    int position;
    private SharedPreferences pref;
    public GridAdapter(Context activity) {
        super();
        try {
            this.activity = activity;
            this.productDataList = productDataList;

        } catch (Exception e) {

        }


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.grid_item, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int i) {
        viewHolder.postProductImage.setImageResource(R.mipmap.ic_launcher);
        viewHolder.postProductImage1.setImageResource(R.mipmap.ic_launcher);
        viewHolder.postProductImage2.setImageResource(R.mipmap.ic_launcher);
       /* viewHolder.postProductName.setText(productDataList.get(i).getName());
        viewHolder.postProductPrice.setText("$"+productDataList.get(i).getPrice());
        Picasso.with(activity).load(UrlConstants.BASE_URL + productDataList.get(i).getProduct_images()).into(viewHolder.postProductImage);
        position = i;

        viewHolder.postProductImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pref.edit().putString(activity.getString(R.string.productTitle), "").apply();
                ProductActivity fragment = new ProductActivity(); //  object of next fragment
                Bundle bundle = new Bundle();
                bundle.putString("productid", productDataList.get(i).getProduct_id());
                bundle.putString("distance", productDataList.get(i).getDistance());

                fragment.setArguments(bundle);
                ((BaseActivity) activity).addFragmentWithBackStack(fragment, new ProductList());
            }
        });*/

    }

    @Override
    public int getItemCount() {

        return 10;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView postProductImage,postProductImage1,postProductImage2;
        public HorizontalScrollView horizontalview;


        public ViewHolder(final View itemView) {
            super(itemView);
            postProductImage = (ImageView) itemView.findViewById(R.id.imageView);
            postProductImage1 = (ImageView) itemView.findViewById(R.id.imageView1);
            postProductImage2 = (ImageView) itemView.findViewById(R.id.imageView2);
            horizontalview = (HorizontalScrollView) itemView.findViewById(R.id.hori_scroll);


        }
    }
}