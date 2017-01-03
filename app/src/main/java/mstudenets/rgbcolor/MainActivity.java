package mstudenets.rgbcolor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    RGBColor color = new RGBColor();
    private final List<Integer> list = color.getGeneralList();
    GridView grid;
    GridView headerGrid;

    static final String[] labels = { "R", "G", "B" };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        headerGrid = (GridView) findViewById(R.id.headerID);
        ArrayAdapter headerAdapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, labels);
        headerGrid.setAdapter(headerAdapter);

        grid = (GridView) findViewById(R.id.grid);
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, list);
        grid.setAdapter(adapter);

        grid.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Toast.makeText(getApplicationContext(),
                ((TextView) v).getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}