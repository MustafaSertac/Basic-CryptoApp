package service
import io.reactivex.Observer
import model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET
interface CryptoAPI {

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
//fun getData():Observer<List<CryptoModel>>
fun getData(): Call<List<CryptoModel>>


}