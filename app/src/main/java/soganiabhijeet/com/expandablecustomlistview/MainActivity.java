package soganiabhijeet.com.expandablecustomlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import soganiabhijeet.com.expandablecustomlistview.model.BaseListModel;
import soganiabhijeet.com.expandablecustomlistview.model.CategoriesModel;
import soganiabhijeet.com.expandablecustomlistview.model.TitleModel;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecylerviewAdapter adapter;
    public ArrayList<BaseListModel> listModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        listModels = new ArrayList<>();
        adapter = new RecylerviewAdapter(this, listModels);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


        adapter.notifyDataSetChanged();
        addDummyList();
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

    private void addDummyList() {
        //Boring stuff

//        TitleModel categoryTitle = new TitleModel();
//        categoryTitle.name = "Categories";
//        categoryTitle.children = new ArrayList<>();
//        categoryTitle.children.addAll(Arrays.asList(addDummyCategoryList()));
//        categoryTitle.isCurrentlyOpen = false;
//        categoryTitle.viewType = RecylerviewAdapter.HEADER;
//        listModels.add(categoryTitle);
        new TitleModel(listModels, "Categories", addDummyCategoryList());

        new TitleModel(listModels, "Cars", addDummyCarsList());


//        TitleModel carsTitle = new TitleModel();
//        carsTitle.name = "Cars";
//        carsTitle.children = new ArrayList<>();
//        carsTitle.children.addAll(Arrays.asList(addDummyCarsList()));
//        carsTitle.isCurrentlyOpen = false;
//        carsTitle.viewType = RecylerviewAdapter.HEADER;
//        listModels.add(carsTitle);

        new TitleModel(listModels, "Dummy", addDummyCarsList2());


        //withoutChild iteam for this portion
        new TitleModel(listModels,"WithOutChild....");

//        TitleModel foodTitle = new TitleModel();
//        foodTitle.name = "Foods";
//        foodTitle.children = new ArrayList<>();
//        foodTitle.isCurrentlyOpen = false;
//        foodTitle.viewType = RecylerviewAdapter.HEADER;
//        listModels.add(foodTitle);


        //store model is start from here

//
//        TitleModel storeTitle = new TitleModel();
//        storeTitle.name = "Stores";
//        storeTitle.children = new ArrayList<>();
//        storeTitle.children.addAll(Arrays.asList(addDummyStoreList()));
//        storeTitle.isCurrentlyOpen = false;
//        storeTitle.viewType = RecylerviewAdapter.HEADER;
//        listModels.add(storeTitle);


    }


    private CategoriesModel[] addDummyCategoryList() {
        CategoriesModel[] categoriesModels = new CategoriesModel[6];
        categoriesModels[0] = new CategoriesModel("(100)", "Apparel");
        categoriesModels[1] = new CategoriesModel("(70)", "Mobile");
        categoriesModels[2] = new CategoriesModel("(10)", "Travel");
        categoriesModels[3] = new CategoriesModel("(90)", "Home Appliances");
        categoriesModels[4] = new CategoriesModel("(15)", "Electronics");
        categoriesModels[5] = new CategoriesModel("(17)", "Cars");
        return categoriesModels;
    }


    private CategoriesModel[] addDummyCarsList() {
        CategoriesModel[] CarsModels = new CategoriesModel[6];
        CarsModels[0] = new CategoriesModel("(100)", "honda");
        CarsModels[1] = new CategoriesModel("(70)", "bajaj");
        CarsModels[2] = new CategoriesModel("(10)", "nikon");
        CarsModels[3] = new CategoriesModel("(90)", "Home Appliances");
        CarsModels[4] = new CategoriesModel("(15)", "Electronics");
        CarsModels[5] = new CategoriesModel("(17)", "Cars");
        return CarsModels;
    }


    private CategoriesModel[] addDummyCarsList2() {
        CategoriesModel[] CarsModels2 = new CategoriesModel[6];
        CarsModels2[0] = new CategoriesModel("(100)", "honda");
        CarsModels2[1] = new CategoriesModel("(70)", "bajaj");
        CarsModels2[2] = new CategoriesModel("(10)", "nikon");
        CarsModels2[3] = new CategoriesModel("(90)", "Home Appliances");
        CarsModels2[4] = new CategoriesModel("(15)", "Electronics");
        CarsModels2[5] = new CategoriesModel("(17)", "Cars");
        return CarsModels2;
    }

//
//    private StoreModel[] addDummyStoreList() {
//        StoreModel[] storeModels = new StoreModel[5];
//        storeModels[0] = new StoreModel(getResources().getDrawable(R.drawable.amazon), "10% off On Electronics", "Amazon");
//        storeModels[1] = new StoreModel(getResources().getDrawable(R.drawable.flipkart), "5% off On ICICI", "Flipkart");
//        storeModels[2] = new StoreModel(getResources().getDrawable(R.drawable.myntra), "10% off On Apparel", "Myntra");
//        storeModels[3] = new StoreModel(getResources().getDrawable(R.drawable.snapdeal), "10% off On Electronics", "Snapdeal");
//        storeModels[4] = new StoreModel(getResources().getDrawable(R.drawable.paytm), "10% cashback On Recharge", "Paytm");
//        return storeModels;
//    }
}
