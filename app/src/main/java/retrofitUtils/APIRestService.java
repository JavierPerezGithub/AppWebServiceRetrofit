package retrofitUtils;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by 21650521 on 15/01/2018.
 */

public interface APIRestService {
    public static final String BASE_URL = "https://pokeapi.co/api/v2/";

    @GET("pokemon/")
    Call<String> obtenerPokemon();
}
