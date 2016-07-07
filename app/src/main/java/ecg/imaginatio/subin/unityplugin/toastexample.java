package ecg.imaginatio.subin.unityplugin;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by user on 7/7/2016.
 */
public class toastexample {
    private Context context;
    private static toastexample instance;

    public toastexample()
    {
        this.instance = this;
    }
    public  static toastexample instance()
    {
        instance = new toastexample();

        return instance;
    }
    public void setContext(Context context)
    {
        this.context = context;
    }
    public void showMessage(String message)
    {
        Toast.makeText(this.context,message,Toast.LENGTH_LONG).show();
    }
}
