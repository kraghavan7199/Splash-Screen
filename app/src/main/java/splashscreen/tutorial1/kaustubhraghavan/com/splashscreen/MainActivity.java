package splashscreen.tutorial1.kaustubhraghavan.com.splashscreen;

/* Android  Project
Topic:Splash Screen
Author:Kaustubh Raghavan
 */


/*NOTE: This is the second activity      */
        import android.content.Intent;
        import android.os.Handler;
        import android.support.v7.app.ActionBarActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {



    /*This variable SPLASH_TIME is for the amount of time you want the Splash Screen
        to run. Its in Miliseconds, so you can set it to whatever time you want */
    private final int SPLASH_TIME=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     /* Its a Handler for the activity */
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

          /*I am creating a new intent here to start my first activity from this activity */
                Intent i=new Intent(MainActivity.this,MyActivity2s.class);
           /* Start the Activity */
                startActivity(i);

            }
        },SPLASH_TIME);
   /* Above I put the variable SPLASH_TIME, so it means that after the specified amount of
   miliseconds the intent starts ie The new Activity is opened
    */

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