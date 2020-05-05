package com.example.myapplication2;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitService {
    @GET("guestbooks")
    Single<GuestBook> getGuestBooks(@Query("start") int start);
}
