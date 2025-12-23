# API & Web UI Test Automation Framework

## Deskripsi
Project ini merupakan automation testing framework untuk pengujian API dan Web UI.
Pengujian Web UI dilakukan pada website https://www.saucedemo.com/ dengan fokus pada fitur Login dan Cart menggunakan Selenium dan Cucumber.
Pengujian API dilakukan pada TheMealDB public API untuk menguji endpoint Get All Meals Categories dan Search Meal menggunakan RestAssured dan Cucumber.
Framework ini menerapkan pendekatan BDD dengan Cucumber serta menggunakan Page Object Model untuk meningkatkan keterbacaan dan maintainability kode.

---

## Teknologi yang Digunakan
- Bahasa Pemrograman Java
- Selenium WebDriver 
- Cucumber
- Gradle
- JUnit 

---

## Struktur Proyek
```text
src/
├── main/
│   ├── java/
│   └── resources/
│
└── test/
    ├── java/
    │   └── org/davinatw/
    │       ├── page/
    │       │   ├── LoginPage.java
    │       │   └── HomePage.java
    │       │
    │       ├── stepdef/
    │       │   ├── BaseTest.java
    │       │   ├── CucumberHooks.java
    │       │   ├── ApiHooks.java
    │       │   ├── LoginStepDef.java
    │       │   ├── HomeStepDef.java
    │       │   └── MealApiStepDef.java
    │       │
    │       └── CucumberTest.java
    │
    └── resources/
        ├── jsonSchema/
        │   ├── getAllMealsCategories.json
        │   └── searchMeal.json
        │
        ├── webUI/
        │   ├── login.feature
        │   └── cart.feature
        │
        └── api.feature

```

---

## Deskripsi Direktori Proyek

#### page
Berisi class Page Object Model untuk pengujian Web UI menggunakan Selenium.  
Setiap class merepresentasikan satu halaman web dan berisi locator serta aksi yang dapat dilakukan pada halaman tersebut.

- LoginPage.java menangani interaksi pada halaman login  
- HomePage.java menangani interaksi pada halaman utama dan fitur cart  

#### stepdef
Berisi Step Definition dan Hooks Cucumber.

- BaseTest.java mengelola konfigurasi WebDriver yang digunakan bersama  
- CucumberHooks.java menangani proses setup dan teardown browser untuk pengujian UI  
- ApiHooks.java menangani setup API seperti konfigurasi base URI RestAssured  
- LoginStepDef.java berisi implementasi langkah pengujian untuk fitur login  
- HomeStepDef.java berisi implementasi langkah pengujian untuk halaman utama dan cart  
- MealApiStepDef.java berisi implementasi langkah pengujian API TheMealDB  

#### resources/jsonSchema
Berisi file JSON Schema yang digunakan untuk memvalidasi struktur response API.

#### resources/webUI
Berisi file feature Gherkin untuk skenario pengujian Web UI.

- login.feature digunakan untuk menguji fungsi login  
- cart.feature digunakan untuk menguji fungsi cart  

#### resources/api.feature
Berisi file feature Gherkin untuk pengujian API menggunakan TheMealDB API.

#### CucumberTest.java
Berfungsi sebagai test runner Cucumber untuk menjalankan seluruh skenario pengujian Web UI dan API.

---

## Cara Menjalankan Test
- Menggunakan terminal
./gradlew clean test

- Menggunakan IntelliJ IDEA
1. Buka class CucumberTest
2. Klik tombol Run

---

## Hasil Report Test
<img width="1710" height="1107" alt="Screenshot 2025-12-23 at 10 21 02" src="https://github.com/user-attachments/assets/2de0ee77-f749-4e82-a183-401a9cc7a871" />

---

## Author
Davina Teresa Wijaya
