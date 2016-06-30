package com.rubik.applistview_musicjson;

    /**
     * Created by Rubik on 29/6/16.
     */
    public class Album {
        String artist;
        String tittle;
        String genre;
       // String coverURL;
        int image;
        String year;

        public Album(String artist, String tittle, String genre, int image, String year) {
            this.artist = artist;
            this.tittle = tittle;
            this.genre = genre;
            this.image = image;
            this.year = year;
        }

        public String getArtist() {
            return artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public String getTittle() {
            return tittle;
        }

        public void setTittle(String tittle) {
            this.tittle = tittle;
        }

        public String getGenre() {
            return genre;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public int getCoverURL() {
            return image;
        }

        public void setCoverURL(int image) {
            this.image = image;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }
    }
