# Shopping-Cart-Management-System
# 🛒 E-Commerce Shopping Cart System

![Java](https://img.shields.io/badge/Language-Java-orange?style=flat-square&logo=java)
![OOP](https://img.shields.io/badge/Architecture-OOP-blue?style=flat-square)
![License](https://img.shields.io/badge/License-MIT-green?style=flat-square)

A robust Object-Oriented Programming (OOP) Java application designed to simulate an online store's inventory management and interactive shopping cart system. It efficiently handles product categories, item stock tracking, order calculations, and stock exception handling[cite: 11, 16, 17].

---

## 🌟 Key Features

* **📦 Multi-Category Product Catalog:** Divided into `Clothing` (Shirts, Hats, Socks) and `Device` (Laptops, Printers, Projectors)[cite: 12, 13, 15, 18, 19, 20].
* **🛒 Dynamic Cart Management:** Add or remove items while automatically adjusting global store inventory.
* **🛡️ Inventory Control & Exception Handling:** Prevents purchasing items with zero available stock using custom runtime exceptions.
* **🏷️ Promotional Discount System:** Integrated `Discount` interface for specialized price reductions on eligible products.
* **📊 Live Analytics:** Tracks total items in cart, overall cost, and global instances created across the application[cite: 11, 16].

---

## 🏗️ Class Architecture Overview

```text
Item (Abstract Base Class)[cite: 16]
 ├── Closing (Abstract Class)
 │    ├── Shirt
 │    ├── Hat[cite: 15, 17]
 │    └── Socks
 └── Device (Abstract Class)
      ├── LapTop[cite: 18]
      ├── Projector[cite: 20]
      └── Printer (Implements Discount)[cite: 19]

Cart (Shopping Cart & Order Operations)[cite: 11]
