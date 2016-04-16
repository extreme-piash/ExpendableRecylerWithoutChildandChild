package soganiabhijeet.com.expandablecustomlistview.model;

import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;

import soganiabhijeet.com.expandablecustomlistview.RecylerviewAdapter;

/**
 * Created by abhijeetsogani on 2/27/16.
 */
public class TitleModel extends BaseListModel implements View.OnClickListener {


    public TitleModel() {


    }

    public TitleModel(ArrayList<BaseListModel> listModels,String string, CategoriesModel[] list) {
        this.name = string;
        this.children = new ArrayList<>();
        this.children.addAll(Arrays.asList(list));
        this.isCurrentlyOpen = false;
        this.viewType = RecylerviewAdapter.HEADER;

        listModels.add(this);

    }

    public TitleModel(ArrayList<BaseListModel> listModels,String string) {
        this.name = string;
        this.children = new ArrayList<>();

        this.isCurrentlyOpen = false;
        this.viewType = RecylerviewAdapter.HEADER;

        listModels.add(this);

    }




    public String name;

    public ArrayList<BaseListModel> children;

    public Boolean isCurrentlyOpen;

    @Override
    public void onClick(View v) {

    }
}
