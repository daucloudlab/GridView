package kz.abcsoft.android.gridview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import kz.abcsoft.android.gridview.adapters.ProductAdapter;
import kz.abcsoft.android.gridview.models.Product;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Product> products = new ArrayList<Product>() ;
        products.add(new Product("Product #1", 22)) ;
        products.add(new Product("Product #2", 86)) ;
        products.add(new Product("Product #3", 78)) ;
        products.add(new Product("Product #4", 92)) ;
        products.add(new Product("Product #5", 18)) ;

        GridView gridView = (GridView)findViewById(R.id.gridView) ;
        gridView.setAdapter(new ProductAdapter(this, products));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
