package com.mainapp;

import garage.Factory;
import car.*;
public class Main {
    public static void main(String[] args) {


        Factory factory = new Factory();

        Bmw bmw = new Bmw();
        factory.factory(bmw);

        Ferrari ferrari = new Ferrari();
         factory.factory(ferrari);
        Nano nano = new Nano();
        factory.factory(nano);

        Thar thar = new Thar();
    factory.factory(thar);
        Alto alto = new Alto();
      factory.factory(alto);


    }
}