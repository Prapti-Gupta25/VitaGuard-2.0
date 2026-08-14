# 🛡️ VitaGuard 2.0

### AI-Based Integrated Wearable Device for Real-Time Monitoring of Vital Parameters, Gas Exposure and Fatigue

**Team VitaGuard** • **Smart Kopargaon Hackathon** • **Hardware** • **Open Innovation**

**Monitor → Predict → Communicate → Protect**

---
Problem Statement ID - skhoi037
Problem Statement Title - AI-Based Integrated Wearable Device for Real Time Monitoring of
Vital Parameters, Gas Exposure and Fatigue
Theme - Open Innovation
PS Category- Software/Hardware -Hardware
Team ID - V9RK2F
Team Name - Team Vitaguard

---
## 🚨 The Problem

Workers in hazardous environments can face multiple risks at the same time:

| Hazard              | Risk                            |
| ------------------- | ------------------------------- |
| ☠️ **Gas Exposure** | Harmful gases such as CO        |
| 🌡️ **Heat**        | High temperature conditions     |
| ❤️ **Health**       | Abnormal vital parameters       |
| 🏃 **Motion**       | Falls and abnormal movement     |
| 🥱 **Fatigue**      | Reduced worker readiness        |
| 📡 **Connectivity** | Poor/no network in remote areas |

### The gap

Most existing safety systems focus on a single hazard or depend heavily on Wi-Fi, cellular networks or cloud infrastructure.

**VitaGuard brings multiple safety functions together in one wearable with off-grid communication.**

---

## 💡 Our Solution

**VitaGuard 2.0** is a forearm-mounted wearable designed to monitor:

🫀 **Worker Health**
Vital parameters and health-related information

🌡️ **Environment**
Gas exposure and temperature

🏃 **Movement**
Motion, falls and fatigue-related indicators

📡 **Communication**
Long-range LoRa communication with a base station

---

## ✨ Key Features

| Feature                        | What VitaGuard does                               |
| ------------------------------ | ------------------------------------------------- |
| 🫀 **Multi-Hazard Monitoring** | Vitals, gas, temperature, motion & fatigue        |
| 📊 **Dynamic Risk Score**      | 0–100 safety/risk indication                      |
| 🔮 **Predictive Alerts**       | Early warning when risk increases                 |
| 📡 **Off-Grid LoRa**           | Long-range communication without Wi-Fi            |
| 🚨 **Instant Alerts**          | Buzzer + haptic + supervisor notification         |
| 🛡️ **Smart Safety**           | Shift Readiness, Buddy System & Digital Black Box |

---

## ⚙️ How It Works

VitaGuard follows a simple monitoring and alert pipeline:

**👷 Worker**  
↓  
**📡 Sensors** — Gas • Vitals • Temperature • Motion  
↓  
**🧠 ESP32** — Data Collection & Processing  
↓  
**⚠️ Risk Assessment** — Risk Scoring & Analysis  
↓  
**🚨 Local Alert** — LoRa • Buzzer • Haptic  
↓  
**🏢 Base Station / Supervisor**

### Four Stages

**01 — Sense**  
Collect worker and environmental data through the connected sensors.

**02 — Process**  
The ESP32 receives and processes the sensor readings.

**03 — Assess**  
The system evaluates the collected data and generates a risk score. AI-based analysis is part of the planned enhancement.

**04 — Alert**  
When a risk is detected, the system triggers a local alert and sends the information toward the base station/supervisor.

---

## 🏗️ System Architecture

### 01 · Sensing Layer

Collects information from the worker and environment.

* Gas
* Temperature
* Vital parameters
* Motion

### 02 · Processing Layer

**ESP32** acts as the main controller and handles sensor data collection and processing.

### 03 · Communication Layer

**LoRa** provides long-range communication between the wearable and base station without depending on Wi-Fi or cloud connectivity.

### 04 · Alert & Monitoring Layer

Provides local alerts and communicates important information to the supervisor.

---

## 🔧 Technology Stack

### Hardware

| Component               | Purpose                     |
| ----------------------- | --------------------------- |
| **ESP32**               | Main controller             |
| **Gas Sensor**          | Gas exposure monitoring     |
| **Temperature Sensor**  | Heat/temperature monitoring |
| **Vital Sensors**       | Worker health monitoring    |
| **IMU / Motion Sensor** | Motion & fall detection     |
| **LoRa Module**         | Long-range communication    |
| **Buzzer**              | Audible warning             |
| **Haptic Motor**        | Wearable alert              |
| **3.7V Li-Po**          | Portable power              |

### Software

* **Embedded C/C++**
* **ESP32 development environment**
* **Sensor interfacing libraries**
* **LoRa communication libraries**
* **AI/ML-based risk assessment**

---

## 📦 Setup

### Hardware

Connect the ESP32, sensors, LoRa module and alert components according to the circuit diagram provided in the repository.

Before powering the system:

* Check all sensor connections
* Verify ESP32 connections
* Check LoRa connections
* Verify battery compatibility
* Ensure all components are securely connected

### Software

Clone the repository:

`
git clone https://github.com/<Prapti-Gupta25>/VitaGuard-2.0.git
cd VitaGuard-2.0


Then:

1. Install the required ESP32 development environment.
2. Install the libraries required by the source code.
3. Select the appropriate ESP32 board and port.
4. Configure the required sensor/LoRa parameters.
5. Upload the firmware to the ESP32.

---

## 🛠️ Current Implementation

The repository contains the source code and resources developed for the current VitaGuard prototype.

The implementation is being developed in modules so that individual components can be tested and integrated progressively.

### Current repository includes

* Sensor-related implementation
* ESP32 firmware
* Communication-related implementation
* Supporting project resources

> **Note:** The complete VitaGuard 2.0 concept represents the overall proposed system. The source code in this repository represents the features implemented by the team at the current stage.

---

## 🚀 Future Scope

* 🤖 Improved AI-based risk prediction
* 🥱 More accurate fatigue detection
* 🌡️ Additional environmental sensors
* 🔋 Better battery optimization
* 📡 GSM as backup communication
* ⛏️ Improved underground communication
* 🧪 Extensive field testing
* 🛡️ Safety certification
* 🏭 Integration with industrial safety systems
* 📊 Expanded base-station monitoring

---

## 🌍 Applications

VitaGuard can be adapted for:

**⛏️ Mining**
**🧪 Chemical Industries**
**🛢️ Oil & Gas**
**🏗️ Construction**
**⚡ Power Plants**
**🏭 Hazardous Industrial Workplaces**

---

## 👥 Team VitaGuard

| Member                 |
| ---------------------- |
| **Chanchal Mahalpure** |
| **Prapti Gupta**       |
| **Sandesh Mahajan**    |
| **Prathamesh Pawar**   |

**Institution:**
K.K. Wagh Institute of Engineering Education and Research, Nashik

**Hackathon:**
Smart Kopargaon Hackathon

---

## 📚 References

1. ILO Global Estimates on Occupational Safety, 2023–2025
2. NCRB — Accidental Deaths & Suicides in India (ADSI) Report, 2024
3. IndustriALL Global Union — India Workplace Accident Report, 2024
4. Safe in India Foundation — *CRUSHED* Report, 2025
5. Dilip Kumar et al. — ICFACT 2026, AI-Powered Wearable for Fatigue & Health Risk Detection
6. S. Sainath Rao & A. Yadav — BuildSEC 2025, Proactive Monitoring of Physiological Distress
7. Neha Gaud et al. — IEEE Sensors Journal 2025, FIBiLS: Fall Detection Using IMU + BiLSTM
8. S. Vimalnath et al. — ICICCS 2026, ESP32-Based Safety Monitoring for Coal Mine Workers
9. Yufei Fu et al. — ICIBA 2024, Intelligent Wearable for Power Distribution Operators
10. W. J. Benny et al. — GECOST 2024, Comprehensive IoT-Based Monitoring System
11. MarkWide Research — India Smart Wearable Market Report, 2026

---

### 🛡️ VitaGuard 2.0

**Monitor. Predict. Communicate. Protect.**
