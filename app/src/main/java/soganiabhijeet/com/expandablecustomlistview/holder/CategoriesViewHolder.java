package soganiabhijeet.com.expandablecustomlistview.holder;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import soganiabhijeet.com.expandablecustomlistview.RecylerviewAdapter;
import soganiabhijeet.com.expandablecustomlistview.R;
import soganiabhijeet.com.expandablecustomlistview.model.CategoriesModel;

/**
 * Created by abhijeetsogani on 2/27/16.
 */
public class CategoriesViewHolder extends BaseViewHolder<CategoriesModel> {
    private RecylerviewAdapter adapter;
    private TextView categoryTitle;
    private TextView categorySubText;

    public CategoriesViewHolder(View itemView, RecylerviewAdapter adapter) {
        super(itemView);
        categoryTitle = (TextView) itemView.findViewById(R.id.category_name);
        categorySubText = (TextView) itemView.findViewById(R.id.category_number);
        this.adapter = adapter;
    }

    @Override
    public void populate(CategoriesModel categoriesModel) {
        categoryTitle.setText(categoriesModel.name);
        categorySubText.setText(categoriesModel.noOffers);

    }

    @Override
    public void onClick(View v) {
        Log.e("CategoriesViewHolder", "position " + getAdapterPosition());
        adapter.onListItemClicked(getAdapterPosition());
    }
}
