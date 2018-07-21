package com.example.nilen.mvpexampleone.model;


import com.example.nilen.mvpexampleone.contract.MainActivityContract;



public class MainActivityModel implements MainActivityContract.Model {

  @Override
  public String getData() {
    return "Hello World";
  }
}
