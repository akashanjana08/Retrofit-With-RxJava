package agri.com.retrofitplusrxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

   CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         RetrofitApi retrofitApi = RetrofitClient.getInstance().create(RetrofitApi.class);

//        compositeDisposable.add(retrofitApi.getMenu()
//                              .subscribeOn(Schedulers.io())
//                              .observeOn(AndroidSchedulers.mainThread())
//                                .subscribe(new Consumer<MenuBean>() {
//                                    @Override
//                                    public void accept(MenuBean menuBean) throws Exception {
//
//                                       String data ="Daa";
//                                    }
//                                })
//
//        );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        compositeDisposable.clear();
    }
}
