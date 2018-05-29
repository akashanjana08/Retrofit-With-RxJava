package agri.com.retrofitplusrxjava;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by akash.sharma on 5/29/2018.
 */

class RetrofitClient {
    private static Retrofit ourInstance ;
    private static String baseUrl="https://api.androidhive.info/";
    static Retrofit getInstance() {

        ourInstance = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(new OkHttpClient())
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();

        return ourInstance;
    }

    private RetrofitClient() {
    }
}
