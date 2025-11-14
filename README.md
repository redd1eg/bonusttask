# KMP String Searching Algorithm (Java)

Author: **Madyshev Dias**

This project implements the **Knuth–Morris–Pratt (KMP)** algorithm for efficient substring searching in Java. The implementation is written completely from scratch and includes search logic, LPS table construction, testing, and complexity analysis.

---

## 📌 Project Overview

The KMP algorithm allows fast pattern matching in **O(n + m)** time by avoiding redundant comparisons using the prefix (LPS) table. This project demonstrates how the algorithm behaves on short, medium, and long input texts.

---

## 📁 Project Structure

src/
└── algorithms/
├── KMP.java
└── Main.java
report/
└── KMP_Report.pdf
README.md

yaml
Копировать код

---

## 🚀 How to Run

1. Open the project in **IntelliJ IDEA**
2. Make sure **Java 17+** is installed
3. Run the file:

src/algorithms/Main.java

yaml
Копировать код

The program will run three tests:
- short string test
- medium string test
- long string test (hundreds of thousands of characters)

---

## 🧠 Example Usage

```java
KMP kmp = new KMP();
int result = kmp.search("ababcabcabab", "abc");
System.out.println("Matches found: " + result);
📊 Time & Space Complexity
Time Complexity

Build LPS table: O(m)

Search: O(n)

Total time: O(n + m)

Space Complexity

LPS array: O(m)

🧪 Testing Summary
Test Type	Text Length	Pattern	Goal
Short	~12 chars	"abc"	Validate basic correctness
Medium	~40 chars	"abcabc"	Show pattern overlaps
Long	~600,000 chars	"abcab"	Demonstrate linear scalability

KMP handled all tests efficiently with consistent linear performance.

📄 Report
The project report is included here:

Копировать код
report/KMP_Report.pdf
It contains:

algorithm explanation

implementation details

testing methodology

complexity analysis

🌐 GitHub Repository
Full project source code:
https://github.com/redd1eg/bonusttask

📬 Author
Madyshev Dias