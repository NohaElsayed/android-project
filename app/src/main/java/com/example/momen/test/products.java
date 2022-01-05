package com.example.momen.test;

/**
 * Created by momen mohamed on 31/05/2018.
 */

public class products {
    private int _id;
    private String _productname;

    //Constructor 1.
    public products() {

    }

    //Constructor 2.
    public products(String _productname) {
        this._productname = _productname;
    }

    //Getters and setters.
    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_productname() {
        return _productname;
    }

    public void set_productname(String _productname) {
        this._productname = _productname;
    }

}
