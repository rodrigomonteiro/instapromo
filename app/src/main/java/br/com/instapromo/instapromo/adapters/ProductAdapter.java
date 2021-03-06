package br.com.instapromo.instapromo.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.com.instapromo.instapromo.R;
import br.com.instapromo.instapromo.model.Product;

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder> {

    private LayoutInflater inflater;
    private List<Product> products;
    private Context context;

    public ProductAdapter(Context context, List<Product> products) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.products = products;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View timelineView = inflater.inflate(R.layout.product_layout, parent, false);
        return new ProductViewHolder(timelineView);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        Product product = products.get(position);
        holder.setImageUrl(context, product.getUrlImg());
        holder.setProductDesc(product.getDesc());
        holder.setProductPrice(product.getPreco());
        holder.setProductStore(product.getLocal());
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}
