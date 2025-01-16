/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nhatbarry
 */
public class Main {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(900, 600);
        JTable t = new JTable();
        JButton refresh = new JButton("Lấy dữ liệu");
        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Họ tên");
                model.addColumn("Ngày sinh");
                model.addColumn("Địa chỉ");
                model.addColumn("Giới tính");
                model.addColumn("Mã nhân viên");
                model.addColumn("Hệ số lương");
                model.addColumn("Đơn vị");
                ArrayList<NhanVien> listnv = Utils.doc("nhanvien.dat");
                for (NhanVien nv : listnv) {
                    Object[] rowData = new Object[7];
                    rowData[0] = nv.getHoten();
                    rowData[1] = nv.getNgaysinh();
                    rowData[2] = nv.getDiachi();
                    rowData[3] = nv.getGioitinh();
                    rowData[4] = nv.getManv();
                    rowData[5] = nv.getHesoluong();
                    rowData[6] = nv.getDonvi();
                    model.addRow(rowData);
                }
                t.setModel(model);
            }

        });
        f.add(new JScrollPane(t), "Center");
        f.add(refresh, "South");
        f.setVisible(true);
    }
}
