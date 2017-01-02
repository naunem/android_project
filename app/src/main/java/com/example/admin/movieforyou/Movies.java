package com.example.admin.movieforyou;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

/**
 * Created by Admin on 12/24/2016.
 */

public class Movies {
    String id;
    String url;
    String imdb_code;
    String title;
    String title_english;
    String title_long;
    String slug;
    String year;
    String rating;
    String runtime;
    List<String> genres;
    String summary;
    String description_full;
    String synopsis;
    String yt_trailer_code;
    String language;
    String mpa_rating;
    String background_image;
    String background_image_original;
    String small_cover_image;
    String medium_cover_image;
    String large_cover_image;
    String state;

    public Movies(String title, String year) {
        this.title = title;
        this.year = year;
    }

    List<String> torrents;
    String date_uploaded;
    String date_uploaded_unix;

    public Movies(String id, String url, String imdb_code, String title, String title_english,
                  String title_long, String slug, String year, String rating, String runtime, List<String> genres,
                  String summary, String description_full, String synopsis, String yt_trailer_code,
                  String language, String mpa_rating, String background_image, String background_image_original,
                  String small_cover_image, String medium_cover_image, String large_cover_image, String state,
                  List<String> torrents, String date_uploaded, String date_uploaded_unix) {
        this.id = id;
        this.url = url;
        this.imdb_code = imdb_code;
        this.title = title;
        this.title_english = title_english;
        this.title_long = title_long;
        this.slug = slug;
        this.year = year;
        this.rating = rating;
        this.runtime = runtime;
        this.genres = genres;
        this.summary = summary;
        this.description_full = description_full;
        this.synopsis = synopsis;
        this.yt_trailer_code = yt_trailer_code;
        this.language = language;
        this.mpa_rating = mpa_rating;
        this.background_image = background_image;
        this.background_image_original = background_image_original;
        this.small_cover_image = small_cover_image;
        this.medium_cover_image = medium_cover_image;
        this.large_cover_image = large_cover_image;
        this.state = state;
        this.torrents = torrents;
        this.date_uploaded = date_uploaded;
        this.date_uploaded_unix = date_uploaded_unix;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImdb_code() {
        return imdb_code;
    }

    public void setImdb_code(String imdb_code) {
        this.imdb_code = imdb_code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_english() {
        return title_english;
    }

    public void setTitle_english(String title_english) {
        this.title_english = title_english;
    }

    public String getTitle_long() {
        return title_long;
    }

    public void setTitle_long(String title_long) {
        this.title_long = title_long;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription_full() {
        return description_full;
    }

    public void setDescription_full(String description_full) {
        this.description_full = description_full;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getYt_trailer_code() {
        return yt_trailer_code;
    }

    public void setYt_trailer_code(String yt_trailer_code) {
        this.yt_trailer_code = yt_trailer_code;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMpa_rating() {
        return mpa_rating;
    }

    public void setMpa_rating(String mpa_rating) {
        this.mpa_rating = mpa_rating;
    }

    public String getBackground_image() {
        return background_image;
    }

    public void setBackground_image(String background_image) {
        this.background_image = background_image;
    }

    public String getBackground_image_original() {
        return background_image_original;
    }

    public void setBackground_image_original(String background_image_original) {
        this.background_image_original = background_image_original;
    }

    public String getSmall_cover_image() {
        return small_cover_image;
    }

    public void setSmall_cover_image(String small_cover_image) {
        this.small_cover_image = small_cover_image;
    }

    public String getMedium_cover_image() {
        return medium_cover_image;
    }

    public void setMedium_cover_image(String medium_cover_image) {
        this.medium_cover_image = medium_cover_image;
    }

    public String getLarge_cover_image() {
        return large_cover_image;
    }

    public void setLarge_cover_image(String large_cover_image) {
        this.large_cover_image = large_cover_image;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<String> getTorrents() {
        return torrents;
    }

    public void setTorrents(List<String> torrents) {
        this.torrents = torrents;
    }

    public String getDate_uploaded() {
        return date_uploaded;
    }

    public void setDate_uploaded(String date_uploaded) {
        this.date_uploaded = date_uploaded;
    }

    public String getDate_uploaded_unix() {
        return date_uploaded_unix;
    }

    public void setDate_uploaded_unix(String date_uploaded_unix) {
        this.date_uploaded_unix = date_uploaded_unix;
    }
}