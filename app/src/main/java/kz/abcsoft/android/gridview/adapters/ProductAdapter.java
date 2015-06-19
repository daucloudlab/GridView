package kz.abcsoft.android.gridview.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import java.util.List;

import kz.abcsoft.android.gridview.models.Product;

public class ProductAdapter extends BaseAdapter{
    private Context context ;
    private List<Product> products ;

    public ProductAdapter(Context context, List<Product> products){
        this.context = context ;
        this.products = products ;
    }

    @Override
    public int getCount() {
        return products.size() ;
    }

    @Override
    public Object getItem(int i) {
        return products.get(i) ;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Button button ;
        if(view == null){
            button = new Button(context) ;
            button.setText(products.get(i).getName());
        } else {
            button = (Button)view ;
        }
        button.setId(i);

        return button ;
    }
}
