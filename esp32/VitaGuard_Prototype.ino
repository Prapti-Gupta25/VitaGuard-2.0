
#define BUZZER_PIN 25

float gasLevel = 120.0;
float temperature = 32.0;
float heartRate = 78.0;
float motionLevel = 0.2;

int calculateRiskScore() {
  int risk = 0;

  // Gas contribution
  if (gasLevel > 300)
    risk += 30;
  else if (gasLevel > 200)
    risk += 20;
  else if (gasLevel > 100)
    risk += 10;

  // Temperature contribution
  if (temperature > 45)
    risk += 25;
  else if (temperature > 38)
    risk += 15;

  // Heart-rate contribution
  if (heartRate > 120 || heartRate < 50)
    risk += 25;
  else if (heartRate > 100 || heartRate < 60)
    risk += 10;

  // Motion contribution
  if (motionLevel > 0.8)
    risk += 20;

  return min(risk, 100);
}

void setup() {
  Serial.begin(115200);

  pinMode(BUZZER_PIN, OUTPUT);
  digitalWrite(BUZZER_PIN, LOW);

  Serial.println("================================");
  Serial.println("       VitaGuard 2.0");
  Serial.println("    ESP32 Prototype Firmware");
  Serial.println("================================");
}

void loop() {

  int riskScore = calculateRiskScore();

  Serial.println("\n--- VitaGuard Monitoring ---");

  Serial.print("Gas Level: ");
  Serial.println(gasLevel);

  Serial.print("Temperature: ");
  Serial.print(temperature);
  Serial.println(" C");

  Serial.print("Heart Rate: ");
  Serial.print(heartRate);
  Serial.println(" BPM");

  Serial.print("Motion Level: ");
  Serial.println(motionLevel);

  Serial.print("Risk Score: ");
  Serial.print(riskScore);
  Serial.println("/100");

  if (riskScore >= 60) {
    Serial.println("WARNING: HIGH RISK DETECTED");

    digitalWrite(BUZZER_PIN, HIGH);
    delay(500);
    digitalWrite(BUZZER_PIN, LOW);
  }
  else {
    Serial.println("Status: SAFE");
  }

  delay(2000);
}
