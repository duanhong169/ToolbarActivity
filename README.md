# ToolbarActivity
Extends the `ToolbarActivity` to get the toolbar and menu.

# Usage
Just extends the `ToolbarActivity` to bring the toolbar and menu to your activities:

```java
public class SecondActivity extends ToolbarActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        setTitle("Second Activity");
    }
}
```
