package agri.com.retrofitplusrxjava;


import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by akash.sharma on 5/29/2018.
 */

public interface RetrofitApi {

    @GET("list_paging/")
    Observable<MenuBean> getMenu();
}
