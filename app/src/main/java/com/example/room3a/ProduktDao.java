package com.example.room3a;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ProduktDao {

    @Insert
    void wstawProdukt(Produkt produkt);

    @Insert
    void wstawProdukty(List<Produkt> produkty);

    @Delete
    void usunProdukt(Produkt produkt);

    @Query("SELECT * FROM produkty")
    List<Produkt> pobierzWszystko();

    @Query("SELECT nazwa_prod FROM produkty WHERE cena< :cenka")
    List<String> nazwyProduktowTanszychNiz(int cenka);
}
