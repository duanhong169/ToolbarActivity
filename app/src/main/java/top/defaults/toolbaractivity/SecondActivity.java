package top.defaults.toolbaractivity;

import android.os.Bundle;
import android.support.annotation.Nullable;

public class SecondActivity extends ToolbarActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Second Activity");
    }
}
