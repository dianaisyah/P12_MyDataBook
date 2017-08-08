package democooldrawer.android.myapplicationdev.com.p12_mydatabook;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> drawerItems;
    private DrawerLayout drawerLayout;
    private ListView drawerList;
    ArrayAdapter<String> aa;
    String currentTitle;
    ActionBar ab;

    private ActionBarDrawerToggle drawerToggle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerList = (ListView) findViewById(R.id.left_drawer);

        drawerItems = new ArrayList<String>();
        drawerItems.add(0, "Bio");
        drawerItems.add(1, "Vaccination");
        drawerItems.add(2, "Anniversary");
        drawerItems.add(3, "About Us");

        ab = getSupportActionBar();

        aa = new CustomAdapter(this, R.layout.row, drawerItems);
        drawerList.setAdapter(aa);


    }
}
