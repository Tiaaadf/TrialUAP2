package org.example;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

class Contact {
    String name;
    String phone;
    String imagePath;

    public Contact(String name, String phone, String imagePath) {
        this.name = name;
        this.phone = phone;
        this.imagePath = imagePath;
    }
}

