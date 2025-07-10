/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ecommerce;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class CheckoutStorage {
     public static DefaultTableModel pesananModel = new DefaultTableModel(
        new Object[]{"Nama", "ID", "Nama Barang", "Qty", "Subtotal"}, 0
    );

    public static void simpanPesanan(String nama, DefaultTableModel keranjangModel) {
        for (int i = 0; i < keranjangModel.getRowCount(); i++) {
            Object id = keranjangModel.getValueAt(i, 0);
            Object namaBarang = keranjangModel.getValueAt(i, 1);
            Object qty = keranjangModel.getValueAt(i, 3);
            Object subTotal = keranjangModel.getValueAt(i, 4);

            pesananModel.addRow(new Object[]{nama, id, namaBarang, qty, subTotal});
        }
    }
}
